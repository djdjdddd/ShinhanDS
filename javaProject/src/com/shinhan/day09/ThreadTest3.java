package com.shinhan.day09;

public class ThreadTest3 {

	public static void main(String[] args) {
		System.out.println("main thread 시작");
		
		Thread t1 = new MyThread1("대문자출력 Thread");
		Thread t2 = new MyThread2("숫자출력 Thread");
		Runnable r = new MyThread3();
		Thread t3 = new Thread(r);
		t3.setName("소문자출력 Thread"); // **여기서 setName 이란 메소드를 통해 쓰레드의 이름을 설정해주었음. 
		                              // 아마도.. 바로 Thread로 만든게 아니고 Runnable 거쳤다가 와서 그런가봐 (글케 중요한건 아닌듯)
		
		t1.start();
		t2.start();
		t3.start();
		
		// 14.5 스레드 상태
		// 상태 이름 얻는 법
		System.out.println("t1:" + t1.getState().name()); // .getState() : 상태를 얻고, .name(): 그거의 이름을 (getName과는 좀 다르네)
		
		System.out.println("main thread 끝");
	}

}
