package com.shinhan.day06;

// 직사각형
public class Rectangle extends Shape implements Resizable{
	
	// 필드
	double width;
	double height;
	
	Rectangle(int numSides) {
		super(numSides);
		
	}
	
	double Rectangle(double width, double height){
		double perimeter = 2*(width + height);
		return perimeter;
	}

	// 인터페이스로부터
	@Override
	public void resize(double s) {
		this.width = width * s;
		this.height = height * s;
	}

	// 추상 클래스로부터
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
