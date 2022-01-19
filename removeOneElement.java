package arrayConcept;
import java.util.Scanner;

public class removeOneElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int[] num =  {1,2,3,4,5,6};
		
		
		

		for (int i=0 ;i<num.length;i++) {

	           System.out.print(num[i]+" ") ;
			           
		}
			
		 System.out.println();
		 
       System.out.println("enter the removable element :") ;
		
		int e = sc.nextInt();
		
	
		
		for (int i=0 ;i<num.length;i++) {
			
		       if(num[i]==e)	{
			
			   
			for (int j=i ;j<num.length-1;j++) {
				
			 num[j]=num[j+1];     
			 
			 } 
			
			break; 
		
		       }
		       } 
		    
		  System.out.println("final array is ") ;
		   for(int j=0 ;j<num.length;j++) {
		          

           System.out.print(num[j]+" ") ;
		           
			        
}
	
}

}
