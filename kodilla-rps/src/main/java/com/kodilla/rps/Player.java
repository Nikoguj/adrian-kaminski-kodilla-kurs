package com.kodilla.rps;

public class Player {
    private String name;
    private int playerPoints;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPoint()
    {
        playerPoints = playerPoints + 1;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }
}
