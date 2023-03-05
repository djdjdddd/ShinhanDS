package com.shinhan.day05;

// 추상 class : 변수 + 상수 + 생성자 + 일반 메서드 + 추상 메서드
// 규격서(Interface) : 상수 + 추상 메서드 + (default 메서드 + static 메서드 + private 메서드); 원래는 상수와 추상메서드만 있었는데, 나중에 ()가 추가된 내용.
// 즉, 기능은 없고 정의만 있는 형태.
public interface RemoteControl {

	// 앞에 public abstract 가 생략돼있음. 
	public abstract void powerOn();
	void powerOff();
	
	// default 메서드 : 재정의가 가능한 
	default void display() {
		System.out.println("모든 구현 class에 기능 추가");
	}
	
	// static 메서드 : 
	static void display2(){
		System.out.println("모든 구현 class에 기능 추가, but 재정의 불가. 왜냐면 static이므로 interface 소유임");
	}
	
	
	
}
