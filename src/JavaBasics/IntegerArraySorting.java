package JavaBasics;

import java.util.TreeMap;
import java.util.TreeSet;

public class IntegerArraySorting {

    public static void main(String[] args) {

        int[] a = {2,4,1,3,55,6,2,0};

       /* int temp ;
        for(int i=0;i<a.length;i++)
        {
            for(int j = i +1; j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

            System.out.print(a[i] + " ");
        }*/

        TreeSet<Integer> t = new TreeSet<>(); // Tree set will add the integers by maintainig the order
        for(int i : a)
        {
            t.add(i);
        }

        System.out.println(t);

    }
}
