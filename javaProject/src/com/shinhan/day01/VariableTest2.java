package com.shinhan.day01;

public class VariableTest2 {

	public static void main(String[] args) { // JVM은 main만 실행한다. main밖에 모른다. 
		System.out.println("main시작"); // 
		f3(); // 함수 호출 (== 즉, f1라는 함수에 갔다가 돌아온다)
		System.out.println("main 끝~"); //
	}

	private static void f3() {
		short v1 = 32767; // 32767이라는 리터럴만 보면 int형일 수도 있지만, short형 데이터 타입에 대입한 것. 
		char v2 = 'A'; // char 타입은 '' 이렇게 빈 문자도 안 되고, 'AA' 여러 문자도 안 된다.
		               // short을 char에 넣거나, char를 short에 넣을 순 없다. 
			 		   // 왜냐면 둘의 범위가 다르다. short은 -32768~32767이지만, char는 문자라 음수가 없으니 양수로 두배다.
		int v3 = Integer.MAX_VALUE; //2147483647
		System.out.println(v3);
		long v4 = 2147483648L; // L or l 을 뒤에 붙여야 한다. 그래야 long 타입으로. 
		float v5 = 3.14F; // 마찬가지로 F or f 를 뒤에 붙여야. 
		double v6 = 3.14; // 실수의 기본값은 double형, 정수의 기본값은 int형
		
		char v7 = 65;
		char v8 = 0x0041; // 0x 는 16진수를 뜻함. 
		System.out.println(v7);
		System.out.println(v8);
		
		boolean result;
		result = 10 > 20; 
		System.out.println(result);
		
		
	}

	private static void f2() {
		//자바의 dataType : 
		//정수(byte-1바이트, short-2, char-2, int-4, long-8)
		//실수(float-4, double-8)
		//boolean-1 : true와 false의 값을 갖는 데이터 타입
		//00000000
		//01111111 : +127 맨앞은 부호를 나타내는 MSB(0이 +)
		//10000000 : -128
		byte v1=127;
		System.out.println(Integer.toBinaryString(v1));
		v1++;
	}

	private static void f1() {
		int a;
		System.out.println(a=10); // (오른쪽부터) 10을 a에 대입해라.  
		System.out.println(a==10); // == : a와 10이 같냐?
		
	}

}
