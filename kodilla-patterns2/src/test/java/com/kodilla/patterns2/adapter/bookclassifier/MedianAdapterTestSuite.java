package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void testMedianPublicationYear() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();
        Book book1 = new Book("Martin Seymour-Smith", "Citadel", 1998, "P1");
        Book book2 = new Book("Jakub Żulczyk", "Ślepnąc od świateł", 2014, "P5");
        Book book3 = new Book("Brandon Sanderson", "Droga królów", 2010, "P8");
        Book book4 = new Book("Olga Tokarczuk", "Prawiek i inne czasy", 1996, "E10");
        Book book5 = new Book("Michaił Bułhakow", "Mistrz i Małgorzata", 1967, "W2");
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        Assert.assertEquals(1998, median);
    }
}
