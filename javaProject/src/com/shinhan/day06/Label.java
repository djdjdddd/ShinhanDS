package com.shinhan.day06;

public class Label implements Changeable{

	// 2. 변수 선언이 필요하더라~
	int width;
	int height;
	String color;
	String font;
	
	String text;
	
	// 생성자 선언
	public Label(String name, int width, int height, String color, String font) {
		
	}
	
	
	// 1. 이렇게 implements함에 따라 필요한 '구현' 파트를 먼저 써보니
	@Override
	public void size(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setForefround(String color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBackground(String color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFont(String font) {
		// TODO Auto-generated method stub
		
	}

}
