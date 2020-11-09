package JavaBasics;

public class StringSplit {

    public static void main(String[] args) {

        String str = "SachinRaiBookMyShow";
        String res = "";

        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            //if(Character.isUpperCase(ch))
            if(ch>='A' && ch<='Z')
            {
                res+=" "+ch;
            }

            else
            {
                res+=ch;
            }
        }

        System.out.println(res.trim());
    }
}
