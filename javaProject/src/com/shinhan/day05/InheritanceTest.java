package com.shinhan.day05;

// 상속 배운 내용 테스트
class Parent{
	int a = 10;
	
	void f1() {
		System.out.println("부모 클래스의 f1 함수 실행");
	}
	
	void f2() {
		System.out.println("부모 클래스의 f2 함수 실행");
	}
}

class Child extends Parent{
	int b = 20;
	
	void f1() {
		System.out.println("자식 클래스의 f1 함수 실행");
		
		super.f1(); // **
	}
	
	void f2() {
		System.out.println("자식 클래스의 f2 함수 실행");
	}
}


public class InheritanceTest {

	public static void main(String[] args) {
		Child ch = new Child();
		
		System.out.println(ch.a); // ★자식이 부모껄 상속받는다고 해서 '완전히 가져온다'고 생각하지 말고, '화살표'로 생각하자.
		System.out.println(ch.b); // 먼저 자식껄 보고, 어 a가 없네? 그러면 화살표대로 거슬러 올라가서 a를 찾는 것. 
		ch.f1(); // ★여기엔 super.f1(); 이 있었으니까 상위클래스(super)를 한번 거쳤다가 돌아온 것!! (화살표를 상상하자)
		ch.f2(); // 여기엔 없었으니까 그냥 자식클래스에 있던 f2만 실행한 거고. 
	}

}
