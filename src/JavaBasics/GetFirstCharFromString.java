package JavaBasics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetFirstCharFromString {

// Program to get first character from the string
    public static void main(String args[])
    {
        String s = "Bharat mata ki jai";
        char[] c = s.toCharArray();

        for(int i =0; i<c.length;i++)
        {
            if(c[i]!=' ' && (i == 0 || c[i-1]==' '))
            {
                System.out.print(c[i]+" ");
            }
        }




    }
}
