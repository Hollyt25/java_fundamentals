package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        boolean isWeekend = true;
        System.out.println("Is it the weekend = " +isWeekend);

        char thisChar = 'x';
        System.out.println("This is the character = " + thisChar);

        byte thisByte = 100;
        System.out.println("This is the number in byte = "+ thisByte);

        short thisShort = 20000;
        System.out.println("This is the number in short = " + thisShort);

        int thisInt = 2000000;
        System.out.println("This is the number in int = " + thisInt);

        long thisLong = 90000000000l;
        System.out.println("This is the number in long = " + thisLong);

        float thisFloat = 3.14f;
        System.out.println("This is the decimal number in float = " + thisFloat);

        double thisDouble = 21.321894021;
        System.out.println("This is the decimal number in double = " + thisDouble);

    }

}
