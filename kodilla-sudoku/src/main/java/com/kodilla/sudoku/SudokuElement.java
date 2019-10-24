package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    private int value = VariableContainer.EMPTY;
    private List<Integer> possibleNumbers = new ArrayList<>();

    public SudokuElement() {
        for(int i = 0; i < VariableContainer.SUDOKU_LENGTH; i++) {
            possibleNumbers.add(i + 1);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
