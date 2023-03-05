package com.shinhan.day06;

public abstract class Shape {
	
	// 필드
	int numSides;
	
	// 생성자
	Shape(){} // ** 기본 생성자도 만들어주는 게 좋은가?
	
	Shape(int numSides){ // 문제에서 만들라는 형태의 생성자
		
	}
	
	// 메서드
	void getNumSides(){
		
	}
	
	abstract double getArea();
	
	abstract double getPerimeter();

	
	
	
}
