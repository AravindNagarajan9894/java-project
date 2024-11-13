package Java.Strings;
/*
 Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

 A string is palindromic if it reads the same forward and backward.
 */
public class FindFirstPalindromicStringintheArray {

	public static void main(String[] args) {
		String result = firstPalindrome(new String[]{"abc","car","ada","racecar","cool"});
		System.out.println(result);
	}
	 public static String firstPalindrome(String[] words) {
	        String pal = "";
	        for(int i=0;i<words.length;i++){
	            String temp="";
	            
	            for(int j=words[i].length()-1;j>=0;j--){
	            	
	                temp = temp + words[i].charAt(j);
	            }	            
	            if(words[i].equals(temp))
	            {
	                pal = words[i];
	                break;
	            }   
	        }
	        return pal;
	 }
}
