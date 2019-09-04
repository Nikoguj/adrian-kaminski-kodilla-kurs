package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class Move {
    private final String name;
    private List<String> winWith = new ArrayList<String>();

    public Move(String name, List<String> winWith) {
        this.name = name;
        this.winWith = winWith;
    }

    public String getName() {
        return name;
    }

    public List<String> getWinWith() {
        return winWith;
    }
}
