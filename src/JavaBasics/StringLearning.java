package JavaBasics;

public class StringLearning {

    public static void main(String[] args) {

        String s = new String("Vinay");
//        s.concat(" Sharma"); // new object will be created and since it is not getting referred by any ref variable, hence it will available for garbage collector

       String s1 =  s.concat("sharma"); // Here we are assigning it to the new reference varible
        System.out.println(s1);


        StringBuffer sb = new StringBuffer("Vinay");
        StringBuffer sb1 = new StringBuffer("Vinay");
        sb.append("sharma"); // this will not require new reference as string buffers are Mutable in nature
        System.out.println(sb);


        // == operator & .equals()

        String s2 = new String("Vinay");

        System.out.println(s==s2);

        System.out.println(s.equals(s2)); // In String .equals() is overridden and hence it will do content comparison

        System.out.println(sb==sb1);

        System.out.println(sb.equals(sb1)); // in StringBuffer .equal() is not overridden and hence it will do reference comparison only
    }
}
