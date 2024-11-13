package Java.Abstract;

public class ExampleOne {
	public static void main(String[] args) {
		MyClassTwo mct = new MyClassTwo();
		mct.methodOne();
		mct.methodTwo();
		
	}
}

abstract class MyClassOne {

    int age;
	
	MyClassOne(){
		this.age=0;
	}
	
	abstract void methodOne();

	abstract void methodTwo();
}
class MyClassTwo extends MyClassOne{
	  int age;
	  int num;
	  MyClassTwo(int age, int num){
		  this.age=age;
		  this.num=num;
	  }
	  MyClassTwo(){
		  this.age=0;
		  this.num=0;
	  }
	  @Override 
	  void methodOne() {
		  System.out.println("Method One Overrided");
		  System.out.println(age);
	  } 
	  @Override
	  void methodTwo() {
		  System.out.println("Method Two Overrided");
	  }
}
class MyClassThree extends MyClassTwo{
	
	MyClassThree(int age, int num) {
		super(age, num);
	}

	void methodThree() {
		
	}
}
