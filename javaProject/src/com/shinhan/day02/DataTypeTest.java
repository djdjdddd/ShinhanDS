package com.shinhan.day02;

public class DataTypeTest{

	public static void main(String s[]){
	   
	int tom = -1;
		char marry = '9';
		//boolean john ;  //주의 : 지역변수는 초기화를 시켜야 사용할 수 있으니까
		boolean john = false; // 이렇게 초기화를 시켜야 한다!
		String sarah = "Sarah Jang";
		System.out.println( "our friends..\n" 
			+ -1 + ", " + marry + ", " + john + " and " + sarah);
	 } // main 끝
} // class 끝

//[클래스 실행결과]
//our friends..
//-1, 9, false and Sarah Jang

