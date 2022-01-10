package sameornot;

import java.util.Scanner;

public class Largeone {
	
	public static void main(String[] args) {
		
		   Scanner c = new Scanner(System.in);
	       
	       System.out.print("Enter the Number1: ");
	       int number1 = c.nextInt();
	        
	       System.out.print("Enter the Number2: ");
	       int number2 = c.nextInt();
	       
	       System.out.print("Enter the Number3: ");
	       int number3 = c.nextInt();
	       
	        
			   if (number1>=number2 && number1>=number3) {
				 
				 System.out.println("Number1 is a Largest Number :");
				 
				 }
			   
			   else if(number1<=number2 && number2>=number3){
				 System.out.println("Number2 is a Largest Number");
			     }
			   
			   else if(number1<=number3 && number2<=number3){
					 System.out.println("Number3 is a Largest Number");
				     } 

	}

}