package io.everyonecodes.week4_spring_web2.json_placeholder;

import org.springframework.stereotype.Service;

@Service
public class PostTranslator {


    public PostDTO postToDTO(Post post) {
        PostDTO postDTO = new PostDTO();
        postDTO.setTitle(post.getTitle());
        postDTO.setBody(post.getContent());
        postDTO.setUserId(post.getUser());
        postDTO.setId(postDTO.getId());
        return postDTO;
    }

    public Post postDTOToPost(PostDTO postDTO) {
        Post post = new Post();
        post.setTitle(postDTO.getTitle());
        post.setContent(postDTO.getBody());
        post.setUser(postDTO.getUserId());
        post.setIdentifier(postDTO.getId());
        return post;
    }
}
