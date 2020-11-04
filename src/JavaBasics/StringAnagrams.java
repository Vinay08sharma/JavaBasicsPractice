package JavaBasics;

import java.util.Arrays;

public class StringAnagrams {

    public static boolean isAnagram(String s , String s1) {

//        String s = "malayalam";
//        String s1 = "malaaylma";

        char[] a = s.toCharArray();
        char[] b = s1.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);

    }

    public static void main(String[] args){
        if(isAnagram("madam", "dammsa"))
        {
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Non - Anagrams");
        }
    }
}
