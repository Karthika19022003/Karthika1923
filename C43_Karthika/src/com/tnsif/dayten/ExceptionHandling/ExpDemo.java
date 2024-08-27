package com.tnsif.dayten.ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
try {
	System.out.println("Enter a number: ");
	int a=sc.nextInt();
	System.out.println(a%2==0?a+" is Even":a+" is Odd");
	return;
}
catch(InputMismatchException e) {
	System.err.println("Invalid Input...");
}
finally {
	System.out.println("In Finally...");
	sc.close();
}
	}

}
