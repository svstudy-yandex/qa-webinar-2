package ru.yandex.tracker;

import ru.yandex.tracker.model.Task;
import ru.yandex.tracker.service.TaskManager;

public class Main {

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task t = new Task(1L);
        // тестируем manager
    }
}
