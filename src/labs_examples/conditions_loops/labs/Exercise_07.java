package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to check for the first vowel ");
        String test = scanner.next();
        int i = 0;
        while(i < test.length()){
            if(test.charAt(i) == 'a' || test.charAt(i) == 'e' || test.charAt(i) == 'i' || test.charAt(i) == '0' || test.charAt(i) == 'u'){
                System.out.println("The first vowel in  " + test + " is " + test.charAt(i));
                break;
            }
            i++;
        }
    }
}
