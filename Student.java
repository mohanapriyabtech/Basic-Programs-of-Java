package oopsConcept;

public class Student {
	String fname = "Ajay";
	int Rollnumber ;


				
	           /*	static void statMethod()// static method
				{
					System.out.println("no need of object to static method calling");	
					
				}*/

				public void publiMethod()// public method
				{
					System.out.println(" object must be create to public method calling");	
					
				}
				
				public void publiMethod2(int mark,String lname)// public method
				{
							
						System.out.println(  "Marks is :" + mark   +".  Name :" +fname + lname);	
				}
				
}
