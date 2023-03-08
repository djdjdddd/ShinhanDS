package com.shinhan.day11;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

// 책 728 예제
public class StreamTest2 {

	public static void main(String[] args) {
		List<Student> data = Arrays.asList( // List로 추가하려면 add 써서 일일이 넣어줘야 하니까
				new Student("홍길동", 10),   
				new Student("신용권", 20),   // 그냥 이렇게 배열 형태로 쓴 다음, asList 메소드로 한꺼번에 List로 바꿔버린
				new Student("유미선", 30)
	);
		IntStream is =
		data.stream().mapToInt(student -> student.getScore());
		System.out.println(is.average().getAsDouble());
		
		// 방법1
		data.forEach(student -> System.out.println(student)); // **forEach() 란
		                                                      // ( ) 안이 Consumer 형태니까 내가 값을 주면(student)
		                                                      // return은 없고, 그냥 내가 준 값을 사용하는(consume하는)
		
		// 방법2 
		double avg = 
		data.stream().mapToInt(student -> student.getScore()) // mapToInt : 중간처리
		.average() // 평균내는 메소드
		.getAsDouble(); // ??? average 메소드의 리턴 타입이 'OptionalDouble'이기 때문에 (double일수도 아닐수도 있어서) 확실하게 double형으로 바꿔주는 메소드인 듯??
	
		
		OptionalDouble opAvg =
		data.stream().mapToInt(student -> student.getScore()).average();
		
		opAvg.ifPresentOrElse(a->{}, ()->{});
		
		
	
	
	}
}
