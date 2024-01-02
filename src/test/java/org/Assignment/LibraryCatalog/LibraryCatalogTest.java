package org.Assignment.LibraryCatalog;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryCatalogTest {

    private LibraryCatalog libraryCatalog;

    @BeforeEach
    void setUp() {
        libraryCatalog = new LibraryCatalog();
    }

    @Test
    void testAddBook() {
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger");
        libraryCatalog.addBook(book);

        assertTrue(libraryCatalog.getBooks().contains(book));
    }

    @Test
    void testBorrowBook() {
        Book book = new Book("To Kill a Mockingbird", "Harper Lee");
        libraryCatalog.addBook(book);

        assertTrue(book.isAvailable());
        libraryCatalog.borrowBook("To Kill a Mockingbird");
        assertFalse(book.isAvailable());
    }

    @Test
    void testReturnBook() {
        Book book = new Book("1984", "George Orwell");
        libraryCatalog.addBook(book);

        libraryCatalog.borrowBook("1984");
        assertFalse(book.isAvailable());

        libraryCatalog.returnBook("1984");
        assertTrue(book.isAvailable());
    }
}
