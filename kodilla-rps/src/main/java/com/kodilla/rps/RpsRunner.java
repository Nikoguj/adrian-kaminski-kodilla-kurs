package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean end1 = false;
        int whatPlayer2Thrown = 0;

        while (!end1) {
            boolean end2 = false;
            while (!end2) {
                System.out.println("Welcome to the game \"Rock Paper Scissors\"");
                System.out.print("Your name: ");
                String playerName = "Nw"; scanner.next();
                System.out.print("Number of round to win: ");
                int numberRoundToWin = 4; scanner.nextInt();
                Board board = new Board(numberRoundToWin);
                Player player1Name = new Player(playerName);
                Player player2Name = new Player("Computer");

                System.out.println("Game instruction:");
                System.out.println("Key \"1\" play \"stone\"");
                System.out.println("Key \"2\" playing \"paper\"");
                System.out.println("Key \"3\" playing \"scissors\",");
                System.out.println("Key \"x\" end of the game");
                System.out.println("Key \"n\" restart the game");

                System.out.print("Choose move: ");
                String whatPlayer1Thrown = scanner.nextLine();
                System.out.println(whatPlayer1Thrown);
                whatPlayer2Thrown = random.nextInt(3) + 1;
                if (whatPlayer1Thrown.equals("x")) {
                    end1 = true;
                    end2 = true;
                } else if (whatPlayer1Thrown.equals("n")) {
                    end2 = true;
                }

            }
            System.out.println("Reset");
        }
        System.out.println("Thanks for the game");

    }
}
