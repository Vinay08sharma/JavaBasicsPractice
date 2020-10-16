package JavaBasics;

import java.sql.SQLOutput;

public class MissingNumber {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9,10,12};

        int sum = 0;
        int sum1 = 0;


        for(int i = 0; i<a.length;i++)
        {
            sum+=a[i];
        }
        System.out.println(sum);

        for(int i =0;i<=a.length+1;i++)
        {
            sum1+= i;
        }
        System.out.println(sum1);

        int MissingNum = sum1 - sum;

        System.out.println("Missing Number is :: "+MissingNum);
    }
}
