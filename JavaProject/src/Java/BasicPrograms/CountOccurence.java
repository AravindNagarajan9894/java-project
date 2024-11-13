package Java.BasicPrograms;

import java.util.Scanner;

public class CountOccurence {

	public static void countOccr() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = input.nextInt();
		System.out.println("Enter the Number to find");
		int numToFind =input.nextInt();
		int count =0;
		int temp = num;
		while(temp>0) {
			int i = temp%10;
			if(i == numToFind) {
				count++;
			}
			temp /= 10;
		}
		System.out.println("number "+ numToFind+ " occuring "+ count + " times" );
	}
}
