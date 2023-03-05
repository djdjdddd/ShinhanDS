package com.shinhan.day05;

public class Rectangle extends Shape{
	
	int width;
	int height;

	// 생성자
	public Rectangle(String color, int width, int height) {
		super(color, "Rectangle"); // 부모 클래스의 생성자는 (String color, String type) 이렇게 돼있어서
		                           // type을 모르니까 그냥 "Rectangle"이라고 그냥 넣은 것. 
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		double Area = width*height;
		return Area;
	}

	@Override
	public double calculatePerimeter() {
		double Perimeter = 2*(width+height);
		return Perimeter;
	}

}
