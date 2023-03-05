package com.shinhan.day07;

import java.util.HashSet;
import java.util.Set;

public class ObjectTest2 {

	public static void main(String[] args) {

		f3();

	}

	// 롬복 사용
	private static void f3() {
		Computer c1 = new Computer();
		Computer c2 = new Computer("A", 100, "LG");
		Computer c3 = new Computer("A", 100, "LG");
		System.out.println(c2.getModel());
		c2.setMaker("엘지");
		System.out.println(c1.equals(c3));
	}

	// 레코드 사용
	private static void f2() {
		Person p1 = new Person("홍길동", 20);
		System.out.println(p1);
		System.out.println(p1.name());
		System.out.println(p1.age());
	}

	private static void f1() {
		ProductVO p1 = new ProductVO("컴퓨터", 100, "삼성");
		ProductVO p2 = new ProductVO("컴퓨터", 100, "삼성");
		
		// 아래를 출력했을 때 
//		ProductVO [name=컴퓨터, price=100, maker=삼성]
//		ProductVO [name=컴퓨터, price=100, maker=삼성]
		// **이렇게 나오는 건 ProductVO 클래스에 'toString'이 재정의 되어있기 때문임. 확인해봐
		System.out.println(p1);
		System.out.println(p2);
		
		
		System.out.println(p1 == p2); // 주소비교 (cf. 자바는 연산자 재정의불가)
		System.out.println(p1.equals(p2)); // .equals를 쓴다고 하여도 *재정의 안하면 여전히 주소를 비교함. 
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		// Set(주머니)에 data를 담은 건데, Set이다 보니 중복되면 허용하지 X
		Set<ProductVO> data = new HashSet<>();
		data.add(p1);
		data.add(p2);
		
		
		for(ProductVO p : data) {
			System.out.println(p);
		}
	}

}
