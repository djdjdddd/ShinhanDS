package com.shinhan.day05.lab;

public class Rectangle extends Shape implements Resizable{
	
	// 필드
	double width;
	double height;

	// 에러) 생성자 만들라고 함. (★왜냐면 부모클래스에 기본생성자 정의 안되어있어서)
	Rectangle(double width, double height) { 
		super(4); 
		this.width = width;
		this.height = height;
	}

	
	// ★오늘 배운 내용
	// 에러) '추상 클래스'를 상속받았으므로 '추상 메서드'를 '오버라이드'할 의무가 생김
	@Override
	double getArea() {
		return width * height;
	}

	@Override
	double getPerimeter() {
		
		return 2 * (width + height);
	}
	
	


	@Override
	public void resize(double s) {
		this.width = width * s;
		this.height = height * s;
	}

}
