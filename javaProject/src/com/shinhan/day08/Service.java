package com.shinhan.day08;

public class Service {
	@PrintAnnotation // ElementType.METHOD 때문에 생긴 @들임
	public void method1() {
		System.out.println("실행 내용1");
	}

	@PrintAnnotation("*") // *를 주면 value에 넣고, 안 주면 디폴트로 -
	                      // 대신 값을 안 준 number = 7, jin = "찐" 의 결과를 얻게 될 거임.
	public void method2() {
		System.out.println("실행 내용2");
	}

	@PrintAnnotation(value = "#", number = 20, jin = "유진" )
	public void method3() {
		System.out.println("실행 내용3");
	}
}
