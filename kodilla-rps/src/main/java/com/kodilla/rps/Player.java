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

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void addPoint() {
        playerPoints = playerPoints + 1;
    }

    public void restartPoints() {
        playerPoints = 0;
    }
}
