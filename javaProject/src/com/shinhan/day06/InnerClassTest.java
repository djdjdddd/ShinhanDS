package com.shinhan.day06;

public class InnerClassTest {

	public static void main(String[] args) {
		f4();
	}

	private static void f4() {
		// 4. 로컬 클래스
		
		OuterClass outer = new OuterClass(); // 먼저 OuterClass의 객체를 만들고
		outer.f1(); // f1을 실행 (로컬 클래스는 함수 실행시 객체 생성되는 놈이니까)
	}

	private static void f3() {
		// 3. 스태틱 이너클래스
		
		OuterClass.StaticInnerClass v1;
		v1 = new OuterClass.StaticInnerClass();
		
		System.out.println(v1.s1);
		System.out.println(OuterClass.StaticInnerClass.s2);
		
		v1.method3();
		OuterClass.StaticInnerClass.method4();
	}

	private static void f2() {
		// 2. 인스턴스 이너클래스
		
		// new하는 2가지 방법
		// (1) 객체별로 나눠서 쓰는 
		OuterClass outer = new OuterClass();
		OuterClass.InstanceInnerClass v2 = outer.new InstanceInnerClass();
		
		// (2) 한방에 쓰는거
		OuterClass.InstanceInnerClass v1 = new OuterClass().new InstanceInnerClass(); // '인스턴스 이너클래스'이다 보니 객체를 2번 생성해야 해서 2번 new했구만

		System.out.println("instanceInnerClass instance field: " + v1.s1); 
		System.out.println("instanceInnerClass static field: " + OuterClass.InstanceInnerClass.s2); 
	
		v1.method3();
		OuterClass.InstanceInnerClass.method4(); // static은 당연히 new랑 아예 상관없고
		
	}

	private static void f1() {
		// 1. 일반적인 class 사용
		OuterClass v1 = new OuterClass();
		System.out.println("instance field: " + v1.a); // a는 인스턴스 멤버니까
		System.out.println("instance field: " + OuterClass.b); // b는 클래스 멤버니까 (static 붙어있는)
		v1.method1();
		OuterClass.method2();
		
	}

}
