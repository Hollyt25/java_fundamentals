package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] list = new int[10];

        for(int i=0; i<list.length; i++){
            System.out.println("Enter number for array index " + i);
            list[i] = scanner.nextInt();
            System.out.println("This is the value of this int = " + list[i]);
        }

        int sum = 0;
        for(int i =0; i<list.length; i++) {
            sum += list[i];
        }
        System.out.println("This is the sum of all the numbers in the array = " + sum);

        int average = sum/10;

        System.out.println("This is the average of all the numbers we added = " + average);





    }

}