import java.util.Comparator;

/**
 * Created by: Ken
 * Created on: 28/04/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class NameComparator implements Comparator<Account> {
    @Override
    public int compare(Account a1, Account a2) {
        return a1.getLastName().compareTo(a2.getLastName());
    }// Method - compare
}// Class - NameComparator
