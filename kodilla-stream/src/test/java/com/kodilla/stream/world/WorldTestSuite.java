package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        World world = new World();
        BigDecimal peopleQuantity = new BigDecimal("10789101030082");
        Assert.assertEquals(peopleQuantity, world.getPeopleQuantity());

    }
}
