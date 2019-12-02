package com.kodilla.sudoku;

import org.junit.Assert;
import org.junit.Test;

public class CopyiesTestSuite {

    private void showPossibleArray(PossibleSudokuElement[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j].possibleElements.size() == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(array[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private void showCharArray(char[][] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print("" + i + " ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testCopyMainBoard() {
        //Given
        char[][] mainBoard = new char[9][9];
        mainBoard[0][0] = '3';
        mainBoard[8][8] = '7';

        Copyist copyist = new Copyist();

        //When
        char[][] copyBoard = copyist.copyMainBoard(mainBoard);

        //Then
        Assert.assertEquals(mainBoard, copyBoard);
    }

    @Test
    public void testCopyHideBoard() {
        //Given
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }

        hideBoard[4][4].possibleElements.clear();
        hideBoard[4][4].possibleElements.add((Integer) 1);

        Copyist copyist = new Copyist();

        //When
        PossibleSudokuElement[][] copyBoard = copyist.copyHideBoard(hideBoard);

        hideBoard[1][1].possibleElements.clear();
        hideBoard[1][1].possibleElements.add((Integer)5);

        //Then
        showPossibleArray(hideBoard);
        System.out.println();
        showPossibleArray(copyBoard);
    }

    @Test
    public void testIsHideBoardChange1() {
        //Given
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }
        Copyist copyist = new Copyist();

        PossibleSudokuElement[][] copyBoard = copyist.copyHideBoard(hideBoard);

        //When
        boolean isSame = copyist.isHideBoardChange(hideBoard, copyBoard);

        //Then
        Assert.assertEquals(false, isSame);
    }

    @Test
    public void testIsHideBoardChange2() {
        //Given
        PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }
        Copyist copyist = new Copyist();

        PossibleSudokuElement[][] copyBoard = copyist.copyHideBoard(hideBoard);

        hideBoard[4][4].possibleElements.clear();
        hideBoard[4][4].possibleElements.add((Integer)4);

        //When
        boolean isSame = copyist.isHideBoardChange(hideBoard, copyBoard);

        //Then
        Assert.assertEquals(true, isSame);

    }

    @Test
    public void testIsMainBoardChange() {
        Copyist copyist = new Copyist();

        char[][] mainBoard = new char[9][9];
        char[][] copyBoard = copyist.copyMainBoard(mainBoard);

        System.out.println(copyist.isMainBoardChange(mainBoard, copyBoard));
        mainBoard[1][1] = '3';
        System.out.println(copyist.isMainBoardChange(mainBoard, copyBoard));

    }
}
