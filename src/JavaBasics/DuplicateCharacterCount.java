package JavaBasics;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DuplicateCharacterCount {

    public static void main(String[] args) {

        String s = "SDET TesTing SDET";

        char[] charArray = s.toCharArray();

        TreeMap<Character,Integer> hs = new TreeMap<>(); // Using Treemap to sort them in order

        for(char c : charArray)
        {
            if(hs.containsKey(c)){
                hs.put(c,hs.get(c)+1);
            }else{
                hs.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> entry : hs.entrySet()){
            if(entry.getValue()>1){
                System.out.print(entry.getKey() + " : "+entry.getValue()+" ");
            }
//            System.out.print(entry.getKey() + " : " + entry.getValue() + " , ");
        }
    }
}
