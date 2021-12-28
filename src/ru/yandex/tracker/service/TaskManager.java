package ru.yandex.tracker.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import ru.yandex.tracker.model.Epic;
import ru.yandex.tracker.model.Subtask;
import ru.yandex.tracker.model.Task;

public class TaskManager {
    long newId = 0;
    public long getNewId() {
        return ++newId;
    }

    // подход 1 - общая для все мапа
    private HashMap<Long, Task> store;

    // подход 2 - отдельная мапа под каждый тип
    //private HashMap<Long, Epic> epics;
    //private HashMap<Long, Task> tasks;
    // нужен, если в эпике храним id, а не сами объекты подзадач
    //private HashMap<Long, Subtask> subtasks;


    public Collection<Epic> getEpics() {
        ArrayList<Epic> result = new ArrayList<>();
        for (Task task : store.values()) {
            if (task instanceof Epic) {
                result.add((Epic)task);
            }
        }
        return result;
    }

    public Collection<Task> getTask() {
        ArrayList<Task> result = new ArrayList<>();
        for (Task task : store.values()) {
            if (task.getClass() == Task.class) {
                result.add(task);
            }
        }
        return result;
    }

    public void update(Task task) {
        store.put(task.getId(), task);

    }

    /*

    public Collection<Epic> getEpics() {
        return epics.values();
    }

    public Collection<Task> getTasks() {
        return tasks.values();
    }

    public Collection<Subtask> getSubtasksByEpic(long epicId) {
        //TODO if... проверка на наличие ключа, null и т.д
        ArrayList<Long> ids = epics.get(epicId).getSubtasks();
        for (Long id : ids) {

        }
    }
    */

    public void add(Task task) {
        // вариант 1
        task.setId(getNewId());
        // вариант 2 - id уже заполнили вовне, используя наш getNewId().
        // Позволяет сделать id неизменяемым (убрать setId)
        // if... - проверки на наличие ключа и т.д
        store.put(1L, task);
    }

    public void remove(Long id) {
        store.remove(id);
    }
}
