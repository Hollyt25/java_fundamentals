package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        int count = 0;
        for(int i=0; i<21; i++){
            list.add(i, count);
            count++;
            System.out.println(list.get(i));
        }

      ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2 = (ArrayList)list.clone();
        for(int i=0; i<list2.size(); i++){
            System.out.println("copy of ArrayList list " + list2.get(i));
        }

        if(list.contains(5)){
            System.out.println(list.indexOf(4));
        }

        System.out.println(list.isEmpty());


    }
}
