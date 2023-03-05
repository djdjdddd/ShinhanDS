package com.shinhan.day06;

// 외형변경 인터페이스
// 크기변경, 색상변경 인터페이스를 상속받고 있는
public interface Changeable extends Resizable2, Colorable{

	void setFont(String font);
}
