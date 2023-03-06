package com.shinhan.day09;

// 14.6 스레드 동기화 
// 공용 화장실을 예시로 해서 이해해보자!

// 공유영역
public class BathRoom {
	
	boolean isFirst = true;
	public void use(String name) {
		synchronized(this) {
			if(isFirst && name.equals("김씨")) {
				try {
					wait(); // wait하면 일시정지 상태로 들어가서 무한대기 => notify를 부르면 실행대기 상태로
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}isFirst = false;
			System.out.println(name + "입장한다.");
			System.out.println(name + "사용한다.");
			System.out.println(name + "퇴장한다.");
			System.out.println(name + "----------");
			notifyAll(); // wait 상태에 있는 쓰레드가 실행대기(Runnable) 상태로 간다.
		}
		
	}
	
	
	// (1) 동기화 메소드
	// 메소드 전체를 동기화한 경우 (synchronized 써서)
	public synchronized void use1(String name) {
		System.out.println(name + "입장한다.");
		System.out.println(name + "사용한다.");
		System.out.println(name + "퇴장한다.");
		System.out.println(name + "----------");
	}
	
	
	// (2) 동기화 블록
	public void use2(String name) {
		
		// 메소드 전체가 아닌 일부 영역만 잠금을 걸고 싶을 때 사용
		synchronized (this) {
			System.out.println(name + "입장한다.");
			System.out.println(name + "사용한다.");
		}
	
		System.out.println(name + "퇴장한다.");
		System.out.println(name + "----------");
	}

}
