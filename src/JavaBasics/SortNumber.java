package JavaBasics;

import java.util.Arrays;
import java.util.LinkedList;

public class SortNumber {

    public static void main(String[] args) {

        int[] a = {4,4,653,23,5,1,3,2};

        Arrays.sort(a);

        LinkedList<Integer> l = new LinkedList<>();

        for(int a1 : a)
        {
            l.add(a1);
        }

        System.out.println(l);
    }
}
