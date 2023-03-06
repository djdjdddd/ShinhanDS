package com.shinhan.day09;

// 멀티 쓰레드 만드는 방법
// 1. (1)상속받고(extends Thread), (2)run() 메소드를 재정의하여 구현

public class MyThread1 extends Thread { // (1)
	
	public MyThread1(String name) {
		super(name);
	}

	// (2) Thread 클래스의 run 메소드를 오버라이드
	@Override
	public void run() {
		for(int i=1; i<=26; i++) {
			System.out.println("[" + getName() + "]" + " i = " + i); // 어차피 Thread를 상속받고 있기에 Thread.curren~~ 필요없다.
		super.run();
	}
	}
	
	public MyThread1() {}
	
}
