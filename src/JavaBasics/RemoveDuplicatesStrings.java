package JavaBasics;

import java.util.HashSet;

public class RemoveDuplicatesStrings {

    public static void main(String[] args) {

        String[] str = {"SDET","SDET","Learning","Learn","Learning","sdet","study"};

        HashSet<String> hs = new HashSet<>();

        for(String s : str)
        {
            if(!hs.add(s))
            {
                System.out.println("Duplicate String is :"+s);
                hs.remove(s);
            }
        }
        System.out.println("After removal of duplicate String : " +hs);
    }
}
