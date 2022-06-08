package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        //Given
        User userMillenials = new Millenials("user millenials");
        User userYGen = new YGeneration("user y gen");
        User userZGen = new ZGeneration("user z gen");

        //When
        String userMilleniualsShare = userMillenials.sharePost();
        System.out.println("userMilleniualsShare: " + userMilleniualsShare);
        String userYGenShare = userYGen.sharePost();
        System.out.println("userYGen: " + userYGenShare);
        String userZGenShare = userZGen.sharePost();
        System.out.println("userZGen: " + userZGenShare);

        //Then
        assertEquals("Snapchat", userMilleniualsShare);
        assertEquals("Facebook", userYGenShare);
        assertEquals("Twitter", userZGenShare);
    }

    @Test
    void testIndividualSharingStrategy() {

        //Given
        User user = new Millenials("millenials");

        //When
        System.out.println("before change: " + user.sharePost());
        user.setSocialMedia(new TwitterPublisher());
        String millenialsChanged = user.sharePost();
        System.out.println("changed: " + millenialsChanged);

        //Then
        assertEquals("Twitter", millenialsChanged);
    }
}
