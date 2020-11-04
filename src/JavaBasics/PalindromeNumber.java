package JavaBasics;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        isPalindrome(127);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the Number to check the palindrome : ");
//        int n =  sc.nextInt();
//
//        int rem = 0;
//        int a = n;
//        int rev = 0;
//
//         while(a!=0)
//         {
//            rem = a%10;
//            rev = rev * 10+rem;
//            a=a/10;
//         }
//        System.out.println("Reverse of the number is :: "+rev);
//
//         if(rev==n)
//             System.out.println("Number is Palindrome");
//
//         else
//             System.out.println("Number is not a Palindrome");

    }

    public static void isPalindrome(int num)
    {


        int c = num;
        int rev1 = 0;

        int rem1= 0;
        while (c > 0)
        {
            rem1 = c%10;
            rev1 = rev1*10 + rem1;
            c = c/10;
        }
//        return rev1;
        if(rev1 == num)
        {
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not a palindrome number");
        }
    }
}
