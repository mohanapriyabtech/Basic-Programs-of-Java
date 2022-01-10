package sameornot;

import java.util.Scanner;

public class BirthdayWish {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 Scanner c = new Scanner(System.in);
	     int x = 2020;
	   
	     //String a=null  ;
	     //String[] name1= {"[0]"," [1]"}; 
		 int year = c.nextInt();
		 String name1 = c.nextLine();
		   
            
	       
	    //  String[] b = a .split(name1, year);
	       
	       // for (String a : arrOfStr)
	            System.out.println(name1+ " "+year);
	        
	       System.out.println("Happy Birthday "  +name1  +  "! Your current age is " + (x-year));
	       
	       
	       
	         
	}     

}
