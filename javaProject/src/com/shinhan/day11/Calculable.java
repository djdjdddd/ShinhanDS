package com.shinhan.day11;

// 함수형 표현... 람다식... 람다표현식으로 표현 가능한가?? => @FuntionalInterface
// 인터페이스에 단 하나의 추상메소드를 가져야 한다. 
@FunctionalInterface
public interface Calculable {
	
	// 추상 메소드 정의
	void calculate(int a, int b);

}
