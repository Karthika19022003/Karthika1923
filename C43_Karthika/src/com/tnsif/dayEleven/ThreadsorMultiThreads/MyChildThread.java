package com.tnsif.dayEleven.ThreadsorMultiThreads;

public class MyChildThread extends Thread{
	@Override
	public void run() {
		System.out.println("In side run() Thread is alive");
		int no=0;
		while(no<4) {
			no++;
			System.out.println("number= "+no);
			try {
				sleep(500);
			}
			catch (InterruptedException exp) {
				System.out.println("Thread Interrupted..."+exp);
			}
		}
	}
}
