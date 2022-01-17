package starpattern;

public class StarConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, row=6;   
		
		for(i=0; i<row; i++)   
		{   

		for(j=0; j<=i; j++)   
		{   
	  
		System.out.print("* ");   
		}   
		
		System.out.println();   
		} 
		for(i=1; i<row; i++)   
		{   

		for(j=row; j>i;j--)   
		{   
	  
		System.out.print("* ");   
		}   
		
		System.out.println();   
		} 
		
		
	}

}
