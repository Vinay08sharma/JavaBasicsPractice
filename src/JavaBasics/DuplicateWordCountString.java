package JavaBasics;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordCountString {

    public static void main(String[] args) {


        String[] s = {"Testing", "Testing", "SDET", "SDET1"};

        HashMap<String,Integer> hs = new HashMap<>();

        for(String s1 : s){
            if(hs.containsKey(s1)){
                hs.put(s1,hs.get(s1)+1);
            }
            else {
                hs.put(s1,1);
            }
        }
        for(Map.Entry<String, Integer> entry: hs.entrySet()){
//            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" : "+entry.getValue());
//            }
        }

    }
}
