package com.kodilla.patterns2.observer.homework;

public interface HomeworkObservable {
    void addObserver(HomeworkObserver homeworkObserver);
    void notifyObservers();
}
