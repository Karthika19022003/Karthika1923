package com.tnsif.day9.Interfaces.WrapperClasses;

interface parent1{
	public void show();
}
interface parent2{
	public void disp();
}
class myclass{
	public void display() {
		System.out.println("Method in class");
	}
}
class child extends myclass implements parent1,parent2{
	@Override
	public void disp() {
		System.out.println("Hello!!!");
	}
	@Override
	public void show() {
		System.out.println("Welcome!!!");
	}
}
public class MultipleInterfaceDemo {

	public static void main(String[] args) {
child obj=new child();
obj.show();
obj.disp();
obj.display();

	}

}
