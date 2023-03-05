package com.shinhan.day05;

// (책 313) 타이어 

// abstract class : 추상 메서드가 '존재할 수도 있는' 클래스를 의미. (반드시 1개 이상 가지는 게 아니었음)
public abstract class Tire {
	
	// 추상 메서드 : 정의는 있고, 구현{}은 없는 -> 그래서 {} 없이 ;만 쓰는구나.
	// 구현은 상속받은 자식class가 '반드시' 한다. (override의 의무) (cf. 그래서 public을 금호, 한국타이어 클래스의 roll() 함수에도 붙여줘야 했던 것. 그게 override의 의무니까...)
	public abstract void roll();
	
	void f1() {
		System.out.println("다른 함수가 있는 경우~");
	}

}
