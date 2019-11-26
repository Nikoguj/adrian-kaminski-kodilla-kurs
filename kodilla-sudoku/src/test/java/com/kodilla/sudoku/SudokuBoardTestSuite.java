package com.kodilla.sudoku;

import org.junit.Assert;
import org.junit.Test;

public class SudokuBoardTestSuite {
    @Test
    public void testBoardShow() {
        Board board = new Board();

        String exceptedBoardToString = "-------------\n" +
                "|   |   |   |\n" +
                "|   |   |   |\n" +
                "|   |   |   |\n" +
                "-------------\n" +
                "|   |   |   |\n" +
                "|   |   |   |\n" +
                "|   |   |   |\n" +
                "-------------\n" +
                "|   |   |   |\n" +
                "|   |   |   |\n" +
                "|   |   |   |\n" +
                "-------------\n";

        String returnBoardToString = board.toString();

        Assert.assertEquals(exceptedBoardToString, returnBoardToString);

    }
}
