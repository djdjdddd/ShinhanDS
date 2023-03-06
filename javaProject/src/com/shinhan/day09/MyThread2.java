package com.shinhan.day09;

// 멀티 쓰레드 만드는 방법
// 1. (1)상속받고(extends Thread), (2)run() 메소드를 재정의하여 구현

public class MyThread2 extends Thread { // (1)

	// (2) Thread 클래스의 run 메소드를 오버라이드
	@Override
	public void run() {
		for(char i='A'; i<='Z'; i++) {
			System.out.println("[" + getName() + "]" + " i = " + i);
		}
	}
	
	public MyThread2(String name) {
		super(name);
	}
	
	public MyThread2() {}
}
