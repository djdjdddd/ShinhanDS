package com.shinhan.day09;

// 책 615 예제

// 공유영역
public class WorkObject {

	public synchronized void methodA() { // 동기화 메소드 (**공유영역 중에 하나의 쓰레드가 사용 중이면, 다른 쓰레드가 접근하지 못하게 하는 역할)

		Thread t = Thread.currentThread(); // 현재 실행하고 있는 thread object를 리턴
		System.out.println(t.getName() + "작업실행A"); // t라는 쓰레드의 이름을 얻는 함수

		notify(); // *다른 쓰레드를 실행대기 상태로 만듦. 

		try {
			wait(); // *자신의 쓰레드는 일시정지 상태로 만듦. 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public synchronized void methodB() { 

		Thread t = Thread.currentThread(); // 현재 실행중인 thread object의 reference를 리턴
		System.out.println(t.getName() + "작업실행B"); // 그니까 t.getName 하면 현재 실행중인 쓰레드의 이름을 얻을 수 있는 것. 

		notify();

		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
}
