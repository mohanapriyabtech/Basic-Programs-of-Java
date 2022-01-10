package sameornot;

import java.util.Scanner;

public class Birthdayage {

	public static void main(String[] args, String[] a1) {
		// TODO Auto-generated method stub
		
		
		
        // Loop to store input values in nums array
        
            Scanner c = new Scanner(System.in);
   	    
            int x = 2020;
   	     	int age ;
   	     	String name ,year;
   	       // String[] a ;
   	        
   	     	System.out.println("Enter the name and year");
   	     	String n = c.nextLine();
   	     	String[] a = n.split(" ");
   	     	
   	     	name = a[0];
   	     	year = a[1];
   	     	
   	     	int i = Integer.parseInt(year);
            age = x-i;
   	     	System.out.println("Happy Birthday "  +n  +  "! Your current age is " +age);
   	       
   	       
   	       
   	       
        }
	}


