package JavaBasics;

import java.util.HashSet;

public class PracticeHashSet {

    //Program to get duplicate value from the String

    public static void main(String[] args) {

        String str = "Bharat mata ki jai mata di di";

        String[] s = str.split(" ");

        HashSet<String> hs = new HashSet<>(); //does not allow duplicates

        for (String value : s) {
            if (!hs.add(value))
                System.out.println(value);
        }

//        String s1 = "Bharat";
//
//        char[] c =  s1.toCharArray();
//
//        HashSet<Character> hs = new HashSet<>();
//
//        for(char c2 : c)
//        {
//            if(!hs.add(c2))
//            {
//                System.out.println(c2);
//            }
//        }




    }
}
