package com.shinhan.day03;


// class : 설계도 (object, 즉 객체를 만드는 틀)
// Object : class를 이용해서 만든 객체 (= instance)
public class Car {
	// 1. field (속성, 멤버변수)
	String model; // 자동차라는 클래스(설계도)엔 모델이 있어
	String color; // 색깔도 있어
	int price; // 가격도 있어
		       // 이런 식으로 이 클래스(설계도)의 속성, 즉 변수가 있다. 
			   // (좀 이런 식으로 이해를 해가면서 클래스(설계도)를 짜면 훨씬 편하지 않을까?)
	
	// 2. 생성자 메서드 (생성시 초기화가 목적)
	// compile시에 자동으로 .class에 default 생성자가 만들어진다. (default 생성자는 ()안에 아무 매개변수도 없는 놈)
	// 따라서 생성자를 정의하는 것은 필수가 아니다.
	
	// 생성자 두가지 특징 (1) 생성자는 return 정의가 없다. (2) 생성자는 클래스 이름과 똑같이 써야 한다.
	// 
	public Car(){ // (cf. public : 다른 패키지에서 접근할 수 있다. 즉, public Car 라고 하면 다른 패키지에서 요놈에 접근할 수 있다)
		System.out.println("순서 3. Car의 default 생성자");
	}
	
	// 3. 일반 메서드 (method, 기능, 동작)
	void go() { // 왜 일반 메서드냐? (1) 리턴이 있고(void), (2) 이름이 클래스와 다르죠?
		System.out.println("자동차가 간다");
	}
	
	// 4. block (instance block이 있고, static block이 있다)
	{
		System.out.println("순서 2. instance block... 생성시 즉, new할때마다 생긴다. 또한 생성자보다 먼저 생성된다");
		
	}
	
	static { // 왜냐면 static 은 
		System.out.println("순서 1. static block... class load시 딱 1번 수행. 가장 먼저 수행됨");
	}
	
	// 5. inner class (클래스 안에 또 클래스를 만들 수 있다)
	
	
}
