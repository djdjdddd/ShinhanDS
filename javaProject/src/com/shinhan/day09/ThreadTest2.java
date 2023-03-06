package com.shinhan.day09;

public class ThreadTest2 {
	
	// Thread를 익명(구현)객체로 만들어보자.

	public static void main(String[] args) {
		f1();
		System.out.println("main 종료");
	}

	private static void f1() {
		// 이렇게 하지 말고
//		Thread t1 = new MyThread1();
		
		// 익명 객체 사용해서 쓰레드를 실행해보자. 
		Thread t1 = new Thread() { // 얘를 잠궈야 함.
			@Override
			public void run() {
				for(int i=1; i<=26; i++) {
					System.out.println("[" + getName() + "]" + " i = " + i);
					try {
						sleep((int)(Math.random() * 100));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		}
	}
		
		}; // 여기를 ;로 잠궈야 함.
		
		
		
		// new Thread 하고 그 안에 (new Runnable() {오버라이드 내용} ); 
		// 형식으로 익명객체를 만든 케이스
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(char i='a'; i<='z'; i++) {
					System.out.println("[" + Thread.currentThread().getName() + "]" + " i = " + i); // 여긴 Thread를 상속받는 게 아니므로 저렇게 Thread.currentThread. 해야 한다.
					try {
						Thread.sleep((int)(Math.random() * 100));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		}
		
	});
		
		t1.start();
		t3.start();
}
}
