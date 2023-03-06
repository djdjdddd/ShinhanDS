package com.shinhan.day09;

// 14.7 스레드 안전 종료 

// (1) 조건 이용

public class SafeThread extends Thread{
	
	private boolean stop;

	// stop을 설정 및 조작하기 위한 setter
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public void run() {
		while(!stop) {
			System.out.println("SafeThread... 실행중");
			
		}
		System.out.println("리소스 정리");
		System.out.println("SafeThread 종료");
	}
}
