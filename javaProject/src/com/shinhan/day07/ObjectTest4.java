package com.shinhan.day07;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;


// 12.5 문자열 클래스 (책 519)

public class ObjectTest4 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		f15();
	}

		
	// SimpleDateFormat
	private static void f15() {
		Date d1 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd hh::mm:ss");
		String result = sdf.format(d1);
		System.out.println(result);
		System.out.println(d1);
	}


	// DecimalFormat
	private static void f14() {
		DecimalFormat df = new DecimalFormat("###,###");
		long money = 1000000000000000000L;
		String result = df.format(money);
		System.out.println(result);
	}


	// 12.8 날짜와 시간 클래스
	private static void f13() {
		
		// Date
		Date d1 = new Date(); // .sql보단 .util을 많이 쓴다고 함
		System.out.println(d1);
		System.out.println(d1.getTime());
		
		// Calender (*책 참조)
		Calendar cal = Calendar.getInstance(); // Calendar는 정적 메소드인 getInstance()를 사용하면 Calendar 하위 객체를 얻을 수 있다고 함.
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1); // 월은 0을 기본값으로 둬서 그런가 1을 더해줘야 값이 맞대
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		// 단, Date와 Calendar 클래스로는 시간과 날짜를 '조작'할 수 X
		
		// LocalDateTime (날짜를 조작하고 싶다면 java.time 패키지의 LocalDateTime 클래스를 이용하자)
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		System.out.println(dt.getYear());
		System.out.println(dt.getMonthValue());
	}


	// 12.7 Math 클래스 (책 528)
	private static void f12() {
	
		// 최대값을 구해보자
		// 1. for문 이용
		int a = 10;
		int b = 20;
		int max;
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
		// 2. Math 클래스 이용
		max = Math.max(a, b);
		
		// 올림, 내림, 반올림
		double c = 3.499999999999999999999999;
		System.out.println(Math.ceil(c));
		System.out.println(Math.floor(c));
		System.out.println(Math.round(c));
		
		
		
	}



	private static void f11() {
		Integer a = 10;
		Integer b = 10;
		
		System.out.println(a == b); // **어차피 (자동으로?) 언박싱되기 때문에 == 으로 값을 비교해도 true의 결과가 나오게 됨.  
		System.out.println(a.intValue() == b.intValue());
	}



	private static void f10() {
		// 다음의 문자열에서 숫자들만 추출하여 출력해라
		String s = "이것이자바다 12345 This is 6789 Java 55";
		
		char[] arr = s.toCharArray(); // 1. 먼저 toCharArray라는 함수를 이용해서 배열의 형태로 만들어 버렸고
		StringBuilder result = new StringBuilder();
//		String result = "";  // 이렇게 하는게 가장 간단한 방법이지만. 앞서 배운대로 메모리 낭비가 심하므로 StringBuilder를 사용해봤음. 
		
		for(char ch : arr) { 
			if(Character.isDigit(ch)) { // 2. for문과 
										// 3. Character라는 Wrapper 클래스에 있는 isDigit 함수를 이용해서 문자에서 숫자만 추출하였음.
				result.append(ch);
			}
		}
		System.out.println(result);
		
	}


	// Character
	private static void f9() {
		String s = "이것이자바다 This is java";
		
		System.out.println(s.substring(0, 1)); // 0부터 1까지 짤라내겠다는 뜻의 함수
		
		System.out.println(s.charAt(0)); // 문자열의 0번째를 ???? 함수
		
		char[] arr = s.toCharArray(); // 아래와 같은 향상된 for를 쓰고 싶으면 이렇게 '배열의 형태로 만들어줘야' 한다.
		for(char ch : arr) { // 향상된 for
			if(Character.isUpperCase(ch)) { // Character 라는 Wrapper class를 사용해서 
				System.out.println(ch + "---대문자");
			}else { // 대문자 아니냐?
				System.out.println(ch + "---대문자 아님");
				
			}
		}
	}


	private static void f8() {
		String score = "100";
		int score2 = Integer.parseInt(score);
		System.out.println(score2 + 200);
		
		int su = 10;
		System.out.println(Integer.toBinaryString(su)); // int타입 값을 2진수로 바꿔주는 함수
		
		System.out.println(Integer.bitCount(su)); // ?? 이거 뭐임?
	}


	// 12.6 Wrapper 클래스 (포장 클래스)
	private static void f7() {
		
		int a=10; // 기본형(용도: 값저장, 연산, 비교)
		Integer b=20; // 참조형(용도: 기본형 + '기능')
		// 이와 같은 걸 '박싱(Boxing)'
		
		System.out.println(a+b+200); // '언박싱(Unboxing)': 객체에서 기본타입 값을 얻는
		// 객체에 넣었지만 그냥 연산됨. (편하게)
		
		
		int su = Integer.compare(10, 5); // < = > 이렇게 3개로 비교하는데 (<이면 -1, =이면 0, >이면 1)
		System.out.println(su); // 그래서 값이 1이 나오는 중.
		
		int[] arr = {10,90,20,700,30};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}


	private static void f6() {
		LocalDateTime dt = LocalDateTime.now(); // 기본생성자가 없어서 new가 아니라 그냥 class 이름으로 부르고 그 안에 메소드 사용한 거임.
//		System.out.println(dt);
//		System.out.println(dt.toString());
		
		// (1) split 이용
		String str1 = dt.toString(); // 먼저 문자열 타입으로 바꿔주고
		String[] arr = str1.split("T"); // 1) T를 기준으로 문자열을 분리해주고, 2) 그 값을 arr이라는 배열에 대입
		for(String a : arr) {
			System.out.println(a);
		}
		
		// (2) StringTokenizer 이용
		StringTokenizer str2 = new StringTokenizer(str1, "T");
		while(str2.hasMoreElements()) {
			System.out.println(str2.nextToken());
		}
		
	}


	// 3. StringTokenizer 클래스 (이전에 배웠던 split 처럼 '문자열을 구분자로 분리'해주는)
	private static void f3() {
		
		// 문자열이 구분자로 연결되어 있을 경우, 구분자를 기준으로 문자열을 분리할 때 사용
		
		// (1) split() 이용
		String friuts = "사과,오렌지/키위 수박,참외";
		String[] arr = friuts.split(",|/| "); // , 또는 / 또는 공백 을 ~~하겠다?? (**복습)
		for(String f : arr) {
			System.out.println(f);
		}
		
		// (2) StringTokenizer 사용
		StringTokenizer st = new StringTokenizer(friuts, ",/ "); // 마찬가지로 , / 공백 으로 하겠다는 뜻임
		while(st.hasMoreElements()) { // hasMoreTokens() : 남아 있는 문자열이 있는지 여부 (***nextToken 사용 전에 has이걸 먼저 사용하는 게 좋은 방법이다. 그래야 예외가 발생 안한다)
			System.out.println(st.nextToken()); // nextToken() : 문자열을 하나씩 가져옴 
		}
	}


	// 2. StringBuilder 클래스 ★
	private static void f2() {
		String s1 = "자바"; // String은 '고정'문자열이기 때문에..
		System.out.println(s1 + "프로그램"); // 이런다고 해서
		s1 = s1 + "프로그램"; // 이런다고 해서 (심지어 이건 새로운 객체를 만들기 때문에 메모리 낭비가 된다! *책 참조)
		System.out.println(s1); // s1 = "자바" 인 것은 바뀌지 X 
		
		// 따라서 StringBuilder 클래스의 메소드를 사용하는 게 바람직하다.
		StringBuilder sb = new StringBuilder("자바StringBuilder");
		StringBuffer sf = new StringBuffer("자바StringBuffer");
		
		// append : 문자열을 끝에 추가 (sb = sb + "프로그램"; 에 해당하는 코드)
		sb.append("프로그램");
		sf.append("프로그램");
		System.out.println(sb);
		System.out.println(sf);
		
		// insert : 문자열을 지정 위치에 추가
		sb.insert(1, "인서트");
		System.out.println(sb);
		
		// delete
	}


	// 1. String 클래스
	private static void f1() throws UnsupportedEncodingException {
		String s1 = "자바"; // 이게 가장 일반적인 방법. (String 객체 생성하는)
		String s2 = new String("자바"); // 당연히 new를 통해서도 가능하고
		
		// 프로그램을 개발하다 보면 byte배열을 문자열로 변환하는 경우가 종종 있다. 
		// 이때 String 객체 생성하는 방법으론 2가지가 있다~
		byte[] arr1 = new byte[] {65,66,67,97,98,99};
		char[] arr2 = new char[] {'A', 'B', 'C','a','b','c'};
		String s3 = new String(arr1);
		String s4 = new String(arr2);
		System.out.println(s1+s2+s3+s4);
		String s5 = new String(arr1, "utf-8"); // 한글 1글자를 => UTF-8로 인코딩하면 3바이트가 되고, EUC-KR로 인코딩하면 2바이트가 된다. 
		System.out.println(s5);
		
		// 한글 인코딩 방법
		byte[] arr3 = s1.getBytes("utf-8"); // 한글 1글자 => 3바이트
		byte[] arr4 = s1.getBytes("euc-kr"); // 한글 1글자 => 2바이트
		
		System.out.println(Arrays.toString(arr3)); // 배열의 값을 String으로 출력하는 방법: Arrays.toString()
	}

}
