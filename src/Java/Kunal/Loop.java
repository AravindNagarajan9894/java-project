package Java.Kunal;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		printNum p1 = new printNum();
		p1.print_Number_To_n();
	}
}
class printNum{
	void print_Number_To_n() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
//		for(int i=0;i<=n;i++) {
//			System.out.print(i);
//		}	
		int i = 0;
		while(i<=n) {
			System.out.print(i);
			i+=1;
		}
	}
}