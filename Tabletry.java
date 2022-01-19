package arrayConcept;

import java.util.Scanner;

public class Tabletry {

	public static void main(String[] args) {
		
    try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the Table :" );
		
		int n=sc.nextInt();
		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0 ; i<a.length/2; i++) {
			
			
			System.out.print("* ");
		}
			System.out.print("*");
		    System.out.println();
    
		
	     for(int i=0 ; i<10; i++) {
			
		
		System.out.println (a[i] +" * "+n +" =  "+(a[i]*n) );
			
			 for(int j=0 ; j<a.length/2; j++) {
		
				 System.out.print("* ");
			 }
			
	    System.out.println ("*");
		
				}
    
	}

}}
