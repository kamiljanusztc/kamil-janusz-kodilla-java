package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    public final List<ForumUser> theUsersList = new ArrayList<>();

    public void theUsersList() {
        theUsersList.add(new ForumUser(1, "Jon Doe", 'M', 1999, 12, 22, 49));
        theUsersList.add(new ForumUser(2, "Anna Steal", 'F', 2004, 11, 02, 22));
        theUsersList.add(new ForumUser(3, "Kate Doe", 'F', 1998, 06, 11, 44));
        theUsersList.add(new ForumUser(4, "Adam Steal", 'M', 1970, 04, 03, 4));
        theUsersList.add(new ForumUser(5, "Julia Bean", 'F', 1998, 02, 22, 3));
        theUsersList.add(new ForumUser(6, "Mark Bean", 'M', 1982, 01, 23, 5));
        theUsersList.add(new ForumUser(7, "Tom Hanks", 'M', 1980, 10, 22, 66));
        theUsersList.add(new ForumUser(8, "David Tree", 'M', 1980, 11, 12, 0));
    }

    public List<ForumUser> getTheUserList() {
        return new ArrayList<>(theUsersList);
    }
}
