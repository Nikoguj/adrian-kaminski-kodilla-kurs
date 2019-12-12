package com.kodilla.sudoku;

public class Backtrack {
    private char[][] mainBoard;
    private PossibleSudokuElement[][] hideBoard;
    private Vector vector;
    private int shot;

    public Backtrack(char[][] mainBoard, PossibleSudokuElement[][] hideBoard, Vector vector, int shot) {
        this.mainBoard = mainBoard;
        this.hideBoard = hideBoard;
        this.vector = vector;
        this.shot = shot;
    }

    public char[][] getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(char[][] mainBoard) {
        this.mainBoard = mainBoard;
    }

    public PossibleSudokuElement[][] getHideBoard() {
        return hideBoard;
    }

    public void setHideBoard(PossibleSudokuElement[][] hideBoard) {
        this.hideBoard = hideBoard;
    }

    public Vector getVector() {
        return vector;
    }

    public void setVector(Vector vector) {
        this.vector = vector;
    }

    public int getShot() {
        return shot;
    }

    public void setShot(int shot) {
        this.shot = shot;
    }
}
