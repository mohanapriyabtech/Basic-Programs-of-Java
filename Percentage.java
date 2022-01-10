package sameornot;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner x = new Scanner(System.in);
		   
		   String name = x.nextLine(); 
	       int Rollno = x.nextInt();
	       System.out.print("Enter name" + name);
	       System.out.print("Enter Rollno"+Rollno);
	       int m1 = x.nextInt();
	       int m2 = x.nextInt();
	       int m3 = x.nextInt();
		   System.out.print("Enter Marks " +m1 +m2 +m3);
	       
	       int Total ; 
		   Total=m1+m2+m3 ;
		   int percentage =((Total*100)/300);
		   
		   System.out.print("TOTAL : " +Total  +"The PERCENTAGE is" +percentage +"%" );
		  
		   
	      
	       
	       

	}

}
