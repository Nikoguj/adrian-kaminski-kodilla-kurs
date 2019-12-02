package com.kodilla.sudoku;

public class Copyist {

    public char[][] copyMainBoard(char[][] mainBoard) {
        char[][] copyBoard = new char[mainBoard.length][mainBoard.length];

        for (int i = 0; i < mainBoard.length; i++) {
            for (int j = 0; j < mainBoard.length; j++) {
                copyBoard[i][j] = mainBoard[i][j];
            }
        }

        return copyBoard;
    }

    public PossibleSudokuElement[][] copyHideBoard(PossibleSudokuElement[][] hideBoard) {
        PossibleSudokuElement[][] copyBoard = new PossibleSudokuElement[hideBoard.length][hideBoard.length];
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                copyBoard[i][j] = new PossibleSudokuElement();
            }
        }

        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                copyBoard[i][j].possibleElements.clear();
                copyBoard[i][j].possibleElements.addAll(hideBoard[i][j].possibleElements);
            }
        }

        return copyBoard;
    }

    public boolean isHideBoardChange(PossibleSudokuElement[][] hideBoard, PossibleSudokuElement[][] copyBoard) {
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                if(hideBoard[i][j].possibleElements.size() != copyBoard[i][j].possibleElements.size()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isMainBoardChange(char[][] mainBoard, char[][] copyBoard) {
        for (int i = 0; i < mainBoard.length; i++) {
            for (int j = 0; j < mainBoard.length; j++) {
                if(mainBoard[i][j] != copyBoard[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }


}
