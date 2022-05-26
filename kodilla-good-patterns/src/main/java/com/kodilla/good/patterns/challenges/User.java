package com.kodilla.good.patterns.challenges;

public class User {

    String name;
    String surname;
    int accountId;

    public User(String name, String surname, int accountId) {
        this.name = name;
        this.surname = surname;
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAccountId() {
        return accountId;
    }
}
