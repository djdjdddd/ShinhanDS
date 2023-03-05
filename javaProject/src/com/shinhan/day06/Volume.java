package com.shinhan.day06;

// 인터페이스가 아닌 추상 클래스로 만들 수도 있긴 함.
//public abstract class Volume {
//	abstract void volumeUp(int volLevel);
//
//	abstract void volumeDown(int volLevel);
//}


public interface Volume {
	
	// 추상 메서드
	void volumeUp(int volLevel);
	
	void volumeDown(int volLevel);

}
