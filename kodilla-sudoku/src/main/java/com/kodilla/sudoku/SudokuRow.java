package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    List<SudokuElement> sudokuRow = new ArrayList<>();

    public SudokuRow() {
        for (int i = 0; i < VariableContainer.SUDOKU_LENGTH; i++) {
            sudokuRow.add(new SudokuElement());
        }
    }

    @Override
    public String toString() {
        return "|" + sudokuRow.get(0) + sudokuRow.get(1) + sudokuRow.get(2) + "|" + sudokuRow.get(3) + sudokuRow.get(4) + sudokuRow.get(5) + "|" + sudokuRow.get(6) + sudokuRow.get(7) + sudokuRow.get(8) + "|";
    }
}
