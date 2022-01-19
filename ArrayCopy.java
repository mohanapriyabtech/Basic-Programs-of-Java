package arrayConcept;
import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc= new Scanner(System.in);
		
		  int [] arr1 = new int [4] ;     
		  

	        for (int i = 0; i <4; i++) { 
	        	
	        	 System.out.print("enter the elements of array : " + " ");  
	        	
	            arr1[i] = sc.nextInt();
	            
	        }     
		  
		  
	           
	           int arr2[] = new int[arr1.length];    
	        
	       
	        
		        for (int i = 0; i < arr1.length; i++) { 
		        	
		            arr2[i] = arr1[i];     
		        }      
		         //Displaying elements of array arr1     
			       
		        System.out.println("Elements of original array: ");    
			       
			        for (int i = 0; i < arr1.length; i++) {     
			           System.out.print(arr1[i] + " ");    
			        }     
			            
			        System.out.println();    
			            
				        //Displaying elements of array arr2     
				       
			        System.out.println("Elements of new array: ");    
				        for (int i = 0; i < arr2.length; i++) {     
				           System.out.print(arr2[i] + " ");  
				           
	        }     
	    }    
	    
	}


