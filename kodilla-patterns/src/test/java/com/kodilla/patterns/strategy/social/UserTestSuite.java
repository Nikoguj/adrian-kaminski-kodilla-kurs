package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new YGeneration("Steven");
        User user2 = new Millenials("John");
        User user3 = new ZGeneration("Tom");

        //When
        String user1Social = user1.sharePost();
        System.out.println("Steven use " + user1Social);
        String user2Social = user2.sharePost();
        System.out.println("John use " + user2Social);
        String user3Social = user3.sharePost();
        System.out.println("Tom use " + user3Social);

        //Then
        Assert.assertEquals("Facebook", user1Social);
        Assert.assertEquals("Twitter", user2Social);
        Assert.assertEquals("SnapChat", user3Social);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new YGeneration("Steven");
        //When
        String user1Social = user1.sharePost();
        System.out.println("Steven use " + user1Social);
        user1.setSocialPublisher(new SnapchatPublisher());
        user1Social = user1.sharePost();
        System.out.println("Steven use " + user1Social);

        //Then
        Assert.assertEquals("SnapChat", user1Social);
    }
}
