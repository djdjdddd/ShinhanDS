package com.shinhan.day02;

public class OperatorTest {

	public static void main(String[] args) {
		method7();
	}

	private static void method7() {
		// 3.11 삼항 연산자 (굉장히 많이 쓴다)
		int a = 70;
		if(a>10) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		// 간단한 조건문은 삼항 연산자를 쓰면 편하다. 
		System.out.println(a>10? "합격" : "불합격");
		// 콘솔에 찍는 게 아니라 단순히 변수에 넣고 싶다면
		String result = a>10? "합격" : "불합격"; // 이렇게 써도 된다. 
		
		
	}

	private static void method6() {
		int a  = 10;
		a++;
		++a;
		a = a+1; // 
		a += 1; // 위 아래 서로 같은 의미. 
		
	}

	private static void method4() {
		// or : ||
		int a = 10;
		int b = 20;
		// || (단축) : 앞의 결과가 참이면 뒷부분 수행 안함.
		// | : 무조건 끝까지 수행
		boolean result1 = a > 10 || ++b == 20;
		boolean result2 = a > 10 | ++b == 20;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(b); 
		
	}

	private static void method3() {
		int a = 10;
		int b = 20;
		boolean result = a > 10 && ++b == 20;
		System.out.println(result);
		System.out.println(b); 
		// &&(단축) : 앞의 결과가 거짓이면 뒷부분 수행 안함.
		
		// & : 앞의 결과 상관없이 무조건 끝까지 수행시킴.
		int c = 10;
		int d = 20;
		boolean result2 = c > 10 & ++d == 20;
		System.out.println(result2);
		System.out.println(d);
	}

	private static void method2() {
		// 3.5 나눗셈 연산 후 NaN과 Infinity 처리
		
		int a = 10;
		int b = 0; // (1) 정수는 0으로 나눌 수 없다. (RuntimeException 중 ArithmeticException이라는 예외가 발생한다)
		// 이런 예외를 RuntimeException이라 하는데, 컴파일시에는 오류 없으나 실행시에 오류가 나는!
	
		
		// (2) 실수는 정수처럼 예외가 발생하는 게 아니라 계산결과가 Infinity or NaN이 된다. 
		double d = 0.0;
		// System.out.println(a/b);
		System.out.println(Double.isInfinite(a/d));
		if(Double.isInfinite(a/d)) {
			System.out.println("계산불가");
		}else {
			System.out.println(a/d);
		}
		System.out.println(a/d); // 
		System.out.println("method end");
	}

	private static void method1() {
		int a = 10;
		int b = 5;
		a++;
		++a;
		
		System.out.println(++a); // 증가 후 사용한다.
		System.out.println(a++); // 사용 후 증가한다. 
		System.out.println(a);
		
		System.out.println("더하기:" + a+b); // 그냥 하면 앞쪽의 +(연결)가 먼저 되서 더하기:14 가 문자가 돼버린다.
		System.out.println("더하기:" + (a+b));
		System.out.println("빼기:" + (a-b)); // 반면, 문자는 빼기(-)가 없음. 마찬가지로 괄호 안하면 에러남
		System.out.println("곱하기:" + a*b);
		System.out.println("몫:" + a/b);
		System.out.println("나머지:" + a%b);
	}

}
