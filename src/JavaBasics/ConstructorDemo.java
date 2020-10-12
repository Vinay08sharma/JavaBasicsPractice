package CollectionsDemo;

public class ConstructorDemo {

    //Default constructor
    public ConstructorDemo(){

        System.out.println("Default Constructor");
    }

    //Parameterized Constructor
    public ConstructorDemo(int i){
        System.out.println("Paramaterized Constructor "+ i);
    }

    public static void main(String[] args) {

        //Constructor gets called as soon as we create an object
        ConstructorDemo c = new ConstructorDemo(); // this will call default constructor with zero args


    }
}
