package JavaBasics;

public class RemoveCharFromString {

    public static String removeChar(String s , int index)
    {
        String rem = "";
        for(int i =0; i<s.length()-1;i++)
        {
            if(i<index)
            {
                rem = rem + s.charAt(i);
            }
            else {
                rem = rem + s.charAt(i+1);
            }
        }
        return rem;
    }

    public static String removeIfCharFound(String str, char c1)
    {
        String r = "";
        char[] c = str.toCharArray();
        for(int j= 0;j<c.length-1;j++)
        {
            if(c[j] == c1 )
            {
                r = r + c[j+1];
            }
            else {
                r = r + c[j];
            }
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println( removeChar("tester",1));
        System.out.println(removeIfCharFound("SDET",'E'));
    }
}
