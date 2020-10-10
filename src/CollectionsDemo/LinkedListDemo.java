package CollectionsDemo;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        //to add the values in the linkedList
        ll.add("Vinay");
        ll.add("SDET");
        ll.add("sharma");

        //to print the list (Only Values)
        System.out.println("Content of the list is :: "+ll);

        //add any new element at first position
        ll.addFirst("Selenium");

        System.out.println("New Content after adding new first element :: "+ll);

        //Add any new element at last position
        ll.addLast("Appium");

        System.out.println("New Content after adding new last element :: "+ll);

        //remove any element at certain positions
        ll.remove(0);

        System.out.println("New Content after removing the first element :: "+ll);

        //For printing the list

        //1. for loop
        System.out.println("****** Using for loop ********");

        for(int i =0;i<ll.size();i++)
        {
            System.out.println(ll.get(i));
        }

        //2. Enhanced For loop
        System.out.println("************ Using Enhanced For Loop ************");
        for(String s : ll)
            System.out.println(s);

        //3. using Iterator
        System.out.println("*********** Using Iterator ************");
        Iterator<String> it = ll.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        //4. Using While loop
        System.out.println("********** While Loop ************");
        int num = 0;
        while((ll.size() > num))
        {
            System.out.println(ll.get(num));
            num++;
        }



    }
}
