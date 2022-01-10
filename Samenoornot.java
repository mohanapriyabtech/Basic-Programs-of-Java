package sameornot;
import java.util.Scanner;
public class Samenoornot {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       Scanner c = new Scanner(System.in);
       
       System.out.print("Enter the Number1: ");
       int number1 = c.nextInt();
        
       System.out.print("Enter the Number2: ");
       int number2 = c.nextInt();
       
        
		   if (number1==number2) {
			 System.out.println();
			 
			 System.out.println("Both Numbers are same");
			 }
		   else{
			 System.out.println("Not same");
		     }
		 
 
 
	 }

}
