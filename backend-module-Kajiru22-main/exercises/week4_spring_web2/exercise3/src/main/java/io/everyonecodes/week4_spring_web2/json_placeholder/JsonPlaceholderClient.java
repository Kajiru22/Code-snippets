package io.everyonecodes.week4_spring_web2.json_placeholder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class JsonPlaceholderClient {

    private final String url;
    private final PostTranslator translator;
    private final RestTemplate template;

    public JsonPlaceholderClient(@Value("${url}")String url, PostTranslator translator, RestTemplate template) {
        this.url = url;
        this.translator = translator;
        this.template = template;
    }

    public List<Post> getAll() {
        PostDTO[] response = template.getForObject(url, PostDTO[].class);
        return Arrays.stream(response).map(translator::postDTOToPost).collect(toList());
    }

    public Post getOne(String text) {
        String oneItemUrl = this.url + "/" + text;
        var post =  template.getForObject(oneItemUrl, PostDTO.class);
        return translator.postDTOToPost(post);
    }

    public void send(String message) {
        template.postForObject(url, message, Post.class);
    }

    public void replace(String text, String message) {
        String specificItemUrl = url + "/" + text;
        template.put(specificItemUrl, message);
    }

    public void deleteOne(String text) {
        String specificItemUrl = url + "/" + text;
        template.delete(specificItemUrl);
    }
}
