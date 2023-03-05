package com.shinhan.day02;

public class Review {
	public static void main(String[] args) {
		System.out.println("main시작");
		f1(); // 함수 호출 (이 함수를 부르고 다시 돌아와라)
		System.out.println("main끝");
	}

	private static void f1() {
		System.out.println("f1 fuction");
		// 기본형 dataType : byte, short, char, int, long, float, double, boolean
		// => 기능 : 값 저장, 연산, 비교
		
	
		byte v1 = 100;
		int v2;
		// 1. 자동 형변환
		v2 = v1;
		// 2. 강제 형변환...'casting 한다' 라고 함. 
		v1 = (byte)v2;
		
		// 주의) String은 기본형이 아니다 java.lang.String.class 
		// 즉, 클래스이다. 
		String s = "100";
		int v3;
		// Wrapper class : 기본형 dataType + 추가기능
		Integer.parseInt(s); // 이렇게 Integer. 이라고 쓰면 여러 기능이 나온다. 
	}
}
