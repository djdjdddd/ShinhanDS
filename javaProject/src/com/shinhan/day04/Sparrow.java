package com.shinhan.day04;

public class Sparrow {

	String name;
	int legs;
	int length;
	
	// 생성자 : Duck duck = new Duck("꽥꽥이", 2, 15); 이렇게 객체를 만들 거니까 이에 맞춰서~
		Sparrow(String name, int legs, int length){
			this.name = name;
			this.legs = legs;
			this.length = length;
		}
		
		
		// 메서드
		void fly(){
			System.out.println("참새(" + name + ")는 날지 않습니다");
		}
		
		void sing(){
			System.out.println("참새(" + name + ")가 소리 내어 웁니다");
		}
		
		void setName(String name){
			this.name = name;
		}
		
		void display() {
			System.out.println("참새의 이름은 "
					+ name
					+ " 입니다. 다리는 "
					+ legs
					+ "이고 길이는 "
					+ length
					+ "입니다.");
		}
}
