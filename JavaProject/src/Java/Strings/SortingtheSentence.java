package Java.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingtheSentence {

	public static void main(String[] args) {
		sortSentence("is2 sentence4 This1 a3");
//		String str = "is2 sentence4 This1 a3";
//		System.out.println(str.substring(0,str.length()-1));;

	}
	 public static String sortSentence(String s) {
	        String [] split = s.split(" ");
	        
	        String [] split2 = new String[split.length];
	        
	        for(int i=0;i<split.length;i++) {
	        	
	        	
	        	int j1= (int)split[i].charAt(split[i].length()-1);
	        
	        	
	        	split2[j1-48-1]=split[i].substring(0, split[i].length()-1);
	        	
	        }
	        
	        StringBuffer str = new StringBuffer();
	        for(int i=0;i<split2.length;i++){
	            str.append(split2[i]);
	            str.append(" ");
	        }
	        String result = str.toString().trim();
	       
	        return result;
	    }
}
