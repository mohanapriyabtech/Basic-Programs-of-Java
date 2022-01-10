package sameornot;

import java.util.Scanner;

public class IfmethodShort {

	public static void main(String[] args) {
		
		
	       Scanner c = new Scanner(System.in);
	       
	       System.out.print("Enter the Number1: ");
	       int number1 = c.nextInt();
	        
	       System.out.print("Enter the Number2: ");
	       int number2 = c.nextInt();
	       
	       System.out.print("Enter the Number3: ");
	       int number3 = c.nextInt();
	     
	      // simple if statement transfer to below ternary operator syntax 
	       
	       String result = ((number1>=number2&& number1 >=number3) &&number2>=number3) ? "number1 is large " : "number2 is large" ;
	       
	       System.out.print(result);
				
	}

}
