package com.shinhan.day01;

// class = 변수 + 함수
//VariableTest.java -> 컴파일하면 VariableTest.class 가 되고
// 실행하면
//1. JVM이 VariableTest class Loader에 의해 Load (static이 method영역에 올라간다)
//2. 검증을 한다. 잘못된 게 있는지
//3. 그 다음 main을 시작. 
public class VariableTest {
	int score;

	public static void main(String[] args) { // 자바스크립트, 파이썬과 같은 동적typing 언어?는 그냥 a=10 이라고 쓰면 그때 10이라는 숫자가 a에 대입되는 자유로운?
		//1.변수선언
		int a; // 지역변수(local), 지역변수란 초기화하지 않으면 사용불가. 
		//System.out.println(a); // 초기화하지 않으면 사용불가. 
		//System.out.println(score); // 이건 초기화의 문제가 아니다. static이 붙어 있고 없고의 차이.(어려운 이야긴데 나중에 다시 해주신다고)
		                           // (static이 static 아닌 변수를 쓸 수 없다) static이 non-static 사용불가하기 때문. 
							       // 변수의 scope, 블럭 안에 있으면 사용이 가능한데, static은 또 다른 문제이다. 
		
		//2.변수사용
		a=10; // 할당
		System.out.println(a); 
		System.out.println(a+20);
		
		//3.선언과 동시에 할당(사용)하는 법
		int a2 = 30;
	}

}
