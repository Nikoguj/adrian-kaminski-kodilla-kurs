package com.kodilla.sudoku;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.*;

public class Solver {

    public char[][] solverWGuess(char[][] mainBoard, PossibleSudokuElement[][] hideBoard) {
        Copyist copyist = new Copyist();

        solve(mainBoard, hideBoard, false);
        List<Backtrack> backtrackList = new ArrayList<>();

        if (!isEnd(mainBoard)) {
            Vector vector = whereMaxNumberInHideBoard(hideBoard);
            for (int i = 0; i < hideBoard[vector.y][vector.x].possibleElements.size(); i++) {
                backtrackList.add(new Backtrack(copyist.copyMainBoard(mainBoard), copyist.copyHideBoard(hideBoard), vector, hideBoard[vector.y][vector.x].possibleElements.get(i)));
            }
            for (int i = 0; i < backtrackList.size(); i++) {
                boolean inWhile = false;
                char[][] copyMainBoard = copyist.copyMainBoard(mainBoard);
                while (copyist.isMainBoardChange(mainBoard, copyMainBoard) || inWhile == false) {
                    inWhile = true;
                    copyMainBoard = copyist.copyMainBoard(mainBoard);
                    hideBoard[vector.y][vector.x].possibleElements.clear();
                    hideBoard[vector.y][vector.x].possibleElements.add(backtrackList.get(i).getShot());
                    char[][] returnBoard = solverWGuess(mainBoard, hideBoard);
                    if(isEnd(returnBoard)){
                        return  returnBoard;
                    }
                }
                mainBoard = backtrackList.get(i).getMainBoard();
                hideBoard = backtrackList.get(i).getHideBoard();
            }
        }
        return mainBoard;
    }

    public void solve(char[][] mainBoard, PossibleSudokuElement[][] hideBoard, boolean inWhile) {
        Copyist copyist = new Copyist();

        PossibleSudokuElement[][] copyHideBoard = copyist.copyHideBoard(hideBoard);

        while (copyist.isHideBoardChange(hideBoard, copyHideBoard) || inWhile == false) {
            copyHideBoard = copyist.copyHideBoard(hideBoard);
            for (int i = 0; i < mainBoard.length; i++) {
                for (int j = 0; j < mainBoard.length; j++) {
                    if (mainBoard[i][j] == ' ') {
                        Vector vector = new Vector(j, i);
                        deletePossibleElementFromWindow(mainBoard, hideBoard, vector);
                        deletePossibleElementFromRow(mainBoard, hideBoard, vector);
                        deletePossibleElementFromColumn(mainBoard, hideBoard, vector);
                        enterIfNotPresentAsPossible(mainBoard, hideBoard, vector);
                        ifOnlyOneNumberInWindow(mainBoard, hideBoard);
                        ifEnterInManiRemoveFromHide(mainBoard, hideBoard);
                        oneLeft(mainBoard, hideBoard, i, j);
                    }
                }
            }
            inWhile = true;
        }
    }


    public void oneLeft(char[][] mainBoard, PossibleSudokuElement[][] hideBoard, int i, int j) {
        if (hideBoard[i][j].possibleElements.size() == 1) {
            mainBoard[i][j] = (char) (hideBoard[i][j].possibleElements.get(0) + '0');
        }
    }

