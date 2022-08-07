package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {


        String[][] animals = {
                { "Dog", "Cat", "Hamster", "Ferret" },
                { "Bear", "Lion", "Elephant"},
                { "Whale", "Shark", "Fish", "Ray", "StarFish"}
        };

        for (String[] s : animals) {
            for (String t : s) {
                System.out.print(t + "  ");
            }
            System.out.println();
        }


    }
}
