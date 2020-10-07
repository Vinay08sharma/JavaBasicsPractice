package OopsConceptPart2;

public class HSBCBank implements UsBank,BrazilBank{ // Achieving multiple inheritance
	 
	public static void main(String[] args) {
		
		
		//If a class is implementing any interface, than it is mandatory to override/Defing all the methods of interface + the class can have its own methods too
		
		System.out.println(UsBank.min_bal);
		
		HSBCBank h = new HSBCBank();
		h.creditMoney();
		h.debitMoney();
		h.transferMoney();
		h.loanManagement();
		h.mutualFund();
		
		System.out.println("**************");
		
		UsBank U=new HSBCBank(); //Dynamic Polymorphism, Child object is referred by parent Interface
		U.creditMoney();
		U.debitMoney();
		U.transferMoney();
		
		
	}

	@Override
	public void creditMoney() {
		// TODO Auto-generated method stub
		
		System.out.println("HSBC -- CREDITMONEY");
		
	}

	@Override
	public void debitMoney() {
		// TODO Auto-generated method stub
		
		System.out.println("HSBC -- DEBITMONEY");
		
	}

	@Override
	public void transferMoney() {
		// TODO Auto-generated method stub
		System.out.println("HSBC -- TRANSFERMONEY");
		
	}
	
	public void loanManagement()
	{
		System.out.println("HSBC -- LoanManagement");
	}

	@Override
	public void mutualFund() {
		
		System.out.println("HSBC -- MutualFund");
	}

}
