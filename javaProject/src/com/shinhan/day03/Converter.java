package com.shinhan.day03;

public class Converter {
	public static void main(String[] args) {
		System.out.println("문자열에 특정문자 변경하는 테스");
		System.out.println("-------------Sample 1 --------------");
		String str1=myReplace("hello world",'l','*'); // l을 *으로 바꾼다
		System.out.println(str1);
		
		System.out.println("-------------Sample 2 --------------");
		String str2=myReplace("hello world",' ','-'); // 공백을 -로
		System.out.println(str2);
		
		System.out.println("-------------Sample 3 --------------");
		String str3=myReplace("hello world",'a','*'); // a를 *로
		System.out.println(str3);
		

	}
	
	// 함수란? : 문장들의 묶음 (여기선 main, myReplace)
	//          괄호 ( ) 가 돼있으면 함수
	// 함수 생성 이유 : 재사용하기 위해. 모듈화 해서 깔끔하게 하기 위해.
	public static String myReplace(String str, char oldChar, char newChar){
		// 이 부분을 구현하시오.

		// 쌤
		String result = "";
		
		for(int i=0; i < str.length(); i++) { // ★문자열의 0번째, 1번째, 2번째, ... str.length 전까지 반복하겠다
			if((str.charAt(i)) == oldChar){ // str.charAt(i) : string을 char 형태인 i로?? 바꾸겠다.
				result += newChar; // result에 신규문자인 newChar를... +=를 왜 쓴거지? 
			}else {
				result += oldChar; // ??
			}
		}
		
		return result; 
				
				
			 
	}
}


