package ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 01/05/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class TestStudent {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        // Variables
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Student> highGrades;
        int option;

        menu();
        System.out.print("Enter an option: ");
        option = scanner.nextInt();
        scanner.nextLine();
        while (option != 7) {
            switch (option) {
                case 1 -> {
                    File file = new File("files", "students.txt");
                    try (Scanner fileScanner = new Scanner(file)) {
                        while (fileScanner.hasNextLine()) {
                            String line = fileScanner.nextLine();
                            Scanner lineScanner = new Scanner (line);
                            lineScanner.useDelimiter(",");
                            while (lineScanner.hasNext()) {
                                String name = lineScanner.next();
                                String number = lineScanner.next();
                                int result1 = Integer.parseInt(lineScanner.next());
                                int result2 = Integer.parseInt(lineScanner.next());
                                students.add(new Student(name, number, result1, result2));
                            }// inner while
                        }// outer while
                    } catch (FileNotFoundException err) {
                        System.out.println("Error: " + err.getMessage());
                    }// try-catch
                }// case 1

                case 2 -> System.out.println("Number of students: " + students.size());
                case 3 -> {
                    if (students.isEmpty()) {
                        System.out.println("No students found!");
                    } else {
                        print(students);
                    }// if-else
                }// case 3
                case 4 -> {
                    if (students.isEmpty()) {
                        System.out.println("No students found!");
                    } else {
                        System.out.printf("The average of the results is %.2f%n", calcAverage(students));
                    }// if-else
                }// case 4
                case 5 -> {
                    highGrades = getHighGrades(students);
                    if (highGrades.isEmpty()) {
                        System.out.println("No students scored over 80!");
                    } else {
                        System.out.println("[ High Achievers ]");
                        print(highGrades);
                    }// if-else
                }// case 5
                case 6 -> {
                    System.out.print("Enter student number of student to remove: ");
                    String number = scanner.nextLine();

                    for (Student student : students) {
                        if (student.getNumber().equals(number)) {
                            students.remove(student);
                            System.out.printf("\nStudent with student number '%s' removed!\n", student.getNumber());
                            break;
                        }// if
                    }// for
                }// case 6
                default -> System.out.println("Invalid option!");
            }// switch
            System.out.print("\nPress enter to continue...");
            scanner.nextLine();
            menu();
            System.out.print("Enter an option: ");
            option = scanner.nextInt();
            scanner.nextLine();
        }// while
        System.out.println("\nProgram terminated. Goodbye!");
    }// Method - main

    public static void menu() {
        System.out.println("---------------------------------------------");
        System.out.println("[ College Student System ]");
        System.out.println("---------------------------------------------");
        System.out.println("[1] Read student details from file");
        System.out.println("[2] Determine number of students processed");
        System.out.println("[3] Print student details");
        System.out.println("[4] Calculate average of all results");
        System.out.println("[5] Print high achievers");
        System.out.println("[6] Remove a student");
        System.out.println("[7] Exit");
        System.out.println("---------------------------------------------");
    }// Method - menu

    public static void print(ArrayList<Student> students) {
        System.out.println("[ Student List ]");
        for (Student student : students) {
            System.out.println(student);
        }// for
    }// Method - print

    public static double calcAverage(ArrayList<Student> students) {
        double total = 0;
        for (Student student : students) {
            total += student.getAverage();
        }// for

        return total / students.size();
    }// Method - print

    public static ArrayList<Student> getHighGrades(ArrayList<Student> students) {
        ArrayList<Student> highGrades = new ArrayList<>();

        for (Student student : students) {
            if (student.getAverage() > 80) {
                highGrades.add(student);
            }// if
        }// for

        return highGrades;
    }// Method - getHighGrades
}// Class - TestStudent
