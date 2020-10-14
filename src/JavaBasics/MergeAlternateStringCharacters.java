package JavaBasics;

public class MergeAlternateStringCharacters {

    public static void main(String[] args) {

        String a = "abcdef";
        String b = "12345689";

        String res = "";

        for(int i = 0; i< a.length() || i<b.length(); i++)
        {
            if(i<a.length())
            res =  res + a.charAt(i) ;
            if(i<b.length())
               res=res + b.charAt(i);
        }
        System.out.println(res);
    }
}
