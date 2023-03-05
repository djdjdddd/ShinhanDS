package com.shinhan.day06;

// 9.7 익명객체
public class Cup implements Colorable{

	// 2. 그에 필요한 필드 써주고
	int size; // 책의 제목이었다면, 컵은 사이즈라는 변수를 줘보자.
	String foregroundColor;
	String backgroundColor;
	
	
	// 1. override 의무 이행해주고
	@Override
	public void setForeground(String color) {
		foregroundColor = color;
		System.out.println("Cup의 Foreground변경: " + color);
	}

	@Override
	public void setBackground(String color) {
		backgroundColor = color;
		System.out.println("Cup의 background변경: " + color);
	}

}
