package org.howard.edu.lsp.midterm.question1;

/**
 * A driver class to test the functionality of the Book class.
 */
public class BookDriver {
    public static void main(String[] args) {
        // Create book instances
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);

        // Check equality between book1 and book2
        System.out.println(book1.equals(book2)); // Output: true

        // Check equality between book1 and book3
        System.out.println(book1.equals(book3)); // Output: false

        // Print details of book1
        System.out.println(book1); // Output: Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 123456789, Year Published: 1925
    }
}