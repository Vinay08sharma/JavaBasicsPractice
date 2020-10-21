package JavaBasics;

public class ArrayContainsNumber {
    public static boolean isNumberPresent(int[] a , int num) {

        for(int i = 0;i<a.length;i++)
        {
            if(a[i]==num) {
                return true;
            }

        }
        return false;

    }

    public static void main(String[] args){
        int[] arr = {1,2,32,324,432,32};

        if(isNumberPresent(arr, 32))
            System.out.println("Number is present");
        else
            System.out.println("Number is not present");
    }
}
