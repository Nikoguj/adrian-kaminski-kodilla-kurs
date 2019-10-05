package com.kodilla.good.patterns.challenges;

import java.util.Random;

public class ProductOderService {

    public boolean order(User user, String product) {
        Random random = new Random();
        return random.nextBoolean();
    }
}
