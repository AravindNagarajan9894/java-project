package Java.BasicPrograms;
import java.util.Scanner;
//create infinte loop , when customer clicks x calculator needs to stop
public class Calculator {
	public static void CalculatorProgram() {
		Scanner input =  new Scanner(System.in);
		while(true) {
			System.out.println("Enter the operator: '+','-','*','/','%'");
	        char operator = input.next().trim().charAt(0);
			if(operator == '+'|| operator =='-'|| operator=='*'||operator=='/'||operator=='%') {
				System.out.println("Enter two numbers");
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				int operation=0;
				if(operator == '+') {
					operation = num1 + num2;
				}
				else if(operator =='-') {
					operation = num1 - num2;
				}
				else if(operator =='*') {
					operation = num1 * num2;
				}
				else if(operator =='/') {
					operation = num1 / num2;
				}
				else if(operator =='%') {
					operation = num1 % num2;

				}
				System.out.println(operation);
			}
			else if(operator =='x' || operator =='X' ) {
				System.out.println("Thanks for using us");
				break;
			}
			else {
				System.out.println("Enter valid operator!!!");
			}
		}
	}
}
