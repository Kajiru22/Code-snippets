package io.everyonecodes_week5_nosql.todos.Endpoint;

import io.everyonecodes_week5_nosql.todos.Data.ToDo;
import io.everyonecodes_week5_nosql.todos.Service.ToDoManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todos")
public class ToDoEndpoint {

    private final ToDoManager toDoManager;

    public ToDoEndpoint(ToDoManager toDoManager) {
        this.toDoManager = toDoManager;
    }

    @GetMapping
    List<ToDo> getAll() {
        return toDoManager.getAll();
    }

    @GetMapping("/{id}")
    Optional<ToDo> getOne(@PathVariable String id) {
        return toDoManager.getOne(id);
    }

    @PostMapping
    ToDo post(@RequestBody ToDo toDo) {
        return toDoManager.post(toDo);
    }

    @PutMapping("/{id}/done")
    Optional<ToDo> markAsDone(@PathVariable String id) {
        return toDoManager.markAsDone(id);
    }

    @DeleteMapping("/{id}")
    Optional<ToDo> delete(@PathVariable String id) {
        return toDoManager.deleteOne(id);
    }
}
