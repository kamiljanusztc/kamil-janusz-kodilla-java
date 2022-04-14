package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();
        forum.theUsersList();
        LocalDate currentDate = LocalDate.now();

        Map<Integer, ForumUser> userMap = forum.getTheUserList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> forumUser.getDate().isBefore(currentDate.minusYears(20)))
                .filter(forumUser -> forumUser.getPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("Elements: " + userMap.size());
        userMap.entrySet().stream()
                .map(integerForumUserEntry -> integerForumUserEntry.getKey() + ": " + integerForumUserEntry.getValue())
                .forEach(System.out::println);
    }
}