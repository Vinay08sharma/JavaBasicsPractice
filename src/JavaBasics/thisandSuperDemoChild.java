package JavaBasics;

public class thisandSuperDemoChild extends thisandSuperDemo{

    String s ="Sharma";
    public void m1(){
        System.out.println(s); // return Current class variable
        System.out.println(this.s); // return Current class variable
        System.out.println(super.s); // return Parent class variable
    }

    public static void main(String[] args) {

        thisandSuperDemoChild c = new thisandSuperDemoChild();
        c.m1();

    }
}
