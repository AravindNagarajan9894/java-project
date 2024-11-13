package Java.Interface.ApplicationForm;

public class InterfaceRevise {

	public static void main(String[] args) {
		 int a=10;
		 a=11;

	}

}
interface redTape{
	 void m1();
	 static void m2() {
		 System.out.println(10);
	 }
	 int a=10;

}

class classone implements redTape{
	public void m1(){
		int b = a;
	}
}
