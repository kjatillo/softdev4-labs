package ex3;

/**
 * Created by: Ken
 * Created on: 14/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Book {
    private String isbn;
    private String name;
    private String author;
    private String edition;

    public Book(String isbn, String name, String author, String edition) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.edition = edition;
    }// Constructor - Book

    public String getEdition() {
        return edition;
    }// Getter - Edition

    public void setEdition(String edition) {
        this.edition = edition;
    }// Setter - Edition

    public String getName() {
        return name;
    }// Getter - Name

    public void setName(String name) {
        this.name = name;
    }// Setter - Name

    public String getIsbn() {
        return isbn;
    }// Getter - ISBN

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }// Setter - ISBN

    public String getAuthor() {
        return author;
    }// Getter - Author

    public void setAuthor(String author) {
        this.author = author;
    }// Setter - Author

    public void print() {
        System.out.printf("%-10s%-10s\n", "ISBN", isbn);
        System.out.printf("%-10s%-10s\n", "Name", name);
        System.out.printf("%-10s%-10s\n", "Author", author);
        System.out.printf("%-10s%-10s\n", "Edition", edition);
    }// Method - Print
}// Class - Book
