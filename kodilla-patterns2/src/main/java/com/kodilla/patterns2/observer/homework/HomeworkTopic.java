package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkTopic implements HomeworkObservable{
    private final List<HomeworkObserver> observers;
    private final List<String> tasks;
    private final String name;

    public HomeworkTopic(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }


    @Override
    public void addObserver(HomeworkObserver homeworkObserver) {
        observers.add(homeworkObserver);
    }

    @Override
    public void notifyObservers() {
        for(HomeworkObserver homeworkObserver: observers) {
            homeworkObserver.update(this);
        }
    }

    public List<HomeworkObserver> getObservers() {
        return observers;
    }

    public String getName() {
        return name;
    }
}
