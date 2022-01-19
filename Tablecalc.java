package arrayConcept;
import java.util.Scanner;

public class Tablecalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Table :" );
		
		int n=sc.nextInt();
		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		
		for(int i=0 ; i<10; i++) {
			
		
			System.out.println (a[i] +" * "+n +" =  "+(a[i]*n) );
			System.out.println();
		
		}
		
	
		

	}

}
