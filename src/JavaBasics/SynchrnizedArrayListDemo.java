package JavaBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchrnizedArrayListDemo {

    // To create Synchronized Arraylist there are two methods
    // 1. Using Collection.synchronizedList
    //2. Using copyOnWriteArrayList -- class

    public static void main(String[] args) {

        List<String> nameList = Collections.synchronizedList(new ArrayList<>());

        //If we are using collections.sync then add / remove cannot be called with explicit synchronization.

        nameList.add("java");
        nameList.add("Selenium");
        nameList.add("Cucumber");

        Iterator<String> itr = nameList.iterator();



    }
}
