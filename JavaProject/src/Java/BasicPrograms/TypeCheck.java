package Java.BasicPrograms;

import java.util.Scanner;

public class TypeCheck {

	static void findCase() {
		Scanner input = new Scanner(System.in);
		char a = input.next().charAt(0);
		if(a>='a'&& a<='z') {
			System.out.println("LowerCase");
		}
		else if(a>='A'&& a<='Z')
		System.out.println("UpperCase");
		else
			System.out.println("Wrong Letter");
	}
}
