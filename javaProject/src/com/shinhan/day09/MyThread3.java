package com.shinhan.day09;

// 멀티 쓰레드 만드는 방법
// 2. 이미 상속받고 있는 경우엔... Runnable interface를 구현하면 된다! (Thread 클래스 대용인 듯?)

public class MyThread3 extends Object implements Runnable{ // (1)

	// (2) Runnable 인터페이스의 run 메소드를 오버라이드
	@Override
	public void run() {
		for(char i='a'; i<='z'; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "]" + " i = " + i); // 여긴 Thread를 상속받는 게 아니므로 저렇게 Thread.currentThread. 해야 한다.
		}
	}
	
	public MyThread3() {}
	
	public MyThread3(String name) {
		Thread.currentThread().setName(name); // 얘는 getName이 아닌 setName을 통해 쓰레드의 이름을 설정해주는 메소드를 부른 것.
	}
	
}
