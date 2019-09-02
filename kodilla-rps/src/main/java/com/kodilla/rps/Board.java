package com.kodilla.rps;

public class Board {
    private int numberRoundToWin;


    public void whoEntitledPoint(Player player1, Thrown thrown1, Player player2, Thrown thrown2)
    {
        if(thrown1.getThrown() == 1)
        {
            if(thrown2.getThrown() == 1)
            {
                player1.addPoint();
                player2.addPoint();
                System.out.println("This round ended in a draw");
            }
            if(thrown2.getThrown() == 2)
            {
                player2.addPoint();
                System.out.println("This round win " + player2.getName());
            }
            if(thrown2.getThrown() == 3)
            {
                player1.addPoint();
                System.out.println("This round win " + player1.getName());
            }
        }

        if(thrown1.getThrown() == 2)
        {
            if(thrown2.getThrown() == 1)
            {
                player1.addPoint();
                System.out.println("This round win " + player1.getName());
            }
            if(thrown2.getThrown() == 2)
            {
                player1.addPoint();
                player2.addPoint();
                System.out.println("This round ended in a draw");
            }
            if(thrown2.getThrown() == 3)
            {
                player2.addPoint();
                System.out.println("This round win " + player2.getName());
            }
        }

        if(thrown1.getThrown() == 3)
        {
            if(thrown2.getThrown() == 1)
            {
                player2.addPoint();
                System.out.println("This round win " + player2.getName());
            }
            if(thrown2.getThrown() == 2)
            {
                player1.addPoint();
                System.out.println("This round win " + player1.getName());
            }
            if(thrown2.getThrown() == 3)
            {
                player1.addPoint();
                player2.addPoint();
                System.out.println("This round ended in a draw");
            }
        }
    }

    public String whatPlayerChose(int chose)
    {
        switch (chose) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
        }
        return null;
    }

    public void wonPlayer(Player player1, Player player2)
    {
        if(player1.getPlayerPoints() > player2.getPlayerPoints())
        {
            System.out.println(player1.getName() + " won");
        }else if(player1.getPlayerPoints() < player2.getPlayerPoints())
        {
            System.out.println(player2.getName() + " won");
        }else
        {
            System.out.println("The game ended in a draw.");
        }
    }

}
