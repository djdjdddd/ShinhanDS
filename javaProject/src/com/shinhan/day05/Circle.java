package com.shinhan.day05;

public class Circle extends Shape{
	
	double radius;
	double circumference;
	
	public Circle(String color, double radius) {
		super(color, "Circle");
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		double Area = radius*radius*Math.PI;
		return Area; // 수학 관련된 건 : Math. (java.lang) 이용하면 된다.
	}

	@Override
	public double calculatePerimeter() {
		double Perimeter = 2*Math.PI*radius;
		return Perimeter;
	}
	
	

}
