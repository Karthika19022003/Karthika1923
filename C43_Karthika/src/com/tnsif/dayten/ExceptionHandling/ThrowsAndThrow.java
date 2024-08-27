package com.tnsif.dayten.ExceptionHandling;

public class ThrowsAndThrow {
	public void Demo() {       //throws exception    //arith exp
		int a=5/0;
		System.out.println(a);
	}
	public void Show() {
		try {
			Demo();       //throw new Exception;  //Syntax for throw
		}
		catch(Exception e) {
			System.out.println("Exception----->"+e);
		}
		finally {
			System.out.println("Hello World");
		}
	}
}
