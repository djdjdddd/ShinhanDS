package com.shinhan.day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Exception(예외) : 프로그래머가 노력하면 프로그램이 중단되지 않고 계속 진행되도록 할 수 있다.
public class ExceptionTest {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main 시작");
		f6();
		System.out.println("main 끝");
	}
	
	
	
	
	private static void f6() throws ClassNotFoundException {
		Class cls = Class.forName("com.shinhan.day06.Book");
		
		System.out.println(cls.getSimpleName());
	}




	// (2) Exception(일반 예외) : 컴파일 시점에 반드시 '해결'해야 하는 것!
	
	// 방법 1. 내가 해결 (try catch로)
	private static void f3() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("./src/com/shinhan/day06/Book.java"); // " " 안에 읽을 파일이름을 주면 된다.
			                                                   // FileReader() : 파일을 읽는 메소드. (2바이트로)(cf. 한글을 읽으려면 2바이트로 읽어줘야 한다)
			                                                   // FileInputStream() : 얘는 1바이트로
			System.out.println("파일 존재한다... 파일 열림");
			
			// (cf. 파일 읽을 때 쓰는 코드인 듯??)
			int i;
			while((i = fr.read()) != -1) { // (cf. 파일의 끝: '-1') (즉, file의 끝까지 다 읽어라?)
				System.out.print((char)i); // (char)를 쓴 이유는 int형을 char로 바꿔주기 위해.
										   // 
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch(NullPointerException e) {
				e.printStackTrace();
			}
		// 업무 로직은 겨우 new FileReader("src/com/shinhan/day06/Book.java");
		// 이거 한줄인데, 처리하는데 이렇게나 코드가 길어지는 비효율성...
		}
	}
	
	
	// 방법 1-(1). 내가 해결 2
	private static void f4() {
		
		int i;
		// try(){} : try 종료 후 자원자동반납된다.
		try(FileReader fr = new FileReader("./src/com/shinhan/day06/Book.java")){
			 
			System.out.println("파일 존재한다... 파일 열림");
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i); 
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch(NullPointerException e) {
				e.printStackTrace();
			}
		// 업무 로직은 겨우 new FileReader("src/com/shinhan/day06/Book.java");
		// 이거 한줄인데, 처리하는데 이렇게나 코드가 길어지는 비효율성...
		}
	}
	
	// 방법 2. 떠넘기기 (throws)
	// 이 함수를 호출한 곳에 떠넘긴다는 뜻. (Add throws declaration : 선언부에 throws 하는 걸 추가한다)
	private static void f5() throws IOException {
		FileReader fr = new FileReader("./src/com/shinhan/day06/Book.java");
		
		int i;
		while((i = fr.read()) != -1) {
			System.out.print((char)i);
		}
	}
	
	
	
	
	// (1) Runtime Exception(실행 예외)
	private static void f2() {
		try {
			int a = 10;
			int b = 0;
			System.out.println(a/b);
			System.out.println("여기는 안 옴"); // 위에서 오류가 나기 때문에, 여기는 안 옴!
			
		}catch(ArithmeticException ex) { // ArithmeticException 객체를 생성하고 ex라는 변수에 담았음. 
			ex.printStackTrace(); // 오류과정출력
			System.out.println(ex.getMessage()); // .getMessage() 는 어떤 역할?
		
		}catch(ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
			
		// **catch는 하위를 먼저 작성하고, 상위는 나중에 작성한다.
		}catch(Exception ex) { // **물론 예외를 일일이 catch에 써줄 수도 있겠..지만, 
			                   // 그것보단 이렇게 '상위 클래스'인 Exception을 나중에 작성함으로써 
			                   // 위에서 받지 못하는 예외 케이스들은 여기서 catch! 할 수 있도록 코드를 써주면 된다!!
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		
		// finally 파트는 *return문이 있든, catch를 하든, 뭘하든 간에 '무적권 실행'
		}finally {
			System.out.println("이 부분은 반드시 처리함. 주로 자원반납코드를 쓴다. ex) dbdisconnect, fileClose 등");
		}
		
	}

	private static void f1() {
		// 실행예외 : 컴파일시엔 오류 없으나, 실행시 오류가 나는
		// 기타예외 : 컴파일시에 반드시 처리해야 하는 (컴파일 때부터 오류가 나는)
		
		// 실행 오류? 실행 예외? 용어가 헷갈리네
		// 예시들)
		// ArithmeticException
		int a = 10;
		int b = 0;
//		System.out.println(a/b);
		
		// ArrayIndexOutOfBoundsException
		int[] arr = new int[5];
//		System.out.println(arr[5]);
		
		// ClassCastException
		Object obj = new Object(); 
		System.out.println(obj.toString());
		String s = (String)obj; // 원래 Object였는데 String에 담으려는 경우 ('강제 형변환' 되지도 않는 케이스)
//		System.out.println(s.length());
		
		// NumberFormatException
		String su = "100점"; // 100이라는 숫자가 아니라 100점이라는 문자열을 입력해놓고, 그걸 int로 바꾸려고 하는 경우.
		int total = Integer.parseInt(su) + 200;
//		System.out.println(total);
	}

}
