package Java.Kunal;

// override toString method in Java
public class ObjectClass {
	public static void main(String[] args) {
		A a = new A();
		a.setAB(10, 10);
		System.out.println(a);
		System.out.println(a.toString());
	}

}

class A extends Object {

	private int a, b;

	A() {
		this.a = 0;
		this.b = 0;
	}

	A(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int getA() {

		return a;
	}

	int getB() {
		return b;
	}

	void setAB(int a, int b) {
		this.a = a;
		this.b = b;
	}

	
	 @Override 
	 public String toString() { 
		 return a+"+"+b;
	 }
	 
}
