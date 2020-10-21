package JavaBasics;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList ar = new ArrayList();
        ar.add("Vinay");
        ar.add("Sharma");
        ar.add("Want to become an SDET");
        ar.add(100);
        ar.add('M');

        System.out.println("Size before the removal of array :: "+ar.size());

       ar.remove(3);

        System.out.println("Size After the removal :: "+ar.size());

        System.out.println("Added some more values to array");
        System.out.println();

        ar.add("love coding");

       // System.out.println(ar.size());

        System.out.println(ar.get(4));

        ArrayList<String> arr = new ArrayList<>();

       boolean ar1 =  ar.contains("love coding"); // to check if arraylist contains the string
        System.out.println(ar1);

        arr.add("sharmaji");
        arr.add("Automation Engineer");

        System.out.println(arr.get(0));

        for(Object o : ar)
            System.out.println("the Values in arraylist :: "+o);

        for(String s : arr)
            System.out.println("The values in the String array :: "+s);





    }
}
