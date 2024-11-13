package Java.InterfaceRevise;

interface Animal {
	void eat();
	void sleep();
}

class Dog implements Animal{
	public void eat(){
		System.out.println("Dog eats");
	}
	public void sleep(){
		System.out.println("Dog sleeps");
	}
}

class Cat implements Animal{
	public void eat(){
		System.out.println("Cat Eats");
	}
	public void sleep(){
		System.out.println("Cat sleep");
	}
}

class Main{
	public static void main(String [] args) {
		Animal ref1 = new Dog();
		ref1.eat();
		ref1.sleep();
	}
}
