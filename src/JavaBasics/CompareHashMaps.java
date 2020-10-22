package JavaBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareHashMaps {

    public static void main(String[] args) {

        HashMap<String,String> hs = new HashMap<>();
        hs.put("fname","Vinay");
        hs.put("Lname","Sharma");

        HashMap<String,String> hs1 = new HashMap<>();
        hs1.put("fname","Vinay");
        hs1.put("Lname","Sharma");
        hs1.put("Lname1","Sharma1");

        //hs1.put("Mname","G");

        //Compare two hashmaps on the basis of Key-Values

        System.out.println(hs.equals(hs1)); // this will return true if all the values are matching

        //Compare on the basis of Keys - using KeySet() - Since it is set i will ignore duplicate keys
        System.out.println(hs.keySet().equals(hs1.keySet()));

        //How to find extra keys between two hashmaps -- using HashSet Concept

        HashSet<String> h = new HashSet<>(hs.keySet());
        h.addAll(hs1.keySet());
        h.removeAll(hs.keySet());

        System.out.println(h);

        HashMap<String,String> hs2 = new HashMap<>();
        hs2.put("fname","Vinay");
        hs2.put("Lname","Sharma");

        HashMap<String,String> hs3 = new HashMap<>();
        hs3.put("fname","Vinay");
        hs3.put("Lname","Sharma");
        hs3.put("Lname1","Sharma");

        //Compare maps by values
        System.out.println(new ArrayList<>(hs2.values()).equals(new ArrayList<>(hs3.values())));






    }
}
