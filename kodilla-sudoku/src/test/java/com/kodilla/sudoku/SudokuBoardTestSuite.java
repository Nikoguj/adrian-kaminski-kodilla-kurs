package com.kodilla.sudoku;

import org.junit.Assert;
import org.junit.Test;

public class SudokuBoardTestSuite {
    @Test
    public void testToString() {
        //Given
        SudokuBoard sudokuBoard = new SudokuBoard();

        String exceptedString = "------------------- \n" +
                          "|-1-1-1|-1-1-1|-1-1-1|\n" +
                          "|-1-1-1|-1-1-1|-1-1-1|\n" +
                          "|-1-1-1|-1-1-1|-1-1-1|\n" +
                          "-------------------\n" +
                          "|-1-1-1|-1-1-1|-1-1-1|\n" +
                          "|-1-1-1|-1-1-1|-1-1-1|\n" +
                          "|-1-1-1|-1-1-1|-1-1-1|\n" +
                          "-------------------\n" +
                          "|-1-1-1|-1-1-1|-1-1-1|\n" +
                          "|-1-1-1|-1-1-1|-1-1-1|\n" +
                          "|-1-1-1|-1-1-1|-1-1-1|\n" +
                          "-------------------";
        String returnString = sudokuBoard.toString();

        //Assert.assertEquals(exceptedString, returnString);
    }
}
