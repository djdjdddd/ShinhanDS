package com.shinhan.day06;

public interface Resizable2 {

	// public abstract 생략 가능
	void size(int width, int height);
	
	// 만약 인터페이스 내에서 '구현'을 할 거면 -> default, static, private? 등의 메소드를 사용하는 것임.
	// 위와 같은 '추상 메소드'가 아니라
	// default void size(int width, int height){
}
