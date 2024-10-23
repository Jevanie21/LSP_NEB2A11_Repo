package org.howard.edu.lsp.midterm.question1;

/**
 * Represents a book in a library.
 */
public class Book {
    // Attributes of the Book class
    private String title;          // The title of the book
    private String author;         // The author of the book
    private String isbn;           // The ISBN number of the book (a unique identifier)
    private int yearPublished;     // The year the book was published

    /**
     * Constructor to initialize a Book object with the given details.
     *
     * @param title The title of the book.
     * @param author The author of the book.
     * @param isbn The ISBN number of the book.
     * @param yearPublished The year the book was published.
     */
    public Book(String title, String author, String isbn, int yearPublished) {
        this.title = title;               // Set the title of the book
        this.author = author;             // Set the author of the book
        this.isbn = isbn;                 // Set the ISBN of the book
        this.yearPublished = yearPublished; // Set the publication year of the book
    }

    // Getter for title
    public String getTitle() {
        return title; // Return the title of the book
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title; // Update the title of the book
    }

    // Getter for author
    public String getAuthor() {
        return author; // Return the author of the book
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author; // Update the author of the book
    }

    // Getter for isbn
    public String getIsbn() {
        return isbn; // Return the ISBN of the book
    }

    // Setter for isbn
    public void setIsbn(String isbn) {
        this.isbn = isbn; // Update the ISBN of the book
    }

    // Getter for yearPublished
    public int getYearPublished() {
        return yearPublished; // Return the year the book was published
    }

    // Setter for yearPublished
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished; // Update the year the book was published
    }

    /**
     * Compares this Book object to another for equality based on ISBN and author.
     *
     * @param obj The object to compare with.
     * @return true if the objects are equal based on ISBN and author, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if the same reference
        if (!(obj instanceof Book)) return false; // Check if obj is an instance of Book
        Book other = (Book) obj; // Cast obj to Book
        return this.isbn.equals(other.isbn) && this.author.equals(other.author); // Compare ISBN and author
    }

    /**
     * Returns a string representation of the Book object.
     *
     * @return A formatted string with book details.
     */
    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s, ISBN: %s, Year Published: %d",
                title, author, isbn, yearPublished); // Format the output
    }
}