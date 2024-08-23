package com.tnsif.day9.Interfaces.WrapperClasses;

public class WrapperClasses{
	public static void main(String[] agrs) {
		// Unboxing - converting explicity
		Integer i = new Integer(19);
		System.out.println(i);
		int b=i.intValue();  //pre-defined method
		System.out.println(b);
		
		//without using intvalue
		int c=i;
		System.out.println(c);
		
		//Autoboxing
		int a=192;
		Integer i1 = a;
		System.out.println(i1);
	}
}