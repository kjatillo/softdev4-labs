package ex2;

/**
 * Created by: Ken
 * Created on: 18/02/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class TestStudent {
    public static void main(String[] args) {
        // Declaring/initialising Student class instance
        Student student1 = new Student();
        student1.setStudentID("X00190944");
        student1.setName("Ken");
        student1.setSubject("Software Development");
        student1.setResultCA1(69);
        student1.setResultCA2(99);
        student1.print();  // Displaying student information

        // Declaring/initialising PrintCard class instance
        PrintCard myCard = new PrintCard();
        myCard.setAccountNumber("1234567");
        myCard.setPassword("secret");
        myCard.setNumberOfCredits(200);
        System.out.println();
        myCard.print();// Displaying card information

        // Calculating student average
        double studentAvg = (student1.getResultCA1() + student1.getResultCA2()) / 2.0;
        // Checking student average
        if (studentAvg >= 70)
            myCard.setNumberOfCredits(400);  // Updating credits if average >= 70
        // Output
        System.out.printf("\n%s's average is >= 70. Student's new balance is %d.\n",
                student1.getName(), myCard.getNumberOfCredits());
    }// Main
}// Class - TestStudent
