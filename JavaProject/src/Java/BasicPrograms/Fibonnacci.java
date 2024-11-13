package Java.BasicPrograms;

public class Fibonnacci {

	public static void seciesFibo() {
		int limit = 10;
		int firstNum = 0;
		int secondNum =1;
		int thirdNum =1;
		while(limit>=1) {
			System.out.println(firstNum);
			firstNum = secondNum;
			secondNum = thirdNum;
			thirdNum = firstNum + secondNum;
			limit--;
		}
	}
	public static void seciesFibo_Type2() {
		int a = 0;
		int b = 1;
		int c = 1;
		int n = 7;
		while(n>=0) {
			System.out.println(a);
			a = b;
			b = c;
			c = a+b;
			n--;
		}
		System.out.println(a+ "is the 7 th fib num");
	}
}
