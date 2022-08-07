package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input lower bound number");
        int lower = scanner.nextInt();
        System.out.println("Input the upper bound number");
        int upper = scanner.nextInt();
        int add = 0;
        int count = 0;

        for(int i = lower; i <= upper; i++){
        add += i;
        count++;
    }
        System.out.println("Total of all the numbers between lower and upper numbers = " + add);
        int average = add/count;
        System.out.println("The average of all numbers between lower and upper numbers = " + count);


    }
}
