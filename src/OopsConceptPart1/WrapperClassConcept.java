package OopsConceptPart1;

public class WrapperClassConcept {
	
	public static void main(String[] args) {
		
		
		String s = "100";
		
		System.out.println(s+20);
		
		
		//data conversion from String to Integer
		
		Integer i= Integer.parseInt(s);
		
		System.out.println(i+20);
		
		System.out.println(String.valueOf(i));
		
		String u = "100A"; //This will give an error NumberFormatException. You can parse only integers value
		
		Integer.parseInt(u);
		
		
		
		
	}
	

}
