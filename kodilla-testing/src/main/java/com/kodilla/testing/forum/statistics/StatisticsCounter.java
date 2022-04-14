package com.kodilla.testing.forum.statistics;

public class StatisticsCounter {

    private int userCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPosts;

    public void calculateAdvStatistics(Statistics statistics) {

        userCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        averagePostsPerUser = (double)postsCount / userCount;
        averageCommentsPerUser = (double)commentsCount / userCount;
        averageCommentsPerPosts = (double)commentsCount / postsCount;
    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPosts() {
        return averageCommentsPerPosts;
    }

    public void showStatistics() {
        System.out.println("Users: " + userCount);
        System.out.println("Posts: " + userCount);
        System.out.println("Comments: " + userCount);
        System.out.println("Average posts per user : " + averagePostsPerUser);
        System.out.println("Average comments per user : " + averageCommentsPerUser);
        System.out.println("Average comments per posts : " + averageCommentsPerPosts);
    }
}
