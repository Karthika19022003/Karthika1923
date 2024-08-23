package com.tnsif.day9.Interfaces.WrapperClasses;

interface one{
	// only abstract method
	// will have default public abstract
	int age = 21;   // final & static
	void show();   // default public abstract
}
class two implements one{
	
	@Override
	public void show() {
		System.out.println("Interface Method one");
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		two obj=new two();
		obj.show();
	}

}
