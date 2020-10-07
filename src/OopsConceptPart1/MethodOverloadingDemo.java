package OopsConceptPart1;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingDemo m = new MethodOverloadingDemo();
		
		m.Sum();
		m.Sum(10);
		m.Sum(20, 11);
		Main(11);
		Main("Vinay");
	}
	
	//Below concept is called as method Overloading
	
	// Method Name must be same but different args atleast the data type should be different
	
	public int Sum()
	{
		return 0;
	}
	
	public void Sum(int i)
	{
		System.out.println("Method with one param");
		System.out.println(i);
	}
	
	public void Sum(int i , int k)
	{
		System.out.println("Method with 2 params");
		System.out.println(i+k);
	}
	
	public static void Main(int p)
	{
		System.out.println("Main method overloaded");
		System.out.println(p);
	}
	
	public static void Main(String q) {
		System.out.println("Main mehtod overloaded with string");
		System.out.println(q);
		
	}

	
}
