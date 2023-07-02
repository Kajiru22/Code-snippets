package io.everyonecodes.week4_spring_web2.json_placeholder;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostEndpoint {

    private final JsonPlaceholderClient client;

    public PostEndpoint(JsonPlaceholderClient client) {
        this.client = client;
    }

    @GetMapping
    public List<Post> getAll() {
        return client.getAll();
    }

    @GetMapping("/{id}")
    public Post getOne(@PathVariable String id) {
        return client.getOne(id);
    }

    @PostMapping
    public void post(@RequestBody String message) {
        client.send(message);
    }

    @PutMapping("/{id}")
    public void put(@RequestBody String message, @PathVariable String id) {
        client.replace(id, message);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        client.deleteOne(id);
    }
}
