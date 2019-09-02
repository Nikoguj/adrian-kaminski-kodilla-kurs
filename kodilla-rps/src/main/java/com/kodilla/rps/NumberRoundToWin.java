package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberRoundToWin {

    public int scannerInt(Scanner scanner) {
        int num = 0;
        boolean loop = true;

        while (loop) {
            try {
                num = scanner.nextInt();

                loop = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value!");
                scanner.next();
            }
        }
        return num;
    }
}
