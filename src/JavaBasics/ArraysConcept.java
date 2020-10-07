package JavaBasics;

public class ArraysConcept {
	
	public static void main(String[] args) {
		
		
		// only integers values can be stored
		
		int[] a = new int[4];
		
		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
		a[3]= 40;
		
		System.out.println(a[3]);
		//System.out.println(a[5]);
		
		System.out.println(a.length);
		
		
		for(int a1 : a)
		{
			System.out.println(a1);
		}
		
		// Object array is used to store different datatype values
		
		
		Object ob[] = new Object[4];
		ob[0] = "Vinay";
		ob[1] = "Sharma";
		ob[2] = 40.22;
		ob[3] = 'M';
		
		System.out.println("Size of the object array : "+ob.length);
		
		for(Object o : ob)
		{
			System.out.println(o);
		}
		
	}

}
