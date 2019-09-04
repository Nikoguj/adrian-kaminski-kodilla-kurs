package com.kodilla.rps;

import java.util.ArrayList;

public class NumberToMove {

    public Move convert(int number, ArrayList<Move> listMove)
    {
        switch (number)
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
                System.out.println("Problem in NumberToMove class");
        }
        return null;
    }
}
