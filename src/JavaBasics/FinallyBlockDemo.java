package JavaBasics;

public class FinallyBlockDemo {

    public static void main(String[] args) {

        try{
            System.out.println("In try block");
        }
        finally {
            System.out.println("in finally block");
        }

        System.gc();
    }
}
