package com.kodilla.rps;

public class Board {
    private int numberRoundToWin;
    private Player player1;
    private Player player2;

    public Board(int numberRoundToWin, String player1Name) {
        this.numberRoundToWin = numberRoundToWin;
        Player player1 = new Player(player1Name);
        Player player2 = new Player("Computer");
    }

    public void addPlayerPoint(Player player)
    {
        player.addPoint();
    }

    public int getPlayerPoint(Player player)
    {
        player.getPlayerPoints();
    }
}
