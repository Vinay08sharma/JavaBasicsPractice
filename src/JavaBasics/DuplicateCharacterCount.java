package JavaBasics;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterCount {

    public static void main(String[] args) {

        String s = "SDETTesTingSDET";

        char[] charArray = s.toCharArray();

        HashMap<Character,Integer> hs = new HashMap<>();

        for(char c : charArray)
        {
            if(hs.containsKey(c)){
                hs.put(c,hs.get(c)+1);
            }else{
                hs.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> entry : hs.entrySet()){
//            if(entry.getValue()>1){
//                System.out.println(entry.getKey() + " : "+entry.getValue());
//            }
            System.out.print(entry.getKey() + " : " + entry.getValue() + " , ");
        }
    }
}
