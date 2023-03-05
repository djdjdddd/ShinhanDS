package com.shinhan.day05;

// 추상 클래스 : 추상 메서드가 1개 이상 있는 클래스!
//           : 직접 객체생성불가 (ex. new Shape() X)
//           : 이 추상 클래스를 상속받은 자식 클래스를 이용해서 객체생성가능
public abstract class Shape {

	private String color;
	private String type;
	
	public Shape() {}
	
	public Shape(String color, String type)
	{
		this.color = color;
		this.type = type;
	}
	
	public String getColor()
	{
		return color;
	}
	public String getType()
	{
		return type;
	}
	
	// 추상 메서드 : 정의는 있으나, 구현{}은 없는.
	//           : 대신 '상속받은 자식 클래스'에서 '반드시 구현해야' 한다! (= override 의무)
	public abstract double calculateArea();
	
	public abstract double calculatePerimeter();
	
	public String toString()
	{
		return color + " " + type;
	}
	
}

