package JavaBasics;

import java.util.Collection;
import java.util.Hashtable;

public class HashTablePractice {

    public static void main(String[] args) {

        Hashtable hs = new Hashtable<>();
        hs.put("Name","Vinay");
        hs.put("lastName","Sharma");
        hs.put("Age",28);

        System.out.println("The size of the HashTable :: "+hs.size());

        //hs.remove("Age");

        System.out.println("The Size of the HashTable after removal of a key :: "+hs.size());


        //To print all the values in the HashTable we need to get the values and take in collections
        Collection c  =hs.values();

        for(Object O : c)
        {
            System.out.println("All the values in table :: "+O);
        }

       boolean cs =  hs.containsValue("sharma");
        if(cs==true)
        {
            System.out.println("Yes sharma is present");
        }
        else
            System.out.println("Not present");
    }
}
