package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

public class MethodTraining {
    public static void main(String[] args) {

        int a = 12;
        int b = 29;
        int c = 35;
        double d = 54.12;
        double e = 48.24;

        System.out.println(addition(a, b));
        System.out.println(addition(a, b, c));
        System.out.println(addition(d, e));
        System.out.println(addition(a, b, b, d, e));

        System.out.println(largest(12, 24, 56, 10));

        System.out.println(consonants("Hi my name is Holly and I work for Amazon"));

        System.out.println(isPrime(7));

        int[] list = {12, 24, 1, 36, 4, 8, 12, };
        int[] result = highAndLow(list);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }

        System.out.println(divisible(50, 3, 2).size());

        int[] reverse = reverse();
        for(int i=0; i<reverse.length; i++){
            System.out.println(reverse[i]);
        }


    }

    //1. overloading
    public static int addition(int a, int b) {
        return a + b;
    }

    //1. overloading
    public static int addition(int a, int b, int c) {
        return a + b + c;
    }

    //1. overloading
    public static double addition(double d, double e) {
        return d + e;
    }

    //1. overloading
    public static double addition(int a, int b, int c, double d, double e) {
        return a + b + c + d + e;
    }

    //3. largest number
    public static int largest(int f, int g, int h, int i) {
        int first = Math.max(f, g);
        int second = Math.max(first, h);
        int large = Math.max(second, i);

        return large;

    }

    //4. count consonants
    public static int consonants(String str) {
        String lower = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (lower.charAt(i) != 'a' && lower.charAt(i) != 'e' && lower.charAt(i) != 'i' && lower.charAt(i) != 'o' && lower.charAt(i) != 'u' && lower.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    //5. prime or not
    public static boolean isPrime(int p) {
        if (p <= 0) {
            return false;
        }
        for (int i = 2; i < p / 2; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

    //6 highest and lowers
    public static int[] highAndLow(int[] list) {
        int[] highLow = new int[2];
        int high = list[0];
        int low = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > high) {
                high = list[i];
            }
            if (list[i] < low) {
                low = list[i];
            }
        }
        highLow[0] = high;
        highLow[1] = low;
        return highLow;
    }
    //8 Arraylist divisible by 2 numbers
    public static ArrayList<Integer> divisible(int maxNum, int divisor1, int divisor2){
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<=maxNum; i++){
            if (i % divisor1 == 0 && i % divisor2 == 0) {
                list.add(i);
            }
        }
        return list;
    }
    //9 reverse array
    public static int[] reverse() {

        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
        int temp = 0;

        for (int i = 0; i<list.length /2; i++) {
            temp = list[i];
            list[i] = list.length - i -1;
            list[list.length -i -1] = temp;
        }
        return list;
    }










    }




