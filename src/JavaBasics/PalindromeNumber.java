package JavaBasics;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to check the palindrome : ");
        int n =  sc.nextInt();

        int rem = 0;
        int a = n;
        int rev = 0;

         while(a!=0)
         {
            rem = a%10;
            rev = rev * 10+rem;
            a=a/10;
         }
        System.out.println("Reverse of the number is :: "+rev);

         if(rev==n)
             System.out.println("Number is Palindrome");

         else
             System.out.println("Number is not a Palindrome");
    }
}
