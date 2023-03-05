package com.shinhan.day06;

public class OkListener implements Button.ClickListener{ // Button 안에 있는 ClickListener를 implements할 것이므로 .(도트 연산자)을 이용해서

	// 추상 메소드 구현 의무
	@Override
	public void onClick() {
		System.out.println("OK 버튼 클릭시 수행되는 로직입니다");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}

}
