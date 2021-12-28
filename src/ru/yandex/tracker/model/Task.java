package ru.yandex.tracker.model;

public class Task {

    private long id;
    private String name;

    public Task(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    // лучше оставить только get, чтобы не давать менять id
    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void update(Task other) {
        this.name = other.name;
    }
}
