package com.shinhan.day09;

// 14.7 스레드 안전 종료 

// (1) 조건 이용

public class SafeThread2 extends Thread{
	
	public void run() {
		while(true) {
			System.out.println("SafeThread... 실행중");
			
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("리소스 정리");
		System.out.println("SafeThread 종료");
	}
}
