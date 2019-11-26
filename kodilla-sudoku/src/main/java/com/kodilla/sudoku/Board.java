package com.kodilla.sudoku;

public class Board {

    public Board() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                VariableContainer.mainBoard[i][j] = 32;
            }
        }
    }


    @Override
    public String toString() {
        String result = "-------------\n";
        for (int j = 0; j < 9; j++) {
            for(int i = 0; i < 3; i++)
            {
                result = result + "|" + VariableContainer.mainBoard[j][0+i*3] + VariableContainer.mainBoard[j][1+i*3] + VariableContainer.mainBoard[j][2+i*3];
            }
            result = result + "|\n";
            if(j == 2 || j == 5 || j == 8)
            {
                result = result + "-------------\n";
            }
        }
        return result;
    }
}
