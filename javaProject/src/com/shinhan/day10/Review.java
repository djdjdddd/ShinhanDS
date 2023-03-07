package com.shinhan.day10;

class ThreadA extends Thread{

	// **이 경우엔 run() 메소드 오버라이드가 필수가 X
	@Override
	public void run() {
		super.run();
	}
	
	
}


class ThreadB extends Object implements Runnable{

	// **이 경우엔 run() 메소드 오버라이드 필수적으로 (왜냐면 Runnable 인터페이스를 implements했으니까)
	@Override
	public void run() {
		for(int i=100; i<=110; i++) {
			System.out.println(Thread.currentThread().getName() + i); // Thread.currntThread().getName()
				                                                      // 이건 쓰레드를 상속받는 게 아니므로 위처럼 직접적으로 불러줘야 하더라고.
			try {
				Thread.sleep(500); // sleep 메소드도 마찬가지로 Thread.sleep() 으로 불러줘야
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class Review {

	public static void main(String[] args) {
		
		// 1. Thread를 상속받은 경우 
		Thread t1 = new ThreadA();
		
		// 2. Runnable 구현한 경우 
		Thread t2 = new Thread(new ThreadB()); // 이렇게 Thread를 new하고 그 안에 (Runnable을 구현한) ThreadB를 new하는
		
		// 3. Runnable 익명 객체
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				
			}
			
		});
	}

}
