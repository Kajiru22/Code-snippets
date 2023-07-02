package io.everyonecodes_week5_nosql.todos.Service;

import io.everyonecodes_week5_nosql.todos.Data.ToDo;
import io.everyonecodes_week5_nosql.todos.Repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoManager {

    private final ToDoRepository repository;

    public ToDoManager(ToDoRepository repository) {
        this.repository = repository;
    }

    public List<ToDo> getAll() {
        return repository.findAll();
    }

    public Optional<ToDo> getOne(String id) {
        return repository.findById(id);
    }

    public ToDo post(ToDo toDo) {
        return repository.save(toDo);
    }

    public Optional<ToDo> markAsDone(String id) {
        Optional<ToDo> optionalToDo = getOne(id);
        if (optionalToDo.isPresent()) {
            ToDo toDo = optionalToDo.get();
            toDo.setDone(true);
            return Optional.of(repository.save(toDo));
        } else {
            return Optional.empty();
        }
    }

    public Optional<ToDo> deleteOne(String id) {
        repository.deleteById(id);
        return repository.findById(id);
    }
}