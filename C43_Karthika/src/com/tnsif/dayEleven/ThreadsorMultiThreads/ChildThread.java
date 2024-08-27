package com.tnsif.dayEleven.ThreadsorMultiThreads;

	//run() method+
public class ChildThread extends Thread{
	private int n;
	private String msg;
	
		//Constructor (2 parameterized constructor)
	public ChildThread(int n, String msg) {
		this.n=n;
		this.msg=msg;
	}
	public void run() {     //run() method 
		for (int i=1;i<=n;i++) {
		try {
			Thread.sleep(300);
		}
catch (Exception e) {
	System.out.println("Thread interrupted: "+e.getMessage());
}
		System.out.println(msg+i+""+Thread.currentThread()+getName());
	}
	}
}
