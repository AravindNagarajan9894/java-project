package Java.Interface.Java8;

public class Java8NewImp {

}
interface FirstClass{
	 int a =10;
	 abstract void m1();
}
class SecndClasss implements FirstClass{

	 
	@Override
	public void m1() {
		System.out.println(a);
		int a=10;
		float b = 270.098f;
		double c = 234509.98757;
	}
	
}
