/**
 * Student Name: Keneith Atillo
 * Student Number: X00190944
 * */

package ex1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rental[] rentalList = new Rental[6];
        int menuOption;

        rentalList[0] = new Book("Wolf Hall", 2009, "Hilary Mantel", "9780008381691", 5, 0);
        rentalList[1] = new Book("Gilead", 2004, "Marilynne Robinson", "9781844081486", 3, 2);
        rentalList[2] = new Book("Autumn", 2016, "Ali Smith", "9780241973318", 1, 4);
        rentalList[3] = new Book("Fun Home", 2006, "Alison Bechdel","9781529116168", 0, 5);
        rentalList[4] = new OnlineJournal("Elsevier", 2022, 20, 45, 450);
        rentalList[5] = new OnlineJournal("Springer", 2013, 45, 60, 700);

        Library lib = new Library();
        lib.fillList(rentalList);
        lib.displayRentalList();

        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("\t\t\t[Select an Option]");
        System.out.println("---------------------------------------------");
        System.out.println("[1] Online Journal Subscriptions - Revenue");
        System.out.println("[2] Cancel Online Journal Subscription");
        System.out.println("[3] Return a Book");
        System.out.println("[4] Take Out a Book");
        System.out.println("[5] Exit");
        System.out.println("---------------------------------------------");
        System.out.print("Option: ");
        menuOption = scanner.nextInt();
        scanner.nextLine();

        while (menuOption != 5) {
            switch (menuOption) {
                case 1:
                    System.out.println();
                    lib.calcRevenue();  // case - 1
                    break;
                case 2: {
                    System.out.print("Which online subscription do you wish to cancel? (5 or 6): ");
                    int onlineSub = scanner.nextInt();

                    if (onlineSub == 5) {
                        lib.cancelSub(5);
                    } else if (onlineSub == 6) {
                        lib.cancelSub(6);
                    } else {
                        System.out.println("Invalid input!");
                    }// if-else
                }// case - 2
                break;
                case 3: {
                    System.out.print("Enter the number of the book you wish to return: ");
                    int bookNum = scanner.nextInt();
                    lib.returnBook(bookNum - 1);
                }// case - 3
                break;
                case 4: {
                    System.out.print("Enter the number of the book you wish to borrow: ");
                    int bookNum = scanner.nextInt();
                    lib.checkOutBook(bookNum - 1);
                }// case - 4
                break;
                default:
                    System.out.println("Invalid input!");
            }// switch
            System.out.println();
            lib.displayRentalList();
            System.out.println();
            System.out.println("---------------------------------------------");
            System.out.println("\t\t\t[Select an Option]");
            System.out.println("---------------------------------------------");
            System.out.println("[1] Online Journal Subscriptions - Revenue");
            System.out.println("[2] Cancel Online Journal Subscription");
            System.out.println("[3] Return a Book");
            System.out.println("[4] Take Out a Book");
            System.out.println("[5] Exit");
            System.out.println("---------------------------------------------");
            System.out.print("Option: ");
            menuOption = scanner.nextInt();
        }// while
        System.out.println("\nProgram ended. Goodbye!");
    }// Main
}// Class - Test
