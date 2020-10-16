package JavaBasics;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class ArrangeUpperCaseChars {

    public static void main(String[] args) {


           String s = "asdDEFsdDF";

           char[] c = s.toCharArray();

           String Us = "";
           String Ls = "";

           for(int i = 0; i<c.length;i++)
           {
               if(c[i]>='A'&&c[i]<='Z') {
                   Us += c[i];
               }
               else
                   Ls += c[i];
           }



           String newString = Ls.concat(Us);
        System.out.println(newString);
    }
}
