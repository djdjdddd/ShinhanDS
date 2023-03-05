package com.shinhan.day05.lab;

public class RectTriangle extends Shape {
	
	// 필드
	double width;
	double height;

	// 에러) 생성자 만들라고 함. (★왜냐면 부모클래스에 기본생성자 정의 안되어있어서)
	RectTriangle(double width, double height) { 
		super(3); // 어차피 삼각형이니까 'int numSides' 대신 '숫자 3'을 넣어도 무방.
		this.width = width;
		this.height = height;
	}

	
	// ★오늘 배운 내용
	// 에러) '추상 클래스'를 상속받았으므로 '추상 메서드'를 '오버라이드'할 의무가 생김
	@Override
	double getArea() {
		return width * height / 2;
	}

	@Override
	double getPerimeter() {
		// 루트(x^2 + y^2) => 영어로 sqrt (square root)
		return Math.sqrt(width*width + height*height);
	}

}
