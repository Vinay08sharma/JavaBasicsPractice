package JavaBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashSetToArrayList {

    public static void main(String[] args) {

        HashMap<String, Integer> hs = new HashMap<>();
        hs.put("Selenium", 2000);
        hs.put("appium", 3000);
        hs.put("Maven", 1000);
        hs.put("Framework",20000);

        for(Map.Entry entry : hs.entrySet())
        {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }

        List<String> courseNameList = new ArrayList<>(hs.keySet());
        for(String course : courseNameList)
        {
            System.out.println(course);
        }

        List<Integer> AmountList = new ArrayList<>(hs.values());
        for(Integer amount : AmountList)
        {
            System.out.println(amount);
        }

    }
}
