package oopsConcept;


			class StuRecord {
				
				int Rollno;
				String name ;
				int id ;
				
				void insert(int R,String n,int n2) {
					Rollno= R;
					name = n;
					id = n2;
					
					
				}
				void calc() {
					System.out.println ("Rollno : "+Rollno+".  name : "+name +".  id :   "+id);
					
				
				
			}
}
public class MethodFunc {

	public static void main(String[] args) {
		
		
		StuRecord sr = new StuRecord();
		StuRecord sr1 = new StuRecord();
		sr.insert(15,"arun",12367);
		sr1.insert(17,"ajay",12370);

		sr.calc();
		sr1.calc();
		
		
	}

}
