package com.shinhan.day04;

// Date란 클래스를 쓰려 하니까, 이클립스에서 아래와 같은 걸 추천하였음.
import java.util.Date;

import com.shinhan.day03.Car;

// 패키지 (책 256)
// 패키지 : 같은 이름의 클래스를 구분해주기 위해 있음.
public class PackageTest {

	public static void main(String[] args) {
		
		// 
		// (1) Date란 클래스를 쓴 경우 : 근데 'java.util' 이라는 패키지에 있는 Date란 클래스를 쓴 경우
		// import 해서 쓴 케이스
		Date d1 = new Date();
		System.out.println(d1);
		
		// (2) Date란 클래스를 쓴 경우 : 근데 'java.sql' 이라는 패키지에 있는 Date를 쓴 경우
		// ★그냥 Date라고 적으면 내가 import한 java.util 의 Date를 쓰게 된다.
		// ★따라서 '다른 패키지에 있는 놈을 쓰고 싶으면' 아래처럼 '패키지의 이름'을 써주면 된다?? (책 참조)
		java.sql.Date d2 = new java.sql.Date(2023-1900, 2, 24); // (cf. 가운데 줄 그어진 건 : Deprecated, 이전 버전에선 이렇게 썼는데 최신 버전에선 굳이 이렇게 안 쓴다는 걸 알려주는 기능)
		java.sql.Date d3 = new java.sql.Date(d1.getTime());
		System.out.println(d2);
		System.out.println(d3);
		
		BookVO b1 = new BookVO("자바다", 10000);
		com.shinhan.day05.BookVO b2 = new com.shinhan.day05.BookVO("자바다2", 5000);
		
//		String s1 = new String("자바");
//		System.out.println(s1);
		
		// 마찬가지로 Car라는 클래스를 쓰려 하니까 import 하라고 추천함.
//		Car c1 = new Car();
//		System.out.println(c1);
		
		
	}

}
