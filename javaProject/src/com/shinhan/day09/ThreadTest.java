package com.shinhan.day09;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("쓰레드이름: " + Thread.currentThread().getName() + "...시작");
			
		// 멀티 쓰레드로 실행시켜보자.
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		
		Runnable r = new MyThread3(); // Thread가 아니라 Runnable을 구현하고 있기 때문에 담는 타입이 달라졌음. 
		Thread t3 = new Thread(r); // 따라서 이 경우엔 이렇게 Thread 객체를 따로 생성해줘야 Thread 타입에 담을 수 있음. 
		
		// 쓰레드가 run을 수행하도록 한다.
		t1.start();
		t2.start();
		t3.start();
		for(int i=100; i<=110; i++) {
			System.out.println(Thread.currentThread().getName() + i + "!!!");
		}
		
		System.out.println("쓰레드이름: " + Thread.currentThread().getName() + "...끝");
	}

	private static void f2() {
		System.out.println("쓰레드이름: " + Thread.currentThread().getName() + "...f2");

		for(int i=1; i<=26; i++) {
			System.out.println(Thread.currentThread().getName() + " i = " + i);
		}
	}

	private static void f1() {
		System.out.println("쓰레드이름: " + Thread.currentThread().getName() + "...f1");
		
		for(char i='A'; i<='Z'; i++) {
			System.out.println(Thread.currentThread().getName() + " i = " + i);
		}
		
	}

}
