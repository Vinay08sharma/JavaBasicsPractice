package JavaBasics;

import java.util.concurrent.TimeoutException;

public class NPEProgram {

    public static void main(String[] args) throws NullPointerException{
        try {
            String s = null;

            if (s.equals("acs")) {
                System.out.println("true");
            }
        } catch (NullPointerException a) {
            System.out.println("Catch exception");
        }
        catch (Exception n)
        {
            System.out.println("Unreachable");
        }
    }
}
