package com.shinhan.day03;

/*[문제2]
임의의 문자열(String str)과 구분자(char separator)를 입력 받아 
str에 포함된 구분자를 기준으로 str을 문자열 배열로 만들어 반환하는 기능의 split() 메소드를 작성하세요.
(cf. 구분자(separator) : , 같은 놈들)

<<수행결과>>
배열 크기 : 4
서울시 강남구 역삼동 삼성SDS멀티캠퍼스

<<참고 및 주의사항>>
- String 클래스의 split() 메소드를 사용하지 말고 직접 구현해야 합니다.
- main 메소드의 내용은 채점하지 않으므로 테스트 목적으로 수정할 수 있습니다.
- 주어진 메소드의 signature는 변경하지 않습니다.*/


// class : object를 만드는 틀 (붕어빵 틀, 설계도), 여기선 Spliting이라는 클래스가 있음.
// object : class를 이용해서 만든 독립된 객체, 즉 instance(실체)라 부른다.

public class Spliting{
	public static void main(String[] args) {
//		Spliting p = new Spliting(); // Spliting이라는 객체를 새로 만들어서 p라는 변수에 대입했다.
									 // 이러면 stack영역에 p가 생기고, heap영역에 Spliting이라는 객체가 생겼다?
		
		// 어제 배운 내용 복습 중 split과 for-each문
		String addr = "서울시,강남구,역삼동,삼성SDS멀티캠퍼스";
		String[] arr = addr.split(",");
		for(String s : arr) {
			System.out.println(s);

			//		String[] addrArr = p.split(addr, ',');
//		System.out.println("배열 크기 : " + addrArr.length);
//		for(int i=0; i<addrArr.length; i++){
//			System.out.print(addrArr[i] + " ");
		}		
	}

	public String[] split(String str, char separator){ // 얘는 static이 안 붙어 있다.
													   // static인 애가 non-static을 부를 수 없다. 
													   // 해결방법(1) : static을 붙이면 된다.
	}
}

