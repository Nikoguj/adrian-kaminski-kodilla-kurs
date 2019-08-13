package com.kodilla.testing.forum.statistics;

public class StatisticsCal {
    private int usersCount;
    private int postCount;
    private int comCount;
    private double averagePostUser;
    private double averageComUser;
    private double averageComPost;

    public double getAveragePostUser() {
        return averagePostUser;
    }

    public double getAverageComUser() {
        return averageComUser;
    }

    public double getAverageComPost() {
        return averageComPost;
    }

    public StatisticsCal(Statistics statistics) {
        this.usersCount = statistics.usersNames().size();
        this.postCount = statistics.postsCount();
        this.comCount = statistics.commentsCount();
    }

    public void calculateAdvStatistics()
    {
        averagePostUser = postCount/usersCount;
        averageComUser = comCount/usersCount;
        averageComPost = comCount/postCount;
    }
}
