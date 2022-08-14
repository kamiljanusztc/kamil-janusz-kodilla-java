package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;

import java.util.Arrays;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {

        if (bookSet.size() == 0) return 0;
        int[] years = new int[bookSet.size()];
        int n = 0;

        for (Book book : bookSet) {
            int bookPublicationYear = book.getPublicationYear();
            years[n] = bookPublicationYear;
            n++;
        }
        Arrays.sort(years);
        return years[years.length / 2];
    }
}
