package ru.yandex.tracker.model;

public class Subtask extends Task {
    private Long epicId;
    // private Epic epic;

    public Subtask(long id) {
        super(id);
    }

    public Long getEpicId() {
        return epicId;
    }
}
