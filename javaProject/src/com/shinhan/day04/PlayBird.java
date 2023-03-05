package com.shinhan.day04;


// 자바의 최상위 class(물려받고 싶지 않아도 무적권 물려받게 되는 클래스)가 있는데
// 그게 바로 : Object (toString, equals 등)
// toString : 주소를 ~~해라 출력해라??
// equals : 주소를 비교해라
public class PlayBird {

	public static void main(String[] args) {
		
		Duck duck = new Duck("꽥꽥이", 2, 15);
		Sparrow sparrow = new Sparrow("짹짹", 2, 10);
		
		duck.fly();
		duck.sing();
		duck.display();
		
		//
		System.out.println(duck);
		System.out.println(duck.toString());
	}

}
