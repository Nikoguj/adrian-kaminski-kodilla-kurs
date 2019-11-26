package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PossibleSudokuElement {

    public ArrayList<Integer> possibleElements;

    public ArrayList<Integer> getPossibleElements() {
        return possibleElements;
    }

    public PossibleSudokuElement() {
        ArrayList<Integer> possibleElement = new ArrayList<>();
        for(int i = 1; i < 10; i++) {
            possibleElement.add(i);
        }
        possibleElements = possibleElement;
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        for (Integer possibleElement : possibleElements) {
            returnString.append(possibleElement);
        }
        return returnString.toString();
    }

    public void addPossibleElement(int value) {
        possibleElements.add(value);
    }
}
