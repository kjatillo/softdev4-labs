package ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 01/05/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Ex1 {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        // Array
        List<Integer> list = new ArrayList<>();
        // Variables
        int countNum;
        int inputNum;
        int sum = 0;

        // Prompt user
        System.out.print("Enter the number of numbers: ");
        countNum = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < countNum; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            inputNum = scanner.nextInt();
            scanner.nextLine();
            list.add(inputNum);
        }// For

        // Add the numbers in the array
        for (Integer integer : list) {
            sum += integer;
        }// For

        // Print the sum
        System.out.println("The sum of the numbers is " + sum);

        // Static methods
        print(list);
        numOfNegatives(list);
        evenCount(list);
        oddCount(list);
    }// Method - main

    public static void print(List<Integer> intArray) {
        // Print the array
        for (int num : intArray) {
            System.out.println("Number: " + num);
        }// For
    }// Method - print

    public static void numOfNegatives(List<Integer> intArray) {
        int countNegativeNums = 0;

        for (int num : intArray) {
            if (num < 0) {
                countNegativeNums++;
            }// If
        }// For

        System.out.println("The number of negative numbers: " + countNegativeNums);
    }// Method - numOfNegatives

    public static void evenCount(List<Integer> intArray) {
        int countEvenNums = 0;

        for (int num : intArray) {
            if (num % 2 == 0) {
                countEvenNums++;
            }// If
        }// For

        System.out.println("The number of even numbers: " + countEvenNums);
    }// Method - evenCount

    public static void oddCount(List<Integer> intArray) {
        int countOddNums = 0;

        for (int num : intArray) {
            if (num % 2 != 0) {
                countOddNums++;
            }// If
        }// For

        System.out.println("The number of odd numbers: " + countOddNums);
    }// Method - oddCount
}// Class - Ex1
