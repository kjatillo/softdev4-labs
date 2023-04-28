import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 28/04/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class TestBank {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        // Variables
        int accountNum = 0;
        String accountType = null;
        String firstName = null;
        String lastName = null;
        double balance = 0;
        int pin = 0;
        // Objects
        Bank bank = new Bank();
        File file = new File("files", "data.txt");
        DecimalFormat df = new DecimalFormat("#,##0.00");

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter(",");
                while (lineScanner.hasNext()) {
                    accountNum = lineScanner.nextInt();
                    accountType = lineScanner.next();
                    firstName = lineScanner.next();
                    lastName = lineScanner.next();
                    balance = Double.parseDouble(lineScanner.next());
                    pin = lineScanner.nextInt();
                }// inner-while
                bank.addAccount(accountNum, accountType, firstName, lastName, balance, pin);
            }// outer-while
        } catch (FileNotFoundException err) {
            System.out.println(err.getMessage());
        }// try-catch

        boolean selectingOption = true;
        while (selectingOption) {
            System.out.println("[1] View all accounts");
            System.out.println("[2] Change pin");
            System.out.println("[3] View total amount of all savings accounts");
            System.out.println("[4] Apply tax to all current accounts");
            System.out.println("[5] Sort accounts by last name in ascending order");
            System.out.println("[6] Sort accounts by balance in ascending order");
            System.out.println("[7] Exit");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> bank.showAccounts();
                case 2 -> {
                    System.out.print("Enter account number: ");
                    accountNum = scanner.nextInt();
                    scanner.nextLine();

                    if (bank.findAccount(accountNum) == -1) {
                        System.out.println("Account not found");
                    } else {
                        System.out.print("Enter new pin: ");
                        pin = scanner.nextInt();
                        scanner.nextLine();
                        bank.changePin(accountNum, pin);
                        System.out.println("Pin successfully changed!");
                    }// if-else
                }// case 2
                case 3 -> System.out.println("Total amount of all savings accounts: €" + df.format(bank.calcTotalSavings()));
                case 4 -> {
                    bank.applyTax();
                    System.out.println("Tax applied to all current accounts");
                }// case 4
                case 5 -> {
                    bank.sortAccounts1();
                    System.out.println("Accounts sorted by last name in ascending order");
                }// case 5
                case 6 -> {
                    bank.sortAccounts2();
                    System.out.println("Accounts sorted by balance in ascending order");
                }// case 6
                case 7 -> {
                    System.out.println("\nProgram terminated. Goodbye!");
                    selectingOption = false;
                }// case 7
                default -> System.out.println("Invalid input! Choose an option from the menu.");
            }// switch
            System.out.print("\nPress enter to continue...");
            scanner.nextLine();
        }// while
    }// Method - main
}// Class - TestBank
