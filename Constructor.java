package oopsConcept;

public class Constructor {
	
	int year;
	String name;
	

	 public Constructor(int y ,String n) {
		 
		 year = y ;
		 name = n ;
		 
		 
	 }
	
	
	public static void main(String[] args) {
		
		Constructor rec = new Constructor(1991,"priya");// calling constructor and value passing
		
		System.out.println(rec.year +"   " + rec.name);
		
        
		
		
		
	}

}
