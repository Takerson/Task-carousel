package com.epam.rd.autotasks;

import java.util.ArrayList;
import java.util.List;

public class TaskCarousel {
    private final int CAPACITY;
    private int taskSpinCounter = 0;
    private final List<Task> taskList = new ArrayList<>();

    public TaskCarousel(int capacity) {
        if (capacity < 0) {
            throw new UnsupportedOperationException();
        }
        this.CAPACITY = capacity;
    }

    public boolean addTask(Task task) {
        if (!isFull() && !task.isFinished()) {
            taskList.add(task);
            return true;
        }
        return false;
    }

    public boolean execute() {
        if (isEmpty()) {
            return false;
        }
        rewriteSpinCounter();
        taskList.get(taskSpinCounter).execute();
        if (taskList.get(taskSpinCounter).isFinished()) {
            taskList.remove(taskSpinCounter);
        } else {
            taskSpinCounter++;
        }
        return true;
    }

    public boolean isFull() {
        return taskList.size() == CAPACITY;
    }

    public boolean isEmpty() {
        return taskList.size() == 0;
    }

    private void rewriteSpinCounter() {
        if (taskSpinCounter >= taskList.size()) taskSpinCounter = 0;
    }

}
//public class TaskCarousel {
//
//    public TaskCarousel(int capacity) {
//        throw new UnsupportedOperationException();
//    }
//
//    public boolean addTask(Task task) {
//        throw new UnsupportedOperationException();
//    }
//
//    public boolean execute() {
//        throw new UnsupportedOperationException();
//    }
//
//    public boolean isFull() {
//        throw new UnsupportedOperationException();
//    }
//
//    public boolean isEmpty() {
//        throw new UnsupportedOperationException();
//    }
//
//}
