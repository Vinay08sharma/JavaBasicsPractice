package JavaBasics;

public class factorialDemo {

    //recursive function

    public static int fact(int num)
    {
//        if(num == 0)
//            return 1;
//        else
//            return num * fact(num-1);


    //non - recursive function
        int factt = 1;
        for(int i = 1;i<=num;i++)
        {
            factt = factt*i;
        }
        return factt;
    }
    public static void main(String[] args) {
        System.out.println(fact(4));

    }
}
