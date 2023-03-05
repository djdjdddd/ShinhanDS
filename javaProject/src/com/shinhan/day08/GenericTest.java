package com.shinhan.day08;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		
		method3();
		
		
		// 제네릭 메소드
		// 1. 만약 이렇게 입력값 타입이 여러개가 있다 치면
		// ★★★'결정되지 않은 타입(T)'이 각각 String, Integer로 선언된 케이스구나 이게
		HappyBox<String> box1 = Boxing("입력값을 써주면"); // **main에서는 ( ) 안에 입력값을 주니까 보통
		HappyBox<Integer> box2 = Boxing(5000);
		System.out.println(box1);
	}
	
	private static void method3() {
		genericExtendMethod(new ChildA());
		genericExtendMethod(new ChildB());
		genericExtendMethod(new Parent());
		// Money 클래스는 Parent를 상속받지 않으므로 X (이게 제네릭 메소드의 역할? 제한된 타입 파라미터(bounded type parameter)의 역할?)
		genericExtendMethod(new Money(100));
		
		genericExtendMethod2(new HappyBox<>("사과", 0));
	}

	
	// (1) 제네릭스를 이렇게 '매개값'에 설정해도 되고
	private static <T> void genericExtendMethod2(HappyBox<? super Number> para) { 
		System.out.println("와일드카드 타입 파라미터");
		System.out.println(para);
	}

	// (2) 제네릭스를 이렇게 '리턴타입 앞'에 설정해도 되나 보네??
	private static <T extends Parent> void genericExtendMethod(T para) {
		System.out.println("genericExtendMethod...호출됨");
	}

	private static void method2() {
		int a = 10;
		int b = 20;
		boolean result = compare(a,b);
		System.out.println(result);
		
		// ***s1, s2는 Number와 관련 없으므로 불가!
		String s1 = "자바";
		String s2 = "자바";
		result = compare(s1, s2);
		System.out.println(result);
	}

	// 13.4 제한된 타입 파라미터 (책 581)
	// ***T는 Number와 Number의 자식 클래스(Number를 상속받은 클래스)의 타입만 가능하다. 
	private static <T extends Number> boolean compare(T a, T b) { // (cf. 오토박싱되어 int가 아닌 Integer가 된다고 함. 그냥 그렇다고)
		
		return a == b; // (cf. 마찬가지로 오토언박싱되어 서로의 값을 비교하게 된다. 주소가 아니라) (Wrapper class..)
		
//		return a.equals(b); // *노트 참조 
	}
	
	
	private static <T,A,B> int boxing2(T kind, A a, B b, String s) {
	
		// 결정되지 않은 타입 : T, A, B
		// 결정된 타입 : String s
		
		return 100;
		
		
	}
	

	// 제네릭 메소드
	// 2. 아래의 제네릭 메소드는 자신의 타입에 맞는 놈을 딱 골라서 (호출하고 어쩌고)를 한다는 뜻인 듯??
	private static <T> HappyBox<T> Boxing(T kind) { // **여기선 매개변수를 써주고 (입력값을 받을)
		
		return new HappyBox<>(kind, 10);
	
	
	}

	// Product
	private static void f5() {
		Product<String, Integer> p1 = new Product<>("책", 1000); // 우측은 생략해도 무방 (<> 안에 내용물) 넘 꼴뵈기 싫어
		System.out.println(p1);
		
		Product<String, Integer> p2 = new Product<>("책", 1000); // 우측은 생략해도 무방 (<> 안에 내용물) 넘 꼴뵈기 싫어
		System.out.println(p1.equals(p2));
	}

	private static void f4() {

		// Money 타입(내가 만든 클래스)만 담을 수 있는 ArrayList
		ArrayList<Money> data = new ArrayList<>();

		// 
		data.add(new Money(1));
		data.add(2);
		data.add(10);
		for (Money s : data) {
			System.out.println(s);
		}

	}

	private static void f3() {

		// String 타입만 (element로) 담을 수 있는 ArrayList
		ArrayList<String> data = new ArrayList<>();

		// 그럼 이렇게 .add 와 같은 함수를 써도 => 타입 강하게 체크
		data.add("월");
		data.add("화");
		data.add("수");
		for (String s : data) {
			System.out.println(s);
		}

	}

	// 2. 사용 예제
	private static void f2() {
		HappyBox<String> b1 = new HappyBox<String>("바나나", 100); // 우측엔 써도 되고 안써도 되고?

		// 이렇게 '타입 체크를 강하게' 한다
		HappyBox<String> b2 = new HappyBox<>(500, 100);
//		HappyBox<String> b3 = new HappyBox<>(new Money(100), 100);
		HappyBox<String> b4 = new HappyBox<>("책", 100);

		// 따라서 난 형변환을 할 필요가 없다.
		String s1 = b1.kind;
		String s4 = b4.kind;

		HappyBox<Money> b3 = new HappyBox<>(new Money(100), 100);
		Money m1 = b3.kind;
		System.out.println(m1);
	}

	// 1. generics 사용하지 않은 예제
	private static void f1() {

		// 아까 Box에서 Object 타입으로 선언해버린 바람에
		// arg 첫번째 자리에는 뭐가 와도 오류가 나지 X
		Box b1 = new Box("바나나", 100);
		Box b2 = new Box(500, 100);
		Box b3 = new Box(new Money(300), 100);

		// *그러면 이렇게 각각 '강제형변환' 해줘야 하는 번거로움 + 속도느려짐.
		// 심지어 형변환 안해주면 실행예외라서 뭐가 오류난지도 모른 채 그렇게 살아가겠지..
		String s1 = (String) b1.kind;
		int s2 = (Integer) b2.kind;
		Money m = (Money) b3.kind;

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(m);
	}
}
