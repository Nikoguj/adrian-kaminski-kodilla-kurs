package com.kodilla.rps;

public class Board {
    private int numberRoundToWin;


    public void whoEntitledPoint(Player player1, Move move1, Player player2, Move move2) {
        WhichWins whichWins = new WhichWins();
        if (move1 != move2) {
            if (whichWins.whichMoveWin(move1, move2)) {
                player1.addPoint();
                System.out.println("This round win " + player1.getName());
            } else {
                player2.addPoint();
                System.out.println("This round win " + player2.getName());
            }
        } else {
            System.out.println("This round was a draw");
        }
    }

    public void wonPlayer(Player player1, Player player2) {
        if (player1.getPlayerPoints() > player2.getPlayerPoints()) {
            System.out.println(player1.getName() + " won");
        } else if (player1.getPlayerPoints() < player2.getPlayerPoints()) {
            System.out.println(player2.getName() + " won");
        } else {
            System.out.println("The game ended in a draw.");
        }
    }

}
