package ex3;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 14/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class TestBook {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Declare book objects
        Book b1;
        Book b2;

        // User input for book 1
        System.out.print("Enter ISBN for Book 1: ");
        String isbn = input.nextLine();

        System.out.print("Enter name for Book 1: ");
        String name = input.nextLine();

        System.out.print("Enter author for Book 1: ");
        String author = input.nextLine();

        System.out.print("Enter edition for Book 1: ");
        String edition = input.nextLine();

        // Initialise book 1
        b1 = new Book(isbn, name, author, edition);

        // User input for book 2
        System.out.print("Enter ISBN for Book 2: ");
        isbn = input.nextLine();

        System.out.print("Enter name for Book 2: ");
        name = input.nextLine();

        System.out.print("Enter author for Book 2: ");
        author = input.nextLine();

        System.out.print("Enter edition for Book 2: ");
        edition = input.nextLine();

        // Initialise book 2
        b2 = new Book(isbn, name, author, edition);

        // Output
        System.out.println();
        b1.print();
        System.out.println();
        b2.print();

        // Setting new value for book 1 edition
        System.out.print("Enter new edition for book 1: ");
        edition = input.nextLine();
        b1.setEdition(edition);
        System.out.println();
        b1.print();
        System.out.println();
        b2.print();
    }// Main
}// Class - TestBook
