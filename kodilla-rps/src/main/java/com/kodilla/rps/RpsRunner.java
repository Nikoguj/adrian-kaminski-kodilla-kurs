package com.kodilla.rps;

public class RpsRunner {
    public static void main(String args[])
    {
        System.out.println("Welcome to the game \"Rock Paper Scissors\"");
        System.out.print("Your name: ");
        String name = System.console().readLine();
        System.out.print("Number of round to win: ");
        int numberRoundToWin = Integer.parseInt(System.console().readLine());
        Board board = new Board(numberRoundToWin, name);
        System.out.println("Game instruction:");
        System.out.println("Key \"1\" play \"stone\"");
        System.out.println("Key \"2\" playing \"paper\"");
        System.out.println("Key \"3\" playing \"scissors\",");
        System.out.println("Key \"x\" end of the game");
        System.out.println("Key \"n\" restart the game");
    }
}
