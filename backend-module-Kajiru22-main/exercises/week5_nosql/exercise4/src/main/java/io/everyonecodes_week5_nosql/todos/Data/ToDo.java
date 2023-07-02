package io.everyonecodes_week5_nosql.todos.Data;

import java.util.Objects;

public class ToDo {

    private String id;
    private String title;
    private boolean done;

    public ToDo(String id, String title, boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isDone() {
        return done;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDo toDo = (ToDo) o;
        return done == toDo.done && Objects.equals(id, toDo.id) && Objects.equals(title, toDo.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, done);
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", done=" + done +
                '}';
    }
}
