package JavaBasics;

import java.util.HashSet;

public class PracticeHashSet {

    //Program to get duplicate value from the String

    public static void main(String[] args) {

        String str = "Bharat mata ki jai mata di";

        String[] s = str.split(" ");

        HashSet<String> hs = new HashSet<>(); //does not allow duplicates

        for (String value : s) {
            if (!hs.add(value)) {
                System.out.println(value);
            }
        }
    }
}
