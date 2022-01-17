package sameornot;

import java.util.Scanner;

public class Birthdayage {

	public static void main(String[] args, String[] a1) {
		// TODO Auto-generated method stub
		
	        Scanner c = new Scanner(System.in);
   	    
            int x = 2020;
   	     	int age ;
   	     	
   	     	
   	     	System.out.println("Enter the name and year");
   	     	String n = c.nextLine();
   	     	String[] d= n.split("  ");
   	     	
   	     
   	     	String[] a = new String[d];
   	       String n2 =  d[0];
   	       String n3 = d[1];
   	      
   	     	int i = Integer.parseInt(d[1]);
            age = x-i;
   	     	System.out.println("Happy Birthday "  +d[0] +  "! Your current age is " +age);
   	       
   	       
   	       
   	       
        }
	}


