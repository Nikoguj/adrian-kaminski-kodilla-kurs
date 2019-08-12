package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers)
    {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for(Integer num: numbers)
        {
            if(num % 2 == 0)
            {
                newList.add(num);
            }
        }
        return(newList);
    }
}
