package com.shinhan.day07;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Properties;
import java.util.Set;

// 12.4 System 클래스 (책 512)

public class ObjectClass3 {
	
	public static void main(String[] args) throws IOException {
		f5();
		System.out.println("main 끝");
	}

	
	// getProperty()
	private static void f5() {
		
		// getProperty 는 내가 무언갈 입력(" ")해줘야 하므로 쓰기 좀 어려울 수도
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		// 그럴땐 getProperties 를 이용하면 '운영체제와 사용자 정보'를 모두 제공해줌
		Properties ps = System.getProperties(); // **타입이 뭔지 모르겠어? => 커서 올려서 확인하셈
		Set<Object> keys = ps.keySet();
		for(Object key : keys) { // 데이터타입이 Properties인 걸 Object로는 넣을 수가 있더라. (상속에서 배웠던 그 내용)
			System.out.println(key);
		}
	}


	// currentTimeMillis(), nanoTime()
	private static void f4() {
		long startTime = System.nanoTime();
				
		for(int i = 0; i < 1000000000; i++) {
			
		}
		long endTime = System.nanoTime();
		System.out.println("걸린시간: " + (endTime - startTime));
	}


	
	// 명령행매개변수 및 exit메소드(System 클래스의)
	// (cf. 명령행매개변수란 cmd에서 "javac ObjectClass3 OOO, OOO, OOO" 라고 입력했을 때 OOO에 해당하는 놈들)
	private static void f3(String[] arr) {
		if(arr.length == 0) {
			// case 1. 함수빠지기
//			System.out.println("명령행매개변수가 없다.");
//			return;
			
			// case 2. 프로그램 당장 종료하고 싶을 때
			System.exit(0); // 0: 정상종료
		}
		System.out.println("매개변수: " + Arrays.toString(arr));
	}

	private static void f2() throws IOException {
		// 표준입력 (default: 키보드)
		
		// (1) InputStream 은 1바이트씩 읽음.
		InputStream is = System.in; // in은 'InputStream' 타입이라고 뜸. (그래서 옛날에 InputStream, is 이걸 쓴 거구나)
		
		// (2) InputStreamReader 는 2바이트씩 읽음. (**그래서 한글이 깨지지 않음!)
		InputStreamReader ir = new InputStreamReader(is); // 대신 ()안에 매개변수로 저걸 넣어줘야 하는구나
		
		// (1) 이걸로 읽으면 한글이 깨짐
//		int i;
//		while((i = is.read()) != 13) { // 1개씩 읽되, 13(엔터키)를 만나기 전까지 읽어라는 뜻.
//									   // * .read()는 Exception 남(정확히는 IOException. 이건 런타임예외가 아니고 일반예외라서 꼭 처리해주어야 함) 
//			// 숫자가 아니라 '문자'로 읽어주고 싶으니까 (char)로 강제 형변환 해줬음
//			System.out.println((char)i);
//		
//		}         
		
		// (2) is가 아닌 ir 로 읽어주면 한글이 안 깨짐. 
		int i;
		while((i = ir.read()) != 13) { 
			// 숫자가 아니라 '문자'로 읽어주고 싶으니까 (char)로 강제 형변환 해줬음
			System.out.println((char)i);
		}
		
		// (3) 근데 위 2가지 방법이 불편하잖아? => 그래서 Scanner 쓰는게 편함.
		
	}

	private static void f1() {
		
		// System class
		
		// 1. out: 표준출력(모니터출력)
		// 2. err: 에러 내용 출력
		// 3. in: 표준입력(키보드입력)
		PrintStream ps = System.out; // out 위에 커서를 올리니, 'PrintStream' 타입이라고 뜸.
		ps.print(false);
		ps.printf("%10d", 100);
		ps.printf("%-10d", 100);
		ps.println("Hi");
		
		
		
		
	}
	
}
