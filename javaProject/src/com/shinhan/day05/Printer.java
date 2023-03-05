package com.shinhan.day05;

// 문제 16.
//public class Printer {
//	
//	void println(int value){
//		System.out.println(value);
//	}
//	
//	void println(String value){
//		System.out.println(value);
//	}
//	
//	void println(boolean value){
//		System.out.println(value);
//	}
//	
//	void println(double value){
//		System.out.println(value);
//	}
//	
//	public static void main(String[] args) {
//		Printer printer = new Printer();
//		
//		printer.println(10);
//		printer.println(true);
//		printer.println(5.7);
//		printer.println("홍길동");
//	}
//
//}


// 문제 17. Printer 객체를 생성하지 않고도 다음과 같이 호출할 수 있도록 클래스를 수정하시오.
public class Printer {
	
	// 이 필드가 굳이 없어도 되긴 하네?
	int value1 = 10;
	boolean value2 = true;
	double value3 = 5.7;
	String value4 = "홍길동";
	
	static void println(int value1){
		System.out.println(value1);
	}
	
	static void println(boolean value2){
		System.out.println(value2);
	}
	
	static void println(double value3){
		System.out.println(value3);
	}
	
	static void println(String value4){
		System.out.println(value4);
	}
	
	
	public static void main(String[] args) {
//		Printer printer = new Printer();
//		
//		printer.println(10);
//		printer.println(true);
//		printer.println(5.7);
//		printer.println("홍길동");
		
		Printer.println(10); // 나는 지금 이렇게 (객체를 생성하지 않고도) 바로 사용하고 싶다~
			 				 // 어떻게 하면 될까? 예상한 대로 static을 붙이면 될 거 같은데?
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
	}

}
