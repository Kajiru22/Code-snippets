package io.everyonecodes_week5_nosql.todos.Repository;

import io.everyonecodes_week5_nosql.todos.Data.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo, String> {
}
