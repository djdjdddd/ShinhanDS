package com.shinhan.day05;

// 구현 클래스라고 부른다.
// => (RemoteControl)이란 인터페이스를 구현한 클래스
public class Audio implements RemoteControl, WIFI{

	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName() + "전원켠다");
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName() + "전원끈다");
	}

	@Override
	public void display() {
		RemoteControl.super.display(); // (1) 부모 것도 실행하고
		System.out.println("default method 재정의"); // (2) 내것도 실행하고
	}
	
	// ** 인터페이스의 display2와 이것 중 어떤 게 실행될지 확인해보자.
	void display2() {
		System.out.println("!!!!!!!!!!!!"); 
	}

	@Override
	public void wifiTurnOn() {
		System.out.println("wifi turn on!!");
	}

}
