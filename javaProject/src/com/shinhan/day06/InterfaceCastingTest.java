package com.shinhan.day06;

// 8.10 타입 변환 (368)
interface A{ void method1(); } // *public abstract가 생략돼있기 때문에 
class B implements A{ public void method1() {System.out.println("B 메서드 재정의"); } // *public을 붙여야 한다~
class C implements A{ public void method1() {System.out.println("C 메서드 재정의"); }
class D extends B{ 
	public void method1() {
		System.out.println("D 메서드 재정의");
	}
		
	
	public void method2() {
		System.out.println("D에서 메서드2 추가");
	}
}
class E extends C{ public void method1() {System.out.println("E 메서드 재정의"); }


public class InterfaceCastingTest {
	public static void main(String[] args) {
		
		A v1 = new D(); // 새로 만든 D 객체를 A(인터페이스) 타입의 v1에 대입
		B v2 = new D(); // B타입으로 생성
		D v3 = new D(); // D타입으로 생성
		
		v1.method1();
		v2.method1();
		v3.method1(); 
		
		// 모두 D타입으로 '강제 형변환'
		((D)v1).method2(); // v1을 D타입으로 강제 형변환해서 실행한 method2
		((D)v2).method2();
		((D)v3).method2();
		
		// 실행오류
		E e = (E)v1;
		e.method1();
		
	}

 	}
