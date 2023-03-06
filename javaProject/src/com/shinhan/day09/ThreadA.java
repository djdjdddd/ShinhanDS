package com.shinhan.day09;

public class ThreadA extends Thread{
	
	WorkObject workObject;
	
	public ThreadA(WorkObject workObject) {
		setName("[ThreadA]");
		this.workObject = workObject;
	}

	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			workObject.methodA();
		}
	
	}
	
	

}
