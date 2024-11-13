package Java.Strings;

import java.util.Arrays;

public class ReverseWordsinaString {

	public static void main(String[] args) {
		String result =  reverseWords2("Let's take LeetCode contest");
		System.out.println(result);

	}
	 public static String reverseWords1(String s) {
		StringBuffer rev = new StringBuffer();
	    String [] arr = s.split(" ");
	 
	       for(int i=0;i<arr.length;i++){
	           StringBuffer temp = new StringBuffer();
	           for(int j=arr[i].length()-1;j>=0;j--){
	               temp.append(arr[i].charAt(j));
	           }	            
	           rev.append(temp);
	           rev.append(" ");
	       }
	       return rev.toString();
	 }
	 public static String reverseWords2(String s) {
		 String [] wordsArr= s.split(" ");
		 StringBuffer reverse = new StringBuffer();
		 for(int i=0;i<wordsArr.length;i++) {
			StringBuffer word = new StringBuffer();
			 for(int j=wordsArr[i].length()-1;j>=0;j--) {
				 word.append(wordsArr[i].charAt(j));
			 }
			 reverse.append(word+" ");
		 }
		 String rev = reverse.toString().trim();
		 return rev;
	 }

}
