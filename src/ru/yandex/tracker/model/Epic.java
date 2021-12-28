package ru.yandex.tracker.model;

import java.util.ArrayList;

public class Epic extends Task {
    public Epic(long id) {
        super(id);

    }

    public ArrayList<Long> getSubtasks() {
        return subtasks;
    }

    private ArrayList<Long> subtasks;
    // private ArrayList<Subtask> subtasks;

    // пример, когда может пригодится super
    @Override
    public void update(Task other) {
        super.update(other);
        Epic otherEpic = (Epic) other;
        this.subtasks = otherEpic.subtasks;
    }
}
