package oopsConcept;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Integer[] a = {1,2,3,4,5,6};
  
  
   List<Integer> list = Arrays.asList(a);          //method 1 
   System.out.println(list);
   
   List<Integer> list1 = new ArrayList<Integer>();   // method 2 
   Collections.addAll(list1,a);
   System.out.println(list1);
  
 
   
   
   
   ArrayList<Integer> myNumbers = new ArrayList<Integer>();
  
    myNumbers.add(78);
    myNumbers.add(4);
    myNumbers.add(67);
    myNumbers.add(8);
    myNumbers.add(78);
    myNumbers.add(89);

    Collections.sort(myNumbers);  // Sort myNumbers

    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}