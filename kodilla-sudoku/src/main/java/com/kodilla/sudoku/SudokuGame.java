package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGame {
    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);
        Board board = new Board();
        Message message = new Message();
        UserInput userInput = new UserInput();
        System.out.println("Welcome to Sudoku program");
        message.CommandList();
        boolean exit = false;
        while (!exit) {
            int command = scan.nextInt();
            scan.nextLine();
            switch (command) {
                case 1:
                    System.out.println(board);
                    message.CommandList();
                    break;
                case 2:
                    userInput.userEntry(board);
                    message.CommandList();
                    break;
                case 3:
                    break;
                case 4:
                    exit = true;
                    break;
            }
        }
    }
}
