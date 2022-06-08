package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {

     private String name;
     private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book theBook : books) {
            Book clonedBook = new Book(theBook.getTitle(), theBook.author, theBook.publicationDate);
            clonedLibrary.getBooks().add(clonedBook);
        }
        return clonedLibrary;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Library library = (Library) o;

        if (!name.equals(library.name)) return false;
        return books != null ? books.equals(library.books) : library.books == null;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (books != null ? books.hashCode() : 0);
        return result;
    }
}