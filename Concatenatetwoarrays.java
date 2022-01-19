package arrayConcept;
import java.util.Arrays;
public class Concatenatetwoarrays {

	public static void main(String[] args) {
		
		
		int[] a1 = {1, 2, 3, 8};
        int[] a2 = {4, 5, 6, 5};

        int aLen =a1.length;
        int bLen = a2.length;
       
        int[] result = new int[aLen + bLen];

        System.arraycopy(a1, 0, result, 0, aLen);
        System.arraycopy(a2, 0, result, 4, bLen);// 3 index 
        

        System.out.println(Arrays.toString(result));

	}

}
