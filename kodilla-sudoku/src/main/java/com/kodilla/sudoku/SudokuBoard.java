package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    List<SudokuRow> sudokuRows = new ArrayList<>();

    public SudokuBoard() {
        for (int i = 0; i < VariableContainer.SUDOKU_LENGTH; i++) {
            sudokuRows.add(new SudokuRow());
        }
    }

    @Override
    public String toString() {
        String result;
        result = "-------------------\n";
        result += sudokuRows.get(0) + "\n";
        result += sudokuRows.get(1) + "\n";
        result += sudokuRows.get(2) + "\n";
        result += "-------------------\n";
        result += sudokuRows.get(3) + "\n";
        result += sudokuRows.get(4) + "\n";
        result += sudokuRows.get(5) + "\n";
        result += "-------------------\n";
        result += sudokuRows.get(6) + "\n";
        result += sudokuRows.get(7) + "\n";
        result += sudokuRows.get(8) + "\n";
        result += "-------------------\n";

        return  result;
    }
}
