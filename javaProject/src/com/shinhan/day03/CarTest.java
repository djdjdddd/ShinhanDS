package com.shinhan.day03;

public class CarTest {

	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		// 자동차 객체를 만든다.
		
		// 1. 객체 참조변수 선언 (문법의 논리 흐름? 자체는 다 비슷비슷하고만)
		int a; // 이렇게 하면 a 변수에 int타입의 값을 담을 수 있다는 뜻이잖아?
		Car car1, car2; // 비슷하게 car1 변수에 Car객체를 담을 수 있다는 뜻.
		
		// 2. 객체 생성 ... heap에 객체가 생성되고 주소는 변수에 담는다. (기본형이 아니니까) (그림으로 꼭 상상)
		// 객체가 생성되면 변수들은 자동초기화 된다. (포스트잇 참조)
		car1 = new Car();
		car2 = new Car(); 
		
		// 3. 객체 사용
		car1.model = "A모델";
		car1.color = "black";
		car1.price = 5000;
		
		System.out.println(car1.model);  
		System.out.println(car1.color);
		System.out.println(car1.price);
		
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.price);
	}

}
