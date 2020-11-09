package JavaBasics;

public class CountVowelsConsonants {

    public static void main(String[] args) {

        String str = "aeious";

        String s = str.toLowerCase();

        int vcount = 0;

        int ccount = 0;

        for(int i = 0; i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {
                vcount++;
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                ccount++;
        }
        }

        System.out.println("The count of Vowel in the String are :: "+vcount);
        System.out.println("The count of Consonant in the String are :: "+ccount);




    }
}
