package JavaBasics;

import com.sun.corba.se.impl.orb.ParserTable;

import java.util.Scanner;

public class ArmstronNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check the ArmStrong number :: ");
        int n = sc.nextInt();
        int rem = 0;
        int sum = 0;
        int a = n;

        while(a!=0)
        {
            rem = a%10;
           // sum = (int) (sum + Math.pow(rem,3));
            sum = sum + (rem*rem*rem);
            a = a/10;
        }
        System.out.println("Addition of the cubes of the numbers are :: "+sum);

        if(sum == n)
            System.out.println("Number is ArmStrong Number....");
        else
            System.out.println("Number is not an ArmStrong number.....");


    }
}
