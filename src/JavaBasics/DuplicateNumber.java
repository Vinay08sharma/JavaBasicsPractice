package JavaBasics;

import java.util.HashSet;

public class DuplicateNumber {

    public static void main(String[] args) {

        int[] a = {1,1,22,43,34,43,33,44,44};

        HashSet<Integer> hs = new HashSet<>();

        for(int i =0; i<a.length;i++)
        {
            if(!hs.add(a[i]))
            {
                System.out.println("The Duplicate Number is :: "+a[i]); // Print first Duplicate number;
                break;
            }
        }
    }
}
