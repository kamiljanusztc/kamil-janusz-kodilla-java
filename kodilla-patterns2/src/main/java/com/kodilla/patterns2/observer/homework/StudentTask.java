package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTask implements TaskObservable {
    private final List<TaskObserver> taskObservers;
    private final List<String> tasks;
    private final String student;

    public StudentTask(String student) {
        taskObservers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.student = student;
    }

    public void sendFinishedTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(TaskObserver taskObserver) {
        taskObservers.add(taskObserver);
    }

    @Override
    public void notifyObservers() {
        for (TaskObserver taskObserver : taskObservers) {
            taskObserver.update(this);
        }
    }

    @Override
    public void removeObserver(TaskObserver taskObserver) {
        taskObservers.remove(taskObserver);
    }

    public List<TaskObserver> getTaskObservers() {
        return taskObservers;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getStudent() {
        return student;
    }
}
