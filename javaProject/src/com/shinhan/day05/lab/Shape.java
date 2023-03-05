package com.shinhan.day05.lab;

// 쌤 풀이
public abstract class Shape { // 추상 메서드(getArea, getPerimeter)가 존재하므로 abstract를 붙여야~
	
	// 필드
	int numSides;
	
	// 생성자
	// 추상 클래스인데 왜 생성자가 필요할까?? => ★부모 객체가 생성돼야 하므로 (자식 객체를 사용하기 위해선 자동으로 부모 객체도 생성되잖어)
	Shape(int numSides){
		this.numSides = numSides;
	}
	
	
	// 메서드
	int getNumSides(){
		return numSides;
	}

	abstract double getArea(); // 실행결과를 보니 면적이 '실수'로 나왔으니까 double형으로
	
	abstract double getPerimeter();
}
