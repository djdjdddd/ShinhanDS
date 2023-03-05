package com.shinhan.day06;

// 직각삼각형
public class RectTriangle extends Shape{
	
	// 필드
	double width;
	double height;
	

	RectTriangle(int numSides) {
		super(numSides);
	}
	
	// 생성자(메서드가 생성자네. 이름 같으니까)
	RectTriangle(double width, double height){ 
		this.width = width;
		this.height = height;
	}
	
		
	
	// 오버라이드
	@Override
	double getArea() {
		double Area = width * height;
		return Area;
	}

	@Override
	double getPerimeter(double width, double height){
		double perimeter = Math.sqrt((width*width) + (height*height));
		return perimeter;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
