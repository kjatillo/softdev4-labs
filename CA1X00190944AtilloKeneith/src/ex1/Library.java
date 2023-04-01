/**
 * Student Name: Keneith Atillo
 * Student Number: X00190944
 * */

package ex1;

import java.text.DecimalFormat;

public class Library {
    private Rental[] rentalList;

    public void fillList(Rental[] rentalList) {
        this.rentalList = rentalList;
    }// Method - fillList

    public void cancelSub(int onlineSubNum) {
        OnlineJournal sub = (OnlineJournal) rentalList[onlineSubNum - 1];

        sub.processReturn();
    }// Method - cancelSub

    public void displayRentalList() {
        for (Rental item: rentalList) {
            System.out.println(item);
        }// for
    }// Method - displayRentalList

    public void calcRevenue() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        double revenue = 0;

        for (Rental item: rentalList) {
            if (item instanceof OnlineJournal) {
                OnlineJournal sub = (OnlineJournal) item;
                revenue += sub.getNumSubscription() * sub.getMonthlyPrice();
            }// if
        }// for

        System.out.println("Total Revenue: €" + df.format(revenue));
    }// Method - calcRevenue

    public void checkOutBook(int bookNum) {
        if (rentalList[bookNum] instanceof Book) {
            Book book = (Book) rentalList[bookNum];
            if (book.getStockQuantity() > 0) {
                book.checkout();
            } else {
                System.out.println("Sorry! This book is out of stock.");
            }// inner if-else
        }// if
    }// Method - checkOutBook

    public void returnBook(int bookNum) {
        if (rentalList[bookNum] instanceof Book) {
            Book book = (Book) rentalList[bookNum];
            book.processReturn();
        }// if
    }// Method - returnBook
}// Class - Library
