package Java.Strings;

import java.util.Arrays;

public class ShuffleString {
	public static void main(String[] args) {
		System.out.println(restoreString("codeleet",new int[]{4,5,6,7,0,2,1,3}));;
	}
	public static String restoreString(String s, int[] indices) {
		char arr[] = new char[indices.length];
		String newString="";
	    for(int i=0;i<indices.length;i++){
	        	arr[indices[i]]=s.charAt(i);
	    }
	    for(int i=0;i<arr.length;i++) {
	    	newString = newString + arr[i];
	    }
	    return newString;
    }
}