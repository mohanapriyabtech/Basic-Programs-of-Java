package pack;

public class School {

	
		public void msg() {
			
			System.out.println ("Welcome to school");
			
			System.out.println();
			
			System.out.println ("Progress Report ");
			
			System.out.println();
		}
        
		public void Studentdetail(String n ,int r) {
			
			String name= n;
			int Rollno = r ;
			
			System.out.println("Enter the Name : " +name +".");
			System.out.println("Rollno :" +Rollno +". ");
			System.out.println();
		}
		
		public void addmarks(int a ,int b ,int c) {
			int Tamil =a ;
			int English=b;
			int Maths=c ;
			
		    int Total = Tamil+English+Maths ;
			
			System.out.println("Total Marks are :"+(Tamil+English+Maths)+"/300 ." );
		
		}
		
		
}
