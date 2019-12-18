package com.kodilla.patterns2.observer.homework;

public class Mentor implements HomeworkObserver{
    private final String name;
    private int count;

    public Mentor(String name) {
        this.name = name;
    }


    @Override
    public void update(HomeworkTopic homeworkTopic) {
        System.out.println(name + ": New task in topic " + homeworkTopic.getName());
        count++;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
