package Java.Interface.ApplicationForm;

public class Main {

	public static void main(String[] args) {
		Form form = new Form();
		form.save();
		form.close();
		form.updateForm();
		form.save();
		form.close();
		
		byte a =(byte)257;
		System.out.println(a);
	}
}

interface A{
	static void m1() {
		System.out.println("Static method");
	}
}

class B implements A{
	void m2() {
		A.m1();
	}
}