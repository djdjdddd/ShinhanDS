package com.shinhan.day06;

// 9.7 익명객체
public class Book implements Colorable{

	// 2. 그에 필요한 필드 써주고
	String title;
	String foregroundColor;
	String backgroundColor;
	
	
	// 1. override 의무 이행해주고
	@Override
	public void setForeground(String color) {
		foregroundColor = color;
		System.out.println("Book의 Foreground변경: " + color);
	}

	@Override
	public void setBackground(String color) {
		backgroundColor = color;
		System.out.println("Book의 background변경: " + color);
	}

}
