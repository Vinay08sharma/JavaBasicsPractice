package JavaBasics;

public class NPEProgram {

    public static void main(String[] args) {

        String s = null;

        if(s.equals("acs"))
        {
            System.out.println("true");
        }
    }
}
