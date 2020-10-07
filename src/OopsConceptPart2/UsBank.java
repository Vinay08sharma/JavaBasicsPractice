package OopsConceptPart2;

public interface UsBank {
	
	int min_bal = 100;
	
	public void creditMoney();
	
	public void debitMoney();
	
	public void transferMoney();
	
	
	//Description of interface
	/* 
		-- No method body should be present. 
		-- Variables are by default static
		-- Since they are static value wont change
		-- No Static method in interface if they dont have body
		-- We cant create object of interface, Since methods are abstract
		-- We can achieve multiple inheritance with interface
		-- No Main method should be present
		-- Why we cannot have multiple inheritance with class is because -
		Lets say bot the parents have same method name.. so while accessing the method the compiler will be confused to which one should be executed.
		 This is also called as diamond problem or Ambiguity problem
		
	



	*/
}
