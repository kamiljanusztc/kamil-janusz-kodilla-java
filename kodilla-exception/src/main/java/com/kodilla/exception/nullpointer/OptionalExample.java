package com.kodilla.exception.nullpointer;

import com.kodilla.exception.nullpointer.UserSecondary;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        UserSecondary userSecondary = new UserSecondary();

        Optional<UserSecondary> optionalUser = Optional.ofNullable(userSecondary);

        optionalUser.ifPresent(u -> System.out.println(u.getUsername()));
    }
}