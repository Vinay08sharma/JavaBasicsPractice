package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicatesArrayList {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Vinay", "Sharma","QA", "SDET"));
        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList("Vinay", "Sharma","QA", "SDET1"));

//        arr.retainAll(arr1);// will return the common values between two arrays

            arr.removeAll(arr1);  // Removes all the duplicate elements that are common between the arrays

        System.out.println(arr);

        String[] s = {"Python","Java","Selenium","TestNg"};

       // Arrays.sort(s, Collections.reverseOrder()); // To Sort the string in reverse order;

        Arrays.sort(s);

        System.out.println(Arrays.toString(s));

        int[] i = {1,4,5,2,65,44,3};



        Arrays.sort(i); // Sort in ascending order;




       // System.out.println(Arrays.toString(i));


    }
}
