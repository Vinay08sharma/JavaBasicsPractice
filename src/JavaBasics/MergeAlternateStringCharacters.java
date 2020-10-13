package JavaBasics;

public class MergeAlternateStringCharacters {

    public static void main(String[] args) {

        String a = "abcdef";
        String b = "123456";

        String res = "";

        for(int i = 0; i< a.length(); i++)
        {
            if(i<a.length())
            res =  res + a.charAt(i) ;
            if(i<b.length())
               res=res + b.charAt(i);
        }
        System.out.println(res);
    }
}
