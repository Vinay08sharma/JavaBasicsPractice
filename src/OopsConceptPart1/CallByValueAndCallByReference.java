package OopsConceptPart1;

public class CallByValueAndCallByReference {
	
	public static void main(String[] args) {
		
		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		int x = 10  ,y = 20;
		obj.Sum(x, y); // The copy of x and y value will be given the a & b not the original value, this is call by value or pass by value
		
	}
	
	public int Sum(int a , int b) {
		
		int c = a + b;
		
		return c;
	}

}
