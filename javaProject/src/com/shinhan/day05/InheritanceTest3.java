package com.shinhan.day05;

class A{}
class B extends A{}
class C extends A{}
class D extends B{
	int max = 100;
}
class E extends B{}
class F extends C{}

public class InheritanceTest3 {

	public static void main(String[] args) {
		f5();
	}

	private static void f5() {
		// 이건 '자동형변환' : 부모타입 = 자식객체
		D v1 = new D();
		B v2 = new D();
		A v3 = new D();
		System.out.println(v1.max);
		
		// '강제형변환'이 필요한 경우 : 자식타입 = (자식타입)부모객체
		// System.out.println(v2.max);
		D v4 = (D)v2;
		System.out.println(v4.max);
		
		E v6 = (E)v2; // 이 경우는 컴파일시엔 오류 없으나,, 실행시에 ClassCastException
		              // ★본래 생성된 Instance로만 형변환 가능한 거임. (즉, D로 생성된 놈은 D로 다시 강제형변환 될 수 있는 거지, 다른 객체인 E로 갈 순 없다는 말)
		
		
	}

	private static void f4() {
		CarTest car = new CarTest();
		
		car.go(new HankookTire());
		car.go(new KumhoTire());
	}

	private static void f3() {
		/*ani.method1();
		if(ani instanceof Dog) {
			Dog d2 = (Dog)ani;
			d2.method3();
			System.out.println(d2.a + d2.c);
			
		}else if(ani instanceof Cat) {
			Cat c2 = (Cat)ani;
			c2.method2();
			System.out.println(c2.a + c2.b);*/
		}
	}


