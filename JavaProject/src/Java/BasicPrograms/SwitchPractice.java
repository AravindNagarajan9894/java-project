package Java.BasicPrograms;

import java.util.Scanner;

public class SwitchPractice {
	public static void switchEnhanced() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter any number");
		int day = input.nextInt();
		switch(day){
		case 1,2,3,4,5 ->System.out.println("Weekday");
		case 6,7->System.out.println("Weekend");
		default -> System.out.println("Enter valid details");
		}
	}
	public static void nestedSwitch() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter emp id");
		int empId = input.nextInt();
		System.out.println("Enter file no");
		int fileNo = input.nextInt();
		switch(empId) {
		case 1 :
			switch(fileNo) {
			case 1 :
				System.out.println("empId 1 and file no 1");
				break;
			case 2 :
				System.out.println("empId 1 and file no 2");
				break;
			case 3 :
				System.out.println("empId 1 and file no 3");
				break;
			default :
				System.out.println("Enter valid file no details");
		    }
			break;
		case 2: 
			switch(fileNo) {
			case 1 :
				System.out.println("empId 2 and file no 1");
				break;
			case 2 :
				System.out.println("empId 2 and file no 2");
				break;
			case 3 :
				System.out.println("empId 2 and file no 3");
				break;
			default :
				System.out.println("Enter valid file no details");
		    }
			break;
		default :
			System.out.println("Enter valid emp id details");
		}
	}
}
