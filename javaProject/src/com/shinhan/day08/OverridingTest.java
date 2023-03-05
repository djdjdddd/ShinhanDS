package com.shinhan.day08;

public class OverridingTest {
	
	public static void main(String[] args) {
		
	
    int i = 10;
    int j = 20;
    
    MySum ms1 = new MySum(i, j);
    MySum ms2 = new MySum(i, j);
    String s = "30";
    System.out.println(ms1); // 30
    System.out.println(ms2.toString()); // 30

    if(ms1.equals(ms2)) {
        System.out.println("ms1과 ms2의 합계는 동일합니다.");
}

	/* 조건1 Object의 toString은 주소를 문자로 return */

	/* 조건2 Object의 equals는 주소를 비교 */

	}

//	조건1:
//
//	main 메소드에서
//	MySum 객체를
//	출력하면 
//객체
//	생성시에 전달한
//	두 정수의
//	덧셈 결과를
//	출력하도록 
//toString
//	메소드를 오버라이딩합니다.
//
//	예)
//	MySum ms1 = new MySum(i, j);System.out.println(ms1);
//
//	호출시에 출력값은
//	i와 j의
//	산술 연산
//	덧셈 결과입니다.(참고:
//	String.valueOf 메소드는
//	int를 String으로 변경합니다)
//
//	조건2:
//	main 메소드에서
//	MySum 클래스의
//	equals 메소드
//	호출시 
//전달하는
//	매개변수가 MySum
//	객체를 참조하고
//	현재 객체의
//toString 메소드와
//	전달 객체의
//	toString 메소드
//	내용이 동일하면
//true를 리턴하고
//	나머지 경우에는 false
//	를 리턴하도록
//equals 메소드를 오버라이딩합니다.
//
//	예)
//	MySum ms1 = new MySum(i, j);
//	MySum ms2 = new MySum(j, i);
//	String s1 = new String("30");ms1.equals(ms2)
//	호출 결과는 true입니다.ms1.equals(s1)
//	호출 결과는 false입니다.
//
//	<출력결과>
//
//	30 30
//	ms1과 ms2의
//	합계는 동일합니다.
//	ms1과 s1의
//	값은 동일하지 않습니다.
//	}
}
}