package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalTestSuite {
    @Test
    public void testStatisticsCal0Post()
    {
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNames = new ArrayList<String>();
        usersNames.add("User");
        int post = 0;
        int com = 1;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(com);

        StatisticsCal statisticsCal = new StatisticsCal(statisticsMock);

        statisticsCal.calculateAdvStatistics();

        Assert.assertEquals(1, statisticsCal.getAveragePostUser(), 0.5);
    }

    @Test
    public void testStatisticsCal1000Post()
    {
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNames = new ArrayList<String>();
        usersNames.add("User");
        int post = 1000;
        int com = 1;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(com);

        StatisticsCal statisticsCal = new StatisticsCal(statisticsMock);

        statisticsCal.calculateAdvStatistics();

        Assert.assertEquals(1000, statisticsCal.getAveragePostUser(), 0.5);
    }

    @Test
    public void testStatisticsCal0Com()
    {
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNames = new ArrayList<String>();
        usersNames.add("User");
        int post = 1;
        int com = 0;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(com);

        StatisticsCal statisticsCal = new StatisticsCal(statisticsMock);

        statisticsCal.calculateAdvStatistics();

        Assert.assertEquals(0, statisticsCal.getAverageComPost(), 0.5);
    }

    @Test
    public void testStatisticsCalComLessPost()
    {
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNames = new ArrayList<String>();
        usersNames.add("User");
        int post = 100;
        int com = 50;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(com);

        StatisticsCal statisticsCal = new StatisticsCal(statisticsMock);

        statisticsCal.calculateAdvStatistics();

        Assert.assertEquals(0, statisticsCal.getAverageComPost(), 0.5);
    }

    @Test
    public void testStatisticsCalComMorePost()
    {
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNames = new ArrayList<String>();
        usersNames.add("User");
        int post = 50;
        int com = 200;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(com);

        StatisticsCal statisticsCal = new StatisticsCal(statisticsMock);

        statisticsCal.calculateAdvStatistics();

        Assert.assertEquals(4, statisticsCal.getAverageComPost(), 0.5);
    }

    @Test
    public void testStatisticsCal0Users()
    {
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNames = new ArrayList<String>();
        int post = 50;
        int com = 200;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(com);

        StatisticsCal statisticsCal = new StatisticsCal(statisticsMock);

        statisticsCal.calculateAdvStatistics();

        Assert.assertEquals(4, statisticsCal.getAveragePostUser(), 0.5);
    }

    @Test
    public void testStatisticsCal100Users()
    {
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNames = new ArrayList<String>();
        for(int i = 0; i < 999; i++) {
            usersNames.add("User");
        }
        int post = 5000;
        int com = 200;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(com);

        StatisticsCal statisticsCal = new StatisticsCal(statisticsMock);

        statisticsCal.calculateAdvStatistics();

        Assert.assertEquals(5, statisticsCal.getAveragePostUser(), 0.5);
    }
}
