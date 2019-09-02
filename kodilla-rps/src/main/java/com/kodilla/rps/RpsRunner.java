package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean end1 = false;
        int whatPlayer2Thrown = 0;

        while (!end1) {
            boolean end2 = false;
            while (!end2) {
                System.out.println("Welcome to the game \"Rock Paper Scissors\"");
                System.out.println("Your name: ");
                String playerName = scanner.nextLine();
                System.out.println("Number of round to win: ");
                NumberRoundToWin numberRound = new NumberRoundToWin();
                int numberRoundToWin = numberRound.scannerInt(scanner);
                Board board = new Board();
                Player player1Name = new Player(playerName);
                Player player2Name = new Player("Computer");

                System.out.println("Game instruction:");
                System.out.println("Key \"1\" play \"rock\"");
                System.out.println("Key \"2\" playing \"paper\"");
                System.out.println("Key \"3\" playing \"scissors\"");
                System.out.println("Key \"x\" end of the game");
                System.out.println("Key \"n\" restart the game");

                scanner.nextLine();

                while (numberRoundToWin > player1Name.getPlayerPoints() && numberRoundToWin > player2Name.getPlayerPoints()) {
                    System.out.println("Choose move: ");
                    String whatPlayer1Thrown = scanner.nextLine();
                    whatPlayer2Thrown = random.nextInt(3) + 1;
                    if (whatPlayer1Thrown.equals("x")) {
                        System.out.println("Are you sure you want to finish? (y/n)");
                        String sure = scanner.nextLine();
                        if (sure.equals("y")) {
                            end1 = true;
                            end2 = true;
                            numberRoundToWin = 0;
                            System.out.println("Thanks for the game");
                        }
                    } else if (whatPlayer1Thrown.equals("n")) {
                        System.out.println("Are you sure you want to end the current game? (y/n)");
                        String sure = scanner.nextLine();
                        if (sure.equals("y")) {
                            end2 = true;
                            numberRoundToWin = 0;
                            player1Name.restartPoints();
                            player2Name.restartPoints();
                            System.out.println("Reset");
                        }
                    } else if (whatPlayer1Thrown.equals("1") || whatPlayer1Thrown.equals("2") || whatPlayer1Thrown.equals("3")) {
                        Thrown thrown1 = new Thrown(Integer.parseInt(whatPlayer1Thrown));
                        Thrown thrown2 = new Thrown(whatPlayer2Thrown);

                        System.out.println(player1Name.getName() + " chose: " + board.whatPlayerChose(Integer.parseInt(whatPlayer1Thrown)));
                        System.out.println(player2Name.getName() + " chose: " + board.whatPlayerChose(whatPlayer2Thrown));
                        board.whoEntitledPoint(player1Name, thrown1, player2Name, thrown2);
                        System.out.println(player1Name.getName() + ": " + player1Name.getPlayerPoints());
                        System.out.println(player2Name.getName() + ": " + player2Name.getPlayerPoints());
                        System.out.println();
                    } else {

                    }
                }
                System.out.println("The game is over!");
                board.wonPlayer(player1Name, player2Name);
                if (numberRoundToWin != 0) {
                    System.out.println("Choose:");
                    System.out.println("\"x\" - end game");
                    System.out.println("\"n\" - new game");
                    String whatPlayer1Thrown = scanner.nextLine();
                    if (whatPlayer1Thrown.equals("x")) {
                        end1 = true;
                        end2 = true;
                        System.out.println("Thanks for the game");
                    } else if (whatPlayer1Thrown.equals("n")) {
                        end2 = true;
                        player1Name.restartPoints();
                        player2Name.restartPoints();
                        System.out.println("Reset");
                    }
                }
            }
        }
    }
}
