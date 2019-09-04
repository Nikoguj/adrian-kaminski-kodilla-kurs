package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MoveContainer moveContainer = new MoveContainer();
        ConstantlyContainer constantlyContainer = new ConstantlyContainer();
        NumberToMove numberToMove = new NumberToMove();

        List<String> rockWinWith = new ArrayList<>();
        rockWinWith.add(moveContainer.SCISSORS);
        rockWinWith.add(moveContainer.LIZARD);
        rockWinWith.add(moveContainer.ROCK);
        Move rock = new Move(moveContainer.ROCK, rockWinWith);

        List<String> scissorsWinWith = new ArrayList<>();
        scissorsWinWith.add(moveContainer.PAPER);
        scissorsWinWith.add(moveContainer.LIZARD);
        scissorsWinWith.add(moveContainer.SCISSORS);
        Move scissors = new Move(moveContainer.SCISSORS, scissorsWinWith);

        List<String> paperWinWith = new ArrayList<>();
        paperWinWith.add(moveContainer.ROCK);
        paperWinWith.add(moveContainer.SPOCK);
        paperWinWith.add(moveContainer.PAPER);
        Move paper = new Move(moveContainer.PAPER, paperWinWith);

        List<String> lizardWinWith = new ArrayList<>();
        lizardWinWith.add(moveContainer.SPOCK);
        lizardWinWith.add(moveContainer.PAPER);
        lizardWinWith.add(moveContainer.LIZARD);
        Move lizard = new Move(moveContainer.LIZARD, lizardWinWith);

        List<String> spockWinWith = new ArrayList<>();
        spockWinWith.add(moveContainer.SCISSORS);
        spockWinWith.add(moveContainer.ROCK);
        spockWinWith.add(moveContainer.SPOCK);
        Move spock = new Move(moveContainer.SPOCK, spockWinWith);


        ArrayList<Move> listMove = new ArrayList<>();
        listMove.add(rock);
        listMove.add(scissors);
        listMove.add(paper);
        listMove.add(lizard);
        listMove.add(spock);


        boolean end1 = false;
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

                ComputerMove computerMove = new ComputerMove();

                System.out.println("Game instruction:");
                System.out.println("Key \"1\" play \"rock\"");
                System.out.println("Key \"2\" playing \"paper\"");
                System.out.println("Key \"3\" playing \"scissors\"");
                System.out.println("Key \"4\" playing \"lizard\"");
                System.out.println("Key \"5\" playing \"spock\"");
                System.out.println("Key \"x\" end of the game");
                System.out.println("Key \"n\" restart the game");

                scanner.nextLine();

                while (NumberWinningsReached(numberRoundToWin, player1Name, player2Name)) {
                    System.out.println("Choose move: ");
                    String whatPlayer1Thrown = scanner.nextLine();
                    if (whatPlayer1Thrown.equals(constantlyContainer.EXIT)) {
                        System.out.println("Are you sure you want to finish? (y/n)");
                        String sure = scanner.nextLine();
                        if (sure.equals(constantlyContainer.YES)) {
                            end1 = true;
                            end2 = true;
                            numberRoundToWin = 0;
                            System.out.println("Thanks for the game");
                        }
                    } else if (whatPlayer1Thrown.equals(constantlyContainer.NEW)) {
                        System.out.println("Are you sure you want to end the current game? (y/n)");
                        String sure = scanner.nextLine();
                        if (sure.equals(constantlyContainer.YES)) {
                            end2 = true;
                            numberRoundToWin = 0;
                            player1Name.restartPoints();
                            player2Name.restartPoints();
                            System.out.println("Reset");
                        }
                    } else {
                        try {
                            Move player1Move = numberToMove.convert(Integer.parseInt(whatPlayer1Thrown), listMove);

                            if (player1Move.getName().equals(moveContainer.ROCK)) {
                                computerMove.Draw();
                                ShowNameAndPlayerChose(computerMove.ComMove(listMove), rock, board, player1Name, player2Name);
                                board.whoEntitledPoint(player1Name, rock, player2Name, computerMove.ComMove(listMove));
                                ShowNameAndPlayerPoints(player1Name, player2Name);
                                System.out.println();
                            } else if (player1Move.getName().equals(moveContainer.SCISSORS)) {
                                computerMove.Draw();
                                ShowNameAndPlayerChose(computerMove.ComMove(listMove), scissors, board, player1Name, player2Name);
                                board.whoEntitledPoint(player1Name, scissors, player2Name, computerMove.ComMove(listMove));
                                ShowNameAndPlayerPoints(player1Name, player2Name);
                                System.out.println();
                            } else if (player1Move.getName().equals(moveContainer.PAPER)) {
                                computerMove.Draw();
                                ShowNameAndPlayerChose(computerMove.ComMove(listMove), paper, board, player1Name, player2Name);
                                board.whoEntitledPoint(player1Name, paper, player2Name, computerMove.ComMove(listMove));
                                ShowNameAndPlayerPoints(player1Name, player2Name);
                                System.out.println();
                            } else if (player1Move.getName().equals(moveContainer.LIZARD)) {

                                computerMove.Draw();
                                ShowNameAndPlayerChose(computerMove.ComMove(listMove), lizard, board, player1Name, player2Name);
                                board.whoEntitledPoint(player1Name, lizard, player2Name, computerMove.ComMove(listMove));
                                ShowNameAndPlayerPoints(player1Name, player2Name);
                                System.out.println();
                            } else if (player1Move.getName().equals(moveContainer.SPOCK)) {
                                computerMove.Draw();
                                ShowNameAndPlayerChose(computerMove.ComMove(listMove), spock, board, player1Name, player2Name);
                                board.whoEntitledPoint(player1Name, spock, player2Name, computerMove.ComMove(listMove));
                                ShowNameAndPlayerPoints(player1Name, player2Name);
                                System.out.println();
                            }

                        } catch (NumberFormatException | NullPointerException nfe) {
                            System.out.println("Bad value");
                        }
                    }
                }
                System.out.println("The game is over!");
                board.wonPlayer(player1Name, player2Name);
                if (numberRoundToWin != 0) {
                    System.out.println("Choose:");
                    System.out.println("\"x\" - end game");
                    System.out.println("\"n\" - new game");
                    String whatPlayer1Thrown = scanner.nextLine();
                    if (whatPlayer1Thrown.equals(constantlyContainer.EXIT)) {
                        end1 = true;
                        end2 = true;
                        System.out.println("Thanks for the game");
                    } else if (whatPlayer1Thrown.equals(constantlyContainer.NEW)) {
                        end2 = true;
                        player1Name.restartPoints();
                        player2Name.restartPoints();
                        System.out.println("Reset");
                    }
                }
            }
        }
    }

    private static boolean NumberWinningsReached(int numberRoundToWin, Player player1Name, Player player2Name) {
        return numberRoundToWin > player1Name.getPlayerPoints() && numberRoundToWin > player2Name.getPlayerPoints();
    }

    private static void ShowNameAndPlayerChose(Move whatPlayer2Thrown, Move whatPlayer1Thrown, Board board, Player player1Name, Player player2Name) {
        System.out.println(player1Name.getName() + " chose: " + whatPlayer1Thrown.getName());
        System.out.println(player2Name.getName() + " chose: " + whatPlayer2Thrown.getName());
    }

    private static void ShowNameAndPlayerPoints(Player player1Name, Player player2Name) {
        System.out.println(player1Name.getName() + ": " + player1Name.getPlayerPoints());
        System.out.println(player2Name.getName() + ": " + player2Name.getPlayerPoints());
    }
}
