package Java.Strings;

import java.util.Arrays;

//Check If Two String Arrays are Equivalent

public class CheckTwoStringArraysEquivalent {

	public static void main(String[] args) {
		String [] word1 = {"ab", "c"};
		String [] word2 = {"a", "bc"};
		System.out.println(arrayStringsAreEqual(word1, word2));

	}
	 public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
	        String one = Arrays.toString(word1);
	        String two = Arrays.toString(word2).replace(",", "").replace(" ", "");
	        System.out.println(one);
	        System.out.println(two);
	        	System.out.println(String.join("", word1));
	        	
//	        int [] num= {1,22,2,2};
//	        System.out.println(Arrays.toString(num));
	        return one.equals(two);
	       
	        
	        //3028
	    }
	

}
