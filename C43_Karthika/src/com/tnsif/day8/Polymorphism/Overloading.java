package com.tnsif.day8.Polymorphism;

public class Overloading {
	int num1;      //data members
	int num2;
	int result;
	
	void Sum(int a,int b) {   //method
		num1=a;
		num2=b;
		result=num1+num2;
		
		System.out.println("The results are: "+result);
	}
	void Sum(int a,double b) {   //method
		num1=a;
		num2=(int)b;
		result=num1+num2;
		
		System.out.println("The results are: "+result);
	}
	void Sum(double a,double b) {   //method
		num1=(int)a;
		num2=(int)b;
		result=num1+num2;
		
		System.out.println("The results are: "+result);
	}

	public static void main(String[] args) {
		Overloading obj=new Overloading();
		obj.Sum(21,32);
		obj.Sum(2,3);
	}

}
