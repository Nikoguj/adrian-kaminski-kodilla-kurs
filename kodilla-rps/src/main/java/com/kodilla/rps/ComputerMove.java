package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComputerMove {

    Random random = new Random();

    private int rand;

    public void Draw() {
        this.rand = random.nextInt(5) + 1;
    }

    public Move ComMove(ArrayList<Move> listMove)
    {
        switch (rand)
        {
            case 1:
                return listMove.get(0);
            case 2:
                return listMove.get(1);
            case 3:
                return listMove.get(2);
            case 4:
                return listMove.get(3);
            case 5:
                return listMove.get(4);
            default:
                System.out.println("Problem in computerMove class");
        }
        return null;
    }
}
