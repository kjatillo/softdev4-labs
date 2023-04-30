import java.io.*;
import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 30/04/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class AddressBook {
    private String owner;
    private static int numContacts;
    private Contact[] contacts;

    public AddressBook(String owner) {
        this.owner = owner;
        contacts = new Contact[7];
    }// Constructor - AddressBook

    public String getOwner() {
        return owner;
    }// Getter - owner

//    public void fillList() {
//        /**
//         * Version 1 - Using a Scanner
//         **/
//        String name;
//        String mobile;
//        char gender;
//        String strGender;
//        int counter = 0;
//
//        File file = new File("files", "contacts.txt");
//        try (Scanner fileScanner = new Scanner(file)) {
//            while (fileScanner.hasNextLine()) {
//                name = fileScanner.nextLine();
//                strGender = fileScanner.nextLine();
//                gender = strGender.charAt(0);
//                mobile = fileScanner.nextLine();
//                contacts[counter] = new Contact(name, gender, mobile);
//                counter++;
//                numContacts++;
//            }// while
//        } catch (FileNotFoundException err) {
//            System.out.println("Error reading file: " + err);
//        }// try-catch
//    }// Method - fillList

    public void fillList() {
        /**
         * Version 2 - Using a BufferedReader
         **/
        String name;
        String mobile;
        char gender;
        String strGender;
        int counter = 0;

        File file = new File("files", "contacts.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                name = line;
                strGender = reader.readLine();
                gender = strGender.charAt(0);
                mobile = reader.readLine();
                contacts[counter] = new Contact(name, gender, mobile);
                counter++;
                numContacts++;
            }// while
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }// try-catch
    }// Method - fillList

//    public void fillList() {
//        /**
//         * Version 3 - Using a Scanner and comma as a delimiter
//         **/
//        String name = null;
//        String mobile = null;
//        char gender = 0;
//        String strGender;
//        int counter = 0;
//
//        File file = new File("files", "contacts.txt");
//        try (Scanner fileScanner = new Scanner(file)) {
//            while (fileScanner.hasNextLine()) {
//                String line = fileScanner.nextLine();
//                Scanner lineScanner = new Scanner(line);
//                lineScanner.useDelimiter(",");
//
//                while (lineScanner.hasNext()) {
//                    name = lineScanner.next();
//                    strGender = lineScanner.next();
//                    gender = strGender.charAt(0);
//                    mobile = lineScanner.next();
//                }// inner while
//                contacts[counter] = new Contact(name, gender, mobile);
//                counter++;
//                numContacts++;
//            }// outer while
//        } catch (Exception e) {
//            System.out.println("Error reading file: " + e);
//        }
//    }// Method - fillList

    public void printList() {
        System.out.printf("%15s%10s%15s\n", "Name", "Gender", "Mobile");
        for (int i = 0; i < numContacts; i++) {
            System.out.printf("%15s%10s%15s\n", contacts[i].getName(), contacts[i].getGender(), contacts[i].getMobile());
        }// for
    }// Method - printList

    public int calcNumMaleContacts() {
        int numMales = 0;

        for (int i = 0; i < numContacts; i++) {
            if (contacts[i].getGender() == 'M' || contacts[i].getGender() == 'm') {
                numMales++;
            }// if
        }// for

        return numMales;
    }// Method - calcNumMaleContacts

    public static int getNumContacts() {
        return numContacts;
    }// Getter - numContacts
}// Class - AddressBook
