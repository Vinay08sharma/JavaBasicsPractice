package OopsConceptPart2;

public class TestMethod {
	
	public static void main(String[] args) {
		
		
		
		BMW b = new BMW();
		
		//When method name and arguments are same in parent child classes, it is called as Method Overriding -- Static Polymorphism (Compile Time Polymorphism)
		b.start(); //overriden method
		b.stop();
		b.refuel();
		b.theftSystem();
		
		System.out.println("*****************");
		
		Car c = new Car();
		c.start(); // Parent cannot inherit the proper, Hence only parent methods can be executed
		c.stop();
		c.refuel();

		
		System.out.println("*****************");
		
		Car d = new BMW (); // Top Casting .. When child object is referred by parent referrence variable it is called as Runtime Polymorphism
		
		d.start();  // this will return overridden method
		d.stop();
		d.refuel();
				
		
		//DownCasting 
		//BMW b1 =(BMW) new Car(); // it is possible but will give an error on run time ClassCastException
		
				
	}

}
