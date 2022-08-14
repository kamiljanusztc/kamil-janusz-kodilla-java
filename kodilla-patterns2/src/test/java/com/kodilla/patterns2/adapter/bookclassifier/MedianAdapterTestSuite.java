package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();

        Book book1 = new Book("Mark Doe", "Wishes", 1999, "01");
        Book book2 = new Book("John Doe", "Masters", 2003, "03");
        Book book3 = new Book("Adam Doe", "Winner", 2012, "04");
        Book book4 = new Book("Joe Doe", "Humble", 2010, "05");
        Book book5 = new Book("Anna Doe", "Belief", 2015, "06");

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        //When
        int medianResult = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2010, medianResult);
    }
}
