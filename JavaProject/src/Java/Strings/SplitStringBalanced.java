package Java.Strings;

/*
1221. Split a String in Balanced Strings

Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it into some number of substrings such that:

Each substring is balanced.
Return the maximum number of balanced strings you can obtain.
 */

public class SplitStringBalanced {

	public static void main(String[] args) {
		int result = balancedStringSplit("RLRRRLLRLL");
		System.out.println(result);
	}
	public static int balancedStringSplit(String s) {
		
		int count=0;
		int meter = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='R')
			{
				meter++;
			}
			else
				meter--;
			if(meter==0)
				count++;
		}
		return count;
	}

}
