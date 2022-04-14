package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int id;
    private final String name;
    private final char gender;
    private final LocalDate date;
    private final int posts;

    public ForumUser(int id, String name, char gender, int year, int month, int day, int posts) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.date = LocalDate.of(year, month, day);
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", date=" + date +
                ", posts=" + posts +
                '}';
    }
}
