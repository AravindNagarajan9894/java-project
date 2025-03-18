package Java.Abstract;

import java.util.Scanner;

public class ExampleTwo {
	public static void main(String [] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("please select any below options. 1.Cat 2.Dog 3.Lion");
		String animal = scn.next().toLowerCase();
		Operation.oper(animal);
	}
}
class Operation{
	static void oper(String animal) {
	if(animal.equalsIgnoreCase("cat")) {
		Cat cat = new Cat();
		cat.eat();
		cat.sound();
	}
	else if(animal.equalsIgnoreCase("dog")) {
		Dog dog = new Dog();
		dog.eat();
		dog.sound();
	}
	else if(animal.equalsIgnoreCase("lion")) {
		Lion lion = new Lion();
		lion.eat();
		lion.sound();
	}
	else
		System.out.println("Please enter valid option!!!");
	}
}
abstract class Animal{
	abstract void sound();
	abstract void eat();
	Animal(){
		
	}
}
class Cat extends Animal{
	@Override
	void sound(){
		System.out.println("meow meow");
	}
	void eat() {
		System.out.println("milk");
	}
}
class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("bow bow");
	}
	@Override
	void eat() {
		System.out.println("palayasoru");
	}
}
class Lion extends Animal{
	@Override
	void sound() {
		System.out.println("roar");
	}
	@Override
	void eat() {
		System.out.println("dog and cat");
	}	
	
}