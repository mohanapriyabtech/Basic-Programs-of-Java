package arrayConcept;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    
		        int [] arr = new int [] {4,5,6,7,8};  
		        
		        int n=3 ;
		        
		       
		        System.out.println(" array:");  
		      
		        for (int i = 0; i < arr.length; i++) {  
		        	
		           System.out.print(arr[i] + " ");  
		        }  
		       
		        
		        for(int i = 0; i < n; i++){  
		            
		        int j, first;  
		           
		        first = arr[0];  
		            
		          for( j = 0; j < arr.length-1; j++){  
		               
		                arr[j] = arr[j+1];  
		            }  
		            
		            arr[n-1] = first;  
		        }
		        System.out.println();  
 
		        System.out.println("after left rotation:");  
		        
		        for(int i = 0; i< arr.length; i++){  
		           
		        
		        	System.out.print(arr[i] + " ");  
		        }  
		    
		
	}
}



