package com.shinhan.day01;

public class StringTest {

	public static void main(String[] args) {
		f8(); // 함수(메소드) 호출
		
	}

	private static void f8() {
		// ppt 14pg
		int a = 10;
		float b = 20.5F;
		System.out.println("a=" + a + ", b=" + b); // 근데 사실 이렇게 많이 쓴다. 
		
		System.out.printf("!a=%-5d, !!b=%f", a, b);
		// %-5d 에서 : -는 왼쪽정렬, d는 decimal
		// %3.1f 에서 : 전체자리수.소수아래자리수 float        
	}

	private static void f7() {
		int a = 100;
		{
			int b = 200; 
			System.out.println(a+b); 
		}
		// System.out.println(a+b); // 블럭 안에서 선언된 변수 b가 블럭 밖에서 쓰일 순 X
		// block을 벗어나면 변수 사용불가. 
	}

	private static void f6() {
		// String 타입 변환하기
		// 자바 기본타입 : 8개!! (byte, short, char, int, long, float, double, boolena)
		// 자바 기본타입의 목적 : 데이터 저장, 연산, 비교
		
		// Wrapper Class : 자바기본타입에 + '기능(함수)' 을 추가함.
		// => Byte, Short, Character, Integer, Long, Float, Double, Boolean
		String score = "100";
		System.out.println(score + 10); // 문자 + 숫자 => 문자가 됨. 
		System.out.println(Integer.parseInt(score) + 10); // 문자열을 숫자(or 기본타입)로 바꿔라 (ppt 12pg 참조)
		
		int i = 100;
		String str = String.valueOf(i); // 반대로 기본타입을 문자열로 바꿀 때 (ppt 12pg)
		String str2 = i + ""; // 잔머리 (위의 String.valueOf() 와 같은 결과)
		System.out.println(i);
	}

	private static void f5() {
		// 연산식에서 int 타입의 자동 변환
		byte v1 = 10;
		byte v2 = 20;
		//byte v3 = v1 + v2; // 정수 타입 변수가 산술 연산식에서 피연산자로 사용되면 int 타입보다 작은 byte, short 타입 변수는 int 타입으로 자동 변환되어 연산 수행

		byte v4 = (byte)(v1 + v2);
		int v5 = v1 + v2;
		System.out.println(v4);
		System.out.println(v5);
	}

	private static void f4() {
		// 강제 형변환... but data손실가능성
		// 작은방 = 큰값
		// 변환 방법 : 작은방 = (작은방 타입)큰값
		byte v1;
		int v3 = 130;
		v1 = (byte)v3;
		System.out.println(v1); // 이렇게 되면 값이 뒤로 돌아온다. 128, 129, 130이니까 -128, -127, -126 이렇게.
	}

	private static void f3() {
		// **자동 형변환
		// 큰방 = 작은값 (작은 값을 큰방에 넣는 건 자동으로 변환)
		// byte-1 < short, char < int < long < float < double
		// boolean-1
		byte v1 = 127;
		short v2 = v1;
		//char v3 = v1; // X (왜냐면 char는 음수가 없는데, byte를 넣으려고 하니까 안 되는 것)
		int v3 = v1;
		long v4 = v1;
		float v5 = v1;
		double v6 = v1;
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(v2);
		System.out.println(v3);
		
		
		
	}

	private static void f2() {
		// \n : new line
		// \t : tab
		// \" : "
		String str1 = "자바 \n '프로그램' \t 완\\성"; //큰따옴표 안에 작은따옴표는 ㄱㅊ은데
		String str2 = "자바 \"프로그램\" 완성"; //큰따옴표를 쓰려면 따로 처리(따옴표 앞에 역슬래쉬)를 해줘야"
		String str3 = "{\"name\":홍, \"age\":20}"; //json(제이슨) : 자바스크립트 형태의 문자열
		String str4 = """ 
				{"name":"홍", "age":20}
				"""; // 자바17부터 " 3개짜리를 지원한다. 
		System.out.println(str1);
		System.out.println(str3);
		System.out.println(str4);
	}

	private static void f1() {
		// java.base 라는 모듈 안에 java.lang 라는 패키지 안에 String.class 
		// String은 사실 기본형이 아니고!! 
		// java.lang 라는 패키지 안에 있는 String이라는 클래스다
		
		// String : ★고정문자열
		String s1 = "자바"; // 이렇게 쓰면 > 컴파일 시점에 .class의 상수pool에 "자바"를 집어넣는 것. 
		String s2 = "자바"; // 이미 상수pool에 만들어졌으므로 이 둘은 서로 주소가 같다. 
		String s3 = new String("자바"); // (new에 의해) 실행시 만들어진다. 
		String s4 = new String("자바");
		
		// 진짜로 s1과 s2의 주소(해쉬코드)가 같은지 알아보자. 
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		// 처음엔 같았다가
		
		s1 = s1 + "프로그램"; // 문자열을 +로 서로 붙이는 건 좋은 습관이 아니다. 
		s2 = s2 + "프로그램"; // 왜냐면 그래버리면 주소가 다 달라져서 메모리 낭비가 심하다나 어쩐다나
		// 데스크탑은 큰 문제가 없겠지만, 모바일 환경에서는 꽤나 중요하다고. 
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		// 이렇게 하니 달라졌다. 
		
		// dangling
		
	}

}
