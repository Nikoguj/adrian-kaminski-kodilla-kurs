package com.kodilla.sudoku;

public class VariableContainer {
    public static char[][] mainBoard = new char[9][9];
    public static PossibleSudokuElement[][] hideBoard = new PossibleSudokuElement[9][9];

    static void fillHideBoard() {
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                hideBoard[i][j] = new PossibleSudokuElement();
            }
        }
    }


}
