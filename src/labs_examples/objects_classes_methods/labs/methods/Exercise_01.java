package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int a = 12;
        int b = 3;

        System.out.println(multiply(a, b));
        System.out.println(divide(a, b));

        String str = "What kind of exercises do lazy people do ?";
        joke(str);

        int y = 44;
        System.out.println(year(y));

        System.out.println(count(12,34, 26, 15, 42, 543, 43243, 432, 153));

    }

    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b) {
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke(String str) {
        String joke = str;
        System.out.println(str);
        String answer = "Diddly - squats";
        System.out.println(answer);
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static long year(int y) {
        long seconds = 31536000;
        return seconds * y;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int count(int... v) {
        int count = 0;
        for (int i : v) {
            count++;
        }
        return count;
    }
}







