package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {

    static final String SUCCESS = "SUCCESS";
    static final String WRONG_DATA = "WRONG_DATA";
    static final String EXIT = "EXIT";

    public void userEntry(Board board) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value in format");
        System.out.println("[row, column, value]");
        System.out.print("  123 456 789\n" +
                " -------------\n" +
                "1|   |   |   |\n" +
                "2|   |   |   |\n" +
                "3|   |   |   |\n" +
                " -------------\n" +
                "4|   |   |   |\n" +
                "5|   |   |   |\n" +
                "6|   |   |   |\n" +
                " -------------\n" +
                "7|   |   |   |\n" +
                "8|   |   |   |\n" +
                "9|   |   |   |\n" +
                " -------------\n");
        System.out.println("Use 0, 0, 0 to quit entering the value");
        String exitFromEnterValue = UserInput.SUCCESS;
        while (!exitFromEnterValue.equals(UserInput.EXIT)) {
            String whatAndWhere = scan.nextLine();
            switch (userPutValue(whatAndWhere)) {
                case UserInput.SUCCESS:
                    System.out.println("Data entered");
                    System.out.println("Sudoku looks like this:");
                    System.out.println(board);
                    break;
                case UserInput.WRONG_DATA:
                    System.out.println("Wrong data or format");
                    System.out.println("You must enter data in the format");
                    System.out.println("[row, column, value]");
                    break;
                case UserInput.EXIT:
                    exitFromEnterValue = UserInput.EXIT;
                    break;

            }
        }
    }

    private String userPutValue(String userCommand) {
        if(userCommand.length() != 7)
        {
            return UserInput.WRONG_DATA;
        }
        int y = Character.getNumericValue(userCommand.charAt(0));
        int x = Character.getNumericValue(userCommand.charAt(3));
        int value = Character.getNumericValue(userCommand.charAt(6));

        if (y == 0 && x == 0 && value == 0 && isCommaAndSpace(userCommand)) {
            return UserInput.EXIT;
        } else if (validNumbers(y, x, value) && isCommaAndSpace(userCommand)) {
            VariableContainer.mainBoard[y - 1][x - 1] = (char) (value + '0');
            return UserInput.SUCCESS;
        } else {
            return UserInput.WRONG_DATA;
        }
    }

    private boolean isCommaAndSpace(String userCommand) {
        char userCommand1 = userCommand.charAt(1);
        char userCommand2 = userCommand.charAt(2);
        char userCommand4 = userCommand.charAt(4);
        char userCommand5 = userCommand.charAt(5);
        if (userCommand1 == ',' && userCommand4 == ',' && userCommand2 == ' ' && userCommand5 == ' ') {
           return true;
        }else {
            return false;
        }
    }

    private boolean validNumbers(int y, int x, int value) {
        if (y > 0 && y < 10 && x > 0 && x < 10 && value > 0 && value < 10) {
            return true;
        } else {
            return false;
        }
    }
}
