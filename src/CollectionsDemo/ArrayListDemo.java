package CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        int[] a = new int[10]; // This is Static Array, which has fixed size cannot be added more

        ArrayList arr = new ArrayList(); // To OverCome the size issue of Static Arrays , ArrayList has been introduced
        // This is also called as Dynamic Array..
        // Can be Increased and Decreased as an when required
        // It Maintains Insertion Order
        // Synchronized
        // Allows random access to the values present on any positions

        arr.add("Vinay");
        arr.add("Sharma");
        arr.add(10);
        arr.add('M');

        System.out.println("Size of the Array:: "+arr.size());

       // arr.set(3,"Pooja"); // replaces the value

        //System.out.println("Size of the Array:: "+arr.size());

        System.out.println("value at certain postion:: "+arr.get(3));


        // To print all the values in arraylist
        for(Object O : arr)
        {
            System.out.println(O.toString());
        }

        System.out.println("***********************************************************");
        // Creating objject of class employee

        Employee e1  = new Employee("Vinay",28,"SDET");
        Employee e2  = new Employee("Sachin",29,"SDET2");
        Employee e3  = new Employee("Pankaj",30,"SDET3");

        // to add the values in Arraylist from user defined classes

        ArrayList<Employee> ar = new ArrayList<Employee>();
        ar.add(e1);
        ar.add(e2);
        ar.add(e3);

        //to fetch the values from Arraylist using iterator

        Iterator<Employee> it = ar.iterator();
        while (it.hasNext())
        {
            Employee e = it.next();
            System.out.print(e.name +" ");
            System.out.print(e.age + " ");
            System.out.print(e.dept+ " ");
            System.out.println();
        }

        System.out.println("***********************************************************");
         // addAll method will add new array data to previous arraylist
        ArrayList<String> ar1 = new ArrayList<String>();
        ar1.add("Vinay");
        ar1.add("Sharma");

        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("SDET");
        ar2.add("SDET2");

        ar1.addAll(ar2);

        for(String s : ar1)
            System.out.println(s);

        System.out.println("***********************************************************");

        // To Print only the common values between 2 arrays, Use retainAll()

        ArrayList<String> ar3 = new ArrayList<String>();
        ar3.add("Selenium");
        ar3.add("Appium");

        ArrayList<String> ar4 = new ArrayList<String>();
        ar4.add("Selenium");
        ar4.add("Maven");

        ar3.retainAll(ar4);



        for(String s1 : ar3)
            System.out.println(s1);




    }
}
