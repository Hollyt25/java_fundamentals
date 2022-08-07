package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Enter a number between 1 and 10 = ");
        int guess = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (guess == array[i]) {
                System.out.println("The numbered you entered is in index = " + i);
            }


        }
    }
}