/**
 * Created by: Ken
 * Created on: 30/04/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class TestAddressBook {
    public static void main(String[] args) {
        String name;
        AddressBook addressBook = new AddressBook("John");
        System.out.println("Address Book for " + addressBook.getOwner());
        addressBook.fillList();
        addressBook.printList();
        addressBook.calcNumMaleContacts();

        System.out.println("Total Contacts: " + AddressBook.getNumContacts());
    }// Method - main
}// Class - TestAddressBook
