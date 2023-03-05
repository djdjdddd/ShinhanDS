package com.shinhan.day06;

// 9.1 중첩 클래스 (책 394)

// 드디어 5.inner class 다루는 듯?
// (cf. 쌤도 안드로이드 앱 만들 때 빼고는 잘 안 쓰신다고. 그냥 따로 클래스 만들면 되는데 굳이 안에 만들 이유가..)
public class OuterClass {
	
	// 1. 필드 (인스턴스와 스태틱)
	int a = 10;
	static int b = 20;
	
	// 2. 생성자
	
	// 3. 메서드
	void method1() {System.out.println("OuterClass... 인스턴스 메소드로 만든");}
	static void method2() {System.out.println("OuterClass... 스태틱 메소드로 만든");}
	
	// 4. block (인스턴스 블락과 스태틱 블락)
	
	// 5. inner class (중첩 클래스)
	
	// 인스턴스 이너클래스
	class InstanceInnerClass{ // 이게 바로 '이너 클래스' (클래스 안에 클래스가 있는)
		String s1 = "InstanceInnerClass임";
		static String s2 = "InstanceInnerClass임";
		void method3() {
			System.out.println("InnerClass... 인스턴스 메소드로 만든");
			System.out.println("외부의 instance field접근: " + a);
			System.out.println("외부의 static field접근: " + b);
		}
		static void method4() {
			System.out.println("InnerClass... 스태틱 메소드로 만든");
//			System.out.println("외부의 instance field접근: " + a); // static이 non-static을 사용할 순 없다.
			System.out.println("외부의 static field접근: " + b);
		}
		
	}
	
	// 스태틱 이너클래스
	static class StaticInnerClass{ // 이게 바로 '이너 클래스' (클래스 안에 클래스가 있는)
		String s1 = "StaticInnerClass임";
		static String s2 = "StaticInnerClass임";
		void method3() {System.out.println("StaticInnerClass... 인스턴스 메소드로 만든");}
		static void method4() {System.out.println("StaticInnerClass... 스태틱 메소드로 만든");}
	}
		
	void f1() {
		// 로컬 클래스 (method가 실행할 때만 객체를 생성할 수 있는)
		// : static 불가 (당연한게 함수를 호출하려면 객체를 생성해야 해서??
		
		// 9장 확인문제 2번.
		// 지역변수는 내부class에서 사용하면 final 특성을 가진다. 
		int max = 100;
		max++; // 마찬가지로 얘도 안 될듯? 왜냐면 max변수를 사용했으니까 ++로 수정 못하지.
		class LocalClass{
			String s1 = "LocalClass임";
			static String s2 = "StaticLocalClass임";
			void method3() {
				System.out.println("LocalClass... 인스턴스 메소드로 만든");
				System.out.println(a);
				System.out.println(b);
				System.out.println(max);
				max = 200; // 위에서 이미 사용을 했으므로 -> 더이상 값을 바꿀 수 없음.
			}
			static void method4() {System.out.println("LocalClass... 스태틱 메소드로 만든");}
		}
		LocalClass local = new LocalClass();
		
		System.out.println(local.s1);
		System.out.println(LocalClass.s2);
		local.method3();
		LocalClass.method4();
	}
		
	}


