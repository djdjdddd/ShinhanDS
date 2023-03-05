package com.shinhan.day05;

// 구현 클래스라고 부른다.
// => (RemoteControl)이란 인터페이스를 구현한 클래스
public class Television implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName() + "전원켠다");
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName() + "전원끈다");
	}

}
