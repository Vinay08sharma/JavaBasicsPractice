package JavaBasics;

public class BinaryOrNotDeom {

    public static boolean binary(int num)
    {
        if(num == 0 || num == 1 || num < 0)
            return false;

        else
        {
            while(num!=0)
            {
                if(num%10 > 1)
                {
                    return false;
                }
                num = num/10;
            }
            return true;
        }
    }

    public static void main(String[] args) {

        System.out.println(binary(1234));
    }
}
