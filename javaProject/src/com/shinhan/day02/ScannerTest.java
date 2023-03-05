package com.shinhan.day02;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws IOException {
		f2();
	}

	private static void f2() {
		Scanner sc = new Scanner(System.in); // Scanner도 import를 해야 한다. (java.util.Scanner)
		int score = sc.nextInt(); // nextInt : 숫자를 읽고
		String name = sc.next(); // next : 문자를 읽는
		System.out.println("점수>>");
		
	}

	private static void f1() throws IOException {
		System.out.println("f1 function");
		System.out.println("점수입력>>");
		
		// 사용자 입력 받기
		InputStream is = System.in; // java.lang 패키지에 없는 클래스는 import를 해야 한다. 
				
		int i; 
		while((i = is.read()) != 13 ) {
			System.out.println((char)i);
		
	}

}
}
