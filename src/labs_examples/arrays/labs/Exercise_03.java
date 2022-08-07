package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        int[][] table = new int[5][5];

        int count = 1;

        for(int i=0; i<table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = count * 3;
                count++;
            }
        }
            for(int[] val : table){
                for(int i : val){
                    System.out.print(i + "\t");
                }
                System.out.println();
            }
        
    }
}
