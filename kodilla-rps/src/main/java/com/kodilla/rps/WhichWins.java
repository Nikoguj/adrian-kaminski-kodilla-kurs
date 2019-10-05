package com.kodilla.rps;

public class WhichWins {
    public boolean whichMoveWin(Move move1, Move move2) {
        if (move1.getWinWith().contains(move2.getName())) {
            return true;
        } else {
            return false;
        }
    }
}
