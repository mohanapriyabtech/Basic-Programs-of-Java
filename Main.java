package oopsConcept;


class OuterClass {
	  int x = 10;

	  class InnerClass {// if its static class InnerClass means cant accessbthe x value
	    int y = x;
	  }
	}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 OuterClass myouter =new OuterClass();
		
		 OuterClass.InnerClass myInner =myouter.new InnerClass();
		    
		   
		    System.out.println(myInner.y);
		    System.out.println(myouter.x);
	}

}
