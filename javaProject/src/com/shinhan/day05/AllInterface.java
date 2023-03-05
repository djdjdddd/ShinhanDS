package com.shinhan.day05;

// 8.9 인터페이스 상속
// 클래스와 달리 인터페이스는 '다중 상속'이 가능하다!

// 이 인터페이스를 implemetns한 클래스는 '반드시 4개의 메소드를 구현해야 한다'
// 왜냐면 All 1개(print), Remote 2개, WIFI 1개로 총 4개의 추상 메소드가 있기 때문...!
public interface AllInterface extends RemoteControl, WIFI{
	
	void print();
}
