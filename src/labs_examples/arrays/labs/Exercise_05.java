package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {

        int[] numbers = new int[20];


        for (int i = 0; i < numbers.length; i++) {
            numbers[(numbers.length - 1) - i] = i;

        }
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                System.out.println(numbers[i]);
            }

        }
    }
}


