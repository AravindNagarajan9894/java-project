package Java.BasicPrograms;

import java.util.Scanner;

public class Reverse {
	public static void ReverseNum() {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int temp = number;
		int rev=0;
		while(temp>0) {
			rev = (rev *10)+ temp%10;
			//for eg : temp = 123
			// 0*10+3 = 3 
			// 3*10+2=32
			// 32*10+1=321
			temp /= 10;
		}	
		System.out.println(rev);
	}
}