    public boolean canSolve(char[][] mainBoard) {
        for (int i = 0; i < mainBoard.length; i++) {
            for (int j = 0; j < mainBoard.length; j++) {
                if(mainBoard[i][j] != ' '){
                    for (int k = 0; k < j; k++) {
                        if (mainBoard[i][j] == mainBoard[i][k]) {
                            return false;
                        }
                    }
                    for (int k = j+1; k < mainBoard.length; k++) {
                        if (mainBoard[i][j] == mainBoard[i][k]) {
                            return false;
                        }
                    }

                    for (int k = 0; k < i; k++) {
                        if (mainBoard[i][j] == mainBoard[k][j]) {
                            return false;
                        }
                    }
                    for (int k = i + 1; k < mainBoard.length; k++) {
                        if (mainBoard[i][j] == mainBoard[k][j]) {
                            return false;
                        }
                    }

                    Vector midWindow = midWindowWhereVector(new Vector(i, j));
                    List<Character> inWindow = new ArrayList<>();

                    if(mainBoard[midWindow.y+1][midWindow.x-1] != ' ')
                    {
                        inWindow.add(mainBoard[midWindow.y+1][midWindow.x-1]);
                    }
                    if(mainBoard[midWindow.y+1][midWindow.x] != ' ')
                    {
                        inWindow.add(mainBoard[midWindow.y+1][midWindow.x]);
                    }
                    if(mainBoard[midWindow.y+1][midWindow.x+1] != ' ')
                    {
                        inWindow.add(mainBoard[midWindow.y+1][midWindow.x+1]);
                    }

                    if(mainBoard[midWindow.y-1][midWindow.x+1] != ' ')
                    {
                        inWindow.add(mainBoard[midWindow.y-1][midWindow.x+1]);
                    }
                    if(mainBoard[midWindow.y-1][midWindow.x] != ' ')
                    {
                        inWindow.add(mainBoard[midWindow.y-1][midWindow.x]);
                    }
                    if(mainBoard[midWindow.y-1][midWindow.x-1] != ' ')
                    {
                        inWindow.add(mainBoard[midWindow.y-1][midWindow.x-1]);
                    }

                    if(mainBoard[midWindow.y][midWindow.x-1] != ' ')
                    {
                        inWindow.add(mainBoard[midWindow.y][midWindow.x-1]);
                    }
                    if(mainBoard[midWindow.y][midWindow.x+1] != ' ')
                    {
                        inWindow.add(mainBoard[midWindow.y][midWindow.x+1]);
                    }
                    if(mainBoard[midWindow.y][midWindow.x] != ' ')
                    {
                        inWindow.add(mainBoard[midWindow.y][midWindow.x]);
                    }

                    inWindow.remove((Object)mainBoard[i][j]);
                    if(inWindow.contains(mainBoard[i][j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void deletePossibleElementFromRow(char[][] mainBoard, PossibleSudokuElement[][] hideBoard, Vector vector) {
        for (int i = 0; i < vector.x; i++) {
            if (mainBoard[vector.y][i] != ' ') {
                hideBoard[vector.y][vector.x].possibleElements.remove((Object) Character.getNumericValue(mainBoard[vector.y][i]));
            }
        }
        for (int i = vector.x + 1; i < mainBoard.length; i++) {
            if (mainBoard[vector.y][i] != ' ') {
                int value = Character.getNumericValue(mainBoard[vector.y][i]);
                hideBoard[vector.y][vector.x].possibleElements.remove((Object) Character.getNumericValue(mainBoard[vector.y][i]));
            }
        }
    }

    public void deletePossibleElementFromColumn(char[][] mainBoard, PossibleSudokuElement[][] hideBoard, Vector vector) {
        for (int i = 0; i < vector.y; i++) {
            if (mainBoard[i][vector.x] != ' ') {
                hideBoard[vector.y][vector.x].possibleElements.remove((Object) Character.getNumericValue(mainBoard[i][vector.x]));
            }
        }
        for (int i = vector.y + 1; i < mainBoard.length; i++) {
            if (mainBoard[i][vector.x] != ' ') {
                hideBoard[vector.y][vector.x].possibleElements.remove((Object) Character.getNumericValue(mainBoard[i][vector.x]));
            }
        }
    }

    public Vector midWindowWhereVector(Vector vector) {
        ArrayList<Vector> midWindows = new ArrayList<>();
        midWindows.add(new Vector(1, 1));
        midWindows.add(new Vector(4, 1));
        midWindows.add(new Vector(7, 1));
        midWindows.add(new Vector(1, 4));
        midWindows.add(new Vector(4, 4));
        midWindows.add(new Vector(7, 4));
        midWindows.add(new Vector(1, 7));
        midWindows.add(new Vector(4, 7));
        midWindows.add(new Vector(7, 7));

        Vector resultVector = new Vector();
        double tempDistance = 10.0;
        for (int i = 0; i < midWindows.size(); i++) {
            double distance = Math.sqrt(Math.pow(vector.x - midWindows.get(i).x, 2) + Math.pow(vector.y - midWindows.get(i).y, 2));
            if (distance < tempDistance) {
                tempDistance = distance;
                resultVector.setX(midWindows.get(i).x);
                resultVector.setY(midWindows.get(i).y);
            }
        }
        return resultVector;
    }

    public void deletePossibleElementFromWindow(char[][] mainBoard, PossibleSudokuElement[][] hideBoard, Vector vector) {
        Vector midWindow = midWindowWhereVector(vector);
        //int value = Character.getNumericValue(mainBoard[vector.y][vector.x]);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(Character.getNumericValue(mainBoard[midWindow.y - 1][midWindow.x - 1]));
        list.add(Character.getNumericValue(mainBoard[midWindow.y][midWindow.x - 1]));
        list.add(Character.getNumericValue(mainBoard[midWindow.y + 1][midWindow.x - 1]));

        list.add(Character.getNumericValue(mainBoard[midWindow.y - 1][midWindow.x]));
        list.add(Character.getNumericValue(mainBoard[midWindow.y][midWindow.x]));
        list.add(Character.getNumericValue(mainBoard[midWindow.y + 1][midWindow.x]));

        list.add(Character.getNumericValue(mainBoard[midWindow.y - 1][midWindow.x + 1]));
        list.add(Character.getNumericValue(mainBoard[midWindow.y][midWindow.x + 1]));
        list.add(Character.getNumericValue(mainBoard[midWindow.y + 1][midWindow.x + 1]));

        for (Integer i : list) {
            if (i != 0) {
                hideBoard[vector.y][vector.x].possibleElements.remove((Object) i);
            }
        }
    }

    public void enterIfNotPresentAsPossible(char[][] mainBoard, PossibleSudokuElement[][] hideBoard, Vector vector) {
        ArrayList<Integer> listPossibleInVector = hideBoard[vector.y][vector.x].possibleElements;

        for (Integer possibleValue : listPossibleInVector) {
            boolean present = false;
            //Row
            for (int i = 0; i < vector.x; i++) {
                if (hideBoard[vector.y][i].possibleElements.contains((Object) possibleValue)) {
                    present = true;
                }
            }
            for (int i = vector.x + 1; i < mainBoard.length; i++) {
                if (hideBoard[vector.y][i].possibleElements.contains((Object) possibleValue)) {
                    present = true;
                }
            }

            if (!present) {
                mainBoard[vector.y][vector.x] = (char) (possibleValue + '0');
            }


            boolean presentColumn = false;
            //Column
            for (int i = 0; i < vector.y; i++) {
                if (hideBoard[i][vector.x].possibleElements.contains(possibleValue)) {
                    presentColumn = true;
                }
            }
            for (int i = vector.y + 1; i < mainBoard.length; i++) {
                if (hideBoard[i][vector.x].possibleElements.contains(possibleValue)) {
                    presentColumn = true;
                }
            }

            if (!presentColumn) {
                mainBoard[vector.y][vector.x] = (char) (possibleValue + '0');
            }

        }
    }

    public void ifEnterInManiRemoveFromHide(char[][] mainBoard, PossibleSudokuElement[][] hideBoard) {
        PossibleSudokuElement clearPossibleSudokuElement = new PossibleSudokuElement();
        clearPossibleSudokuElement.possibleElements.clear();
        for (int i = 0; i < mainBoard.length; i++) {
            for (int j = 0; j < mainBoard.length; j++) {
                if (mainBoard[i][j] != ' ') {
                    hideBoard[i][j] = clearPossibleSudokuElement;
                }
            }
        }
    }

    public void ifOnlyOneNumberInWindow(char[][] mainBoard, PossibleSudokuElement[][] hideBoard) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            listOfNumbers.add(i);
        }

        ArrayList<Vector> midWindows = new ArrayList<>();
        midWindows.add(new Vector(1, 1));
        midWindows.add(new Vector(4, 1));
        midWindows.add(new Vector(7, 1));
        midWindows.add(new Vector(1, 4));
        midWindows.add(new Vector(4, 4));
        midWindows.add(new Vector(7, 4));
        midWindows.add(new Vector(1, 7));
        midWindows.add(new Vector(4, 7));
        midWindows.add(new Vector(7, 7));

        for (Vector midWindow : midWindows) {
            ArrayList<Integer> listPresent = new ArrayList<>();
            listPresent.add(Character.getNumericValue(mainBoard[midWindow.y - 1][midWindow.x - 1]));
            listPresent.add(Character.getNumericValue(mainBoard[midWindow.y - 1][midWindow.x]));
            listPresent.add(Character.getNumericValue(mainBoard[midWindow.y - 1][midWindow.x + 1]));

            listPresent.add(Character.getNumericValue(mainBoard[midWindow.y][midWindow.x + 1]));
            listPresent.add(Character.getNumericValue(mainBoard[midWindow.y][midWindow.x]));
            listPresent.add(Character.getNumericValue(mainBoard[midWindow.y][midWindow.x - 1]));

            listPresent.add(Character.getNumericValue(mainBoard[midWindow.y + 1][midWindow.x - 1]));
            listPresent.add(Character.getNumericValue(mainBoard[midWindow.y + 1][midWindow.x]));
            listPresent.add(Character.getNumericValue(mainBoard[midWindow.y + 1][midWindow.x + 1]));


            ArrayList<Integer> listHide = new ArrayList<>();
            listHide.addAll(hideBoard[midWindow.y - 1][midWindow.x - 1].possibleElements);
            listHide.addAll(hideBoard[midWindow.y - 1][midWindow.x].possibleElements);
            listHide.addAll(hideBoard[midWindow.y - 1][midWindow.x + 1].possibleElements);


            listHide.addAll(hideBoard[midWindow.y][midWindow.x - 1].possibleElements);
            listHide.addAll(hideBoard[midWindow.y][midWindow.x].possibleElements);
            listHide.addAll(hideBoard[midWindow.y][midWindow.x + 1].possibleElements);


            listHide.addAll(hideBoard[midWindow.y + 1][midWindow.x - 1].possibleElements);
            listHide.addAll(hideBoard[midWindow.y + 1][midWindow.x].possibleElements);
            listHide.addAll(hideBoard[midWindow.y + 1][midWindow.x + 1].possibleElements);

            ArrayList<Integer> allNumbers = new ArrayList<>();
            allNumbers.addAll(listPresent);
            allNumbers.addAll(listHide);


            for (int i = 1; i < 10; i++) {
                int count = Collections.frequency(allNumbers, i);
                if (count == 1) {
                    if (hideBoard[midWindow.y - 1][midWindow.x - 1].possibleElements.contains(i)) {
                        mainBoard[midWindow.y - 1][midWindow.x - 1] = (char) (i + '0');
                    }
                    if (hideBoard[midWindow.y - 1][midWindow.x].possibleElements.contains(i)) {
                        mainBoard[midWindow.y - 1][midWindow.x] = (char) (i + '0');
                    }
                    if (hideBoard[midWindow.y - 1][midWindow.x + 1].possibleElements.contains(i)) {
                        mainBoard[midWindow.y - 1][midWindow.x + 1] = (char) (i + '0');
                    }


                    if (hideBoard[midWindow.y][midWindow.x - 1].possibleElements.contains(i)) {
                        mainBoard[midWindow.y][midWindow.x - 1] = (char) (i + '0');
                    }
                    if (hideBoard[midWindow.y][midWindow.x].possibleElements.contains(i)) {
                        mainBoard[midWindow.y][midWindow.x] = (char) (i + '0');
                    }
                    if (hideBoard[midWindow.y][midWindow.x + 1].possibleElements.contains(i)) {
                        mainBoard[midWindow.y][midWindow.x + 1] = (char) (i + '0');
                    }


                    if (hideBoard[midWindow.y + 1][midWindow.x - 1].possibleElements.contains(i)) {
                        mainBoard[midWindow.y + 1][midWindow.x - 1] = (char) (i + '0');
                    }
                    if (hideBoard[midWindow.y + 1][midWindow.x].possibleElements.contains(i)) {
                        mainBoard[midWindow.y + 1][midWindow.x] = (char) (i + '0');
                    }
                    if (hideBoard[midWindow.y + 1][midWindow.x + 1].possibleElements.contains(i)) {
                        mainBoard[midWindow.y + 1][midWindow.x + 1] = (char) (i + '0');
                    }
                }
            }
        }
    }

    public Vector whereMaxNumberInHideBoard(PossibleSudokuElement[][] hideBoard) {
        Vector vector = new Vector();
        int count = 0;
        for (int i = 0; i < hideBoard.length; i++) {
            for (int j = 0; j < hideBoard.length; j++) {
                if (hideBoard[i][j].possibleElements.size() > count) {
                    count = hideBoard[i][j].possibleElements.size();
                    vector.x = j;
                    vector.y = i;
                }
            }
        }
        return vector;
    }

    public boolean isEnd(char[][] mainBoard) {
        for (int i = 0; i < mainBoard.length; i++) {
            for (int j = 0; j < mainBoard.length; j++) {
                if (mainBoard[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}















