package oopsConcept;


public class ObjectCreation {
			
	int a=6;
    int  b =10 ;
		     
		     
	     static void statMethod()// static method
	     {
	     	System.out.println("no need of object to static method calling");	
	     	
	     }
		 
		    
		   public static void main(String[] args) {
		
			ObjectCreation myObj = new ObjectCreation();
			ObjectCreation myObj2 = new ObjectCreation();
			Student s = new Student(); //inheritance 
			
			 myObj.a = 7 ; // a is now 7
			 myObj2.b = 25 ; // b is now 25
		     s.Rollnumber =115 ;// reference variable
			
			System.out.println(myObj.a);
			System.out.println(myObj2.b);
			System.out.println("name :"  +s.fname);
			System.out.println("Rollnumber: " + s.Rollnumber);
			
			statMethod();
			s.publiMethod();
			s.publiMethod2(500, "  kumar");
			
		
		}


	
	
}


