package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        Library library = new Library("Library 1");

        Book book1 = new Book("Zbrodnia i kara", "Fiodor Dostojewski", LocalDate.of(1866, 2, 15));
        Book book2 = new Book("Lolita", "Vladimir Nabokov", LocalDate.of(1955, 9, 10));
        Book book3 = new Book("Miłość w czasach zarazy", "Gabriel García Márquez", LocalDate.of(1985, 2, 9));
        Book book4 = new Book("Miasto ślepców", "José Saramago", LocalDate.of(1995, 10, 14));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(library.getBooks(), library.getBooks());
        Assert.assertEquals(4, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), shallowClonedLibrary.getBooks());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
        Assert.assertNotEquals(library.getBooks(), deepClonedLibrary.getBooks());
    }
}
