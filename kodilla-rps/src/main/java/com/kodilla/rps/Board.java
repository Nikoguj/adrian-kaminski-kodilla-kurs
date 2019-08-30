package com.kodilla.rps;

public class Board {
    private int numberRoundToWin;

    public Board(int numberRoundToWin) {
        this.numberRoundToWin = numberRoundToWin;
    }

    public void whoEntitledPoint(Player player1, Thrown thrown1, Player player2, Thrown thrown2)
    {
        if(thrown1.getThrown() == 1)
        {
            if(thrown2.getThrown() == 1)
            {
                player1.addPoint();
                player2.addPoint();
            }
            if(thrown2.getThrown() == 2)
            {
                player2.addPoint();
            }
            if(thrown2.getThrown() == 3)
            {
                player1.addPoint();
            }
        }

        if(thrown1.getThrown() == 2)
        {
            if(thrown2.getThrown() == 1)
            {
                player1.addPoint();
            }
            if(thrown2.getThrown() == 2)
            {
                player1.addPoint();
                player2.addPoint();
            }
            if(thrown2.getThrown() == 3)
            {
                player2.addPoint();
            }
        }

        if(thrown1.getThrown() == 3)
        {
            if(thrown2.getThrown() == 1)
            {
                player2.addPoint();
            }
            if(thrown2.getThrown() == 2)
            {
                player1.addPoint();
            }
            if(thrown2.getThrown() == 3)
            {
                player1.addPoint();
                player2.addPoint();
            }
        }
    }
}
