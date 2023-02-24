import java.util.Scanner;

public class TestUndergraduate {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Variable
        String studentName;
        int studentNumber;
        int numExams;
        int yearOfStudy;
        double examResult;
        String processAnother;

        boolean processingStudent = true;
        while (processingStudent) {
            // User input
            System.out.print("Enter student name: ");
            studentName = input.nextLine();
            System.out.print("Enter student number: ");
            studentNumber = input.nextInt();
            System.out.print("Enter number of exams: ");
            numExams = input.nextInt();
            input.nextLine();
            System.out.print("Enter year of study: ");
            yearOfStudy = input.nextInt();
            input.nextLine();

            Undergraduate ug = new Undergraduate(studentName, studentNumber, numExams, yearOfStudy);

            for (int result = 0; result < numExams; result++) {
                System.out.printf("Enter result for exam %d: ", result + 1);
                examResult = input.nextDouble();
                input.nextLine();
                ug.setResult(result, examResult);
            }// for loop

            System.out.println();
            ug.processResults();
            ug.print();
            System.out.printf("GPA: %.2f\n", ug.calcGPA());
            ug.calcRepeatFee();

            System.out.print("Do you wish to process another student? (Yes/No): ");
            processAnother = input.nextLine();
            if (processAnother.equals("no")) {
                processingStudent = false;
            }
            System.out.println();
        }// while loop

    }// Main
}// Class - TestUndergraduate
