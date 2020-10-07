package OopsConceptPart1;

import java.util.Arrays;

public class Car {
	
	
	//class variable/global variable;
	
	 int model;
	 int wheel;
	
	 public static void main(String[] args) {
		
		//new Car() ---- are objects of car class;
		 // a , b, c --- are reference variables
		 
		 //objects will be created in java memory;
		 
		 
		 Car a = new Car();
		 Car b = new Car();
		 Car c = new Car();
				
		 a.model=2015;
		 a.wheel=4;
		 
		 b.model=2016;
		 b.wheel=3;
		 
		 c.model=2020;
		 c.wheel=2;
		 
		 
		 System.out.println("======= before assigning the reference==========");
		 
		 System.out.println(a.model + " " + a.wheel);
		 System.out.println(b.model + " " + b.wheel);

		 System.out.println(c.model + " " + c.wheel);

		 System.out.println("======= After assigning the reference==========");
		 
		 a = b; // a will start referring to object of b
		 b = c; // b will start referring to the object of c
		 c = a; // c will start referring to the object of a which is now b.
		 
		
		 a.model = 10;
		 
		 System.out.println(a.model);
		 
		 c.model = 20;
		 System.out.println(a.model);

		
		 
		 
	}

}
