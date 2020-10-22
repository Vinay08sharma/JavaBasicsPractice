package JavaBasics;

import java.util.*;

public class SortOnOccurenceOfNumbers {

    public static void main(String[] args) {

        int[] i = {4,3,5,5,5,1,3,0,2,0};

        Arrays.sort(i);

        HashMap<Integer, Integer> hs = new HashMap<>();

        for(int n : i)
        {
            if(hs.containsKey(n))
            {
                hs.put(n,hs.get(n)+1);
            }
            else
            {
                hs.put(n,1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : hs.entrySet())
        {
            System.out.print(entry.getKey()+  " = " );
            System.out.println(entry.getValue());
        }




    }
}
