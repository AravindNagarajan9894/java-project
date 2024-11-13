package Java.BasicPrograms;

import java.util.Scanner;

class Largest{
	public static void largest_Amoung_Three_Nums() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers one by one");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if(a>b&&a>c) {
			System.out.println(a + " is the largest number");
		}
		else if(b>a&&b>c) {
			System.out.println(b + " is the largest number");
		}
		else {
			System.out.println(c + " is the largest number");
		}
	}
	public static void Largest_Math() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers one by one");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int max = Math.max(c, Math.max(a, b));
		System.out.println(max);
	}
}