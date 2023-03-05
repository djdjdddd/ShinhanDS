package com.shinhan.day07;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 12.10 정규 표현식 클래스

public class ObjectTest5 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		f6();
	}

	// 리소스 경로 얻기
	private static void f6() throws IOException {
		
		// 어제 배운 것 중에 file을 읽는 방법으로
		// 1. FileReader(2바이트씩 읽기) 가 있었음. (FileInputStream(1바이트씩 읽기) 도 있었고)
		FileReader fr = new FileReader("src/com/shinhan/day07/Computer"); // 파일의 경로를 찍을 땐 이렇게 찍어줘야 한다. /로
		
		int i;
		while((i = fr.read()) != -1) {
			System.out.println((char)i);
		}
		
		// 오늘 배울 내용 (책 552)
		// 2. getResource() 와 getResourceAsStream()
		URL url = ObjectTest5.class.getResource("Computer.class"); 
		System.out.println(url.getPath());  
		
		// (1) 이렇게 경로를 얻고
		InputStream is = ObjectTest5.class.getResourceAsStream("Computer.class");
		
		// (2) 파일을 읽어주고 
		int j;
		while((j = is.read()) != -1) {
			System.out.print((char)j);  // .java가 아니라 .class(=바이트코드) 파일을 읽는 거다. 
		}
		is.close();
	}

	// 12.11 리플렉션
	private static void f5() throws ClassNotFoundException {
		
		// 클래스의 정보를 아는 방법은 3가지가 있다.
		// 1, 2 : 클래스로부터 얻는 방법
		// 3 : 객체로부터 얻는 방법
		
		// 1. 클래스이름.class
		Class cls1 = Computer.class;
		
		// 2. Class.forName(" ")
		Class cls2 = Class.forName("com.shinhan.day07.Computer");
		
		// 3. 객체가 있다면, 객체를 생성해서 .getClass
		Computer com = new Computer("AA");
		Class cls3 = com.getClass();
		
		
//		Constructor[] constructors = cls1.getDeclaredConstructor();
//		for(Constructor con : constructors) {
//			System.out.println(con.getModifiers());
//		}
		
		// 이번엔 클래스가 아니라 멤버 정보 얻는 방법 中 필드 (그냥 책 보고 아 이런게 있구나 하자)
		Field[] fs = cls1.getFields();
		for(Field f : fs) {
			System.out.println(f.getName()); // .getName : (필드의) 이름이 뭔지 알려주는
		}
		
	}

	private static void f4() {
		
		// 만약 daum naver gmail 이쪽 부분만 따로 그룹핑 해주고 싶다면
		// (괄호)를 이용해라!!
		String p1 = "([A-Za-z0-9]+)@(\\w+)\\.\\w+";  // ( )로 싸주고 (=그룹핑 해주고)
		String data = "연락처1: wed0406@daum.net 연락2: aaa@naver.com 연락처3: bbbbb@gmail.com";
	
		Pattern pattern = Pattern.compile(p1);
		Matcher matcher = pattern.matcher(data);
		while (matcher.find()) {
			System.out.println(matcher.group());
			System.out.println(matcher.group(1)); // 그룹 1만 
			System.out.println(matcher.group(2)); // 그룹 2만
			
		}
	}

	private static void f3() {
		String p1 = "010-[0-9]{3,4}-\\d{4}";
		String data = "010-1233-5789 이곳으로 연락바람 010-3424-3225 혹은 010-3292-9984";

		// **내가 정한 패턴에 일치하는 문자열을 찾는 코드
		Pattern pattern = Pattern.compile(p1);
		Matcher matcher = pattern.matcher(data);
		while (matcher.find()) {
			System.out.println(matcher.group()); // 그냥 보고 싶어서 출력한 거고
		}
	}

	private static void f2() {
		String p1 = "[A-Za-z0-9]+@\\w+\\.\\w+"; // + : 1개 이상, \. : . , \w : [A-Za-z0-9]와 동일

		String data = "wed0406@daum.net";

		// Pattern 클래스의 matches 라는 메소드를 이용하여
		// Pattern.matches("정규식", "검증할 문자열");
		boolean result = Pattern.matches(p1, data);
		System.out.println(result ? "OK" : "NO");
	}

	private static void f1() {
		String p1 = "010-[0-9]{3,4}-\\d{4}"; // 무조건 010 이면서 / 0~9까지 숫자이면서 3~4자릿수 / \d: 1개의 숫자(0~9를 의미)
												// (cf. 다만 \ 를 쓸 거면 한번 더 써줘야 한다고 하더라고)
		String data = "010-1234-5678";
		boolean result = Pattern.matches(p1, data); // 첫번째가 regex(기준?), 두번째가 input(입력값)
		System.out.println(result ? "OK" : "NO");
	}

}
