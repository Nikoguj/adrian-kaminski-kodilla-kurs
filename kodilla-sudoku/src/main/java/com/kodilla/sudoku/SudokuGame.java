package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGame {
    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);
        Board board = new Board();
        Solver solver = new Solver();
        Copyist copyist = new Copyist();
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
                    if (solver.canSolve(VariableContainer.mainBoard)) {
                        char[][] returnBoard = solver.solverWGuess(VariableContainer.mainBoard, VariableContainer.hideBoard);
                        VariableContainer.mainBoard = copyist.copyMainBoard(returnBoard);
                        System.out.println(board);
                        System.out.println("Sudoku solved!");
                        board.clean();
                        message.CommandList();
                    } else {
                        System.out.println("Sudoku cannot be solved, board has been cleaned");
                        board.clean();
                        message.CommandList();
                    }

                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("There is no such as option");
                    break;
            }
        }
    }
}
