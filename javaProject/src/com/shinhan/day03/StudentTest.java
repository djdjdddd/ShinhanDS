package com.shinhan.day03;

public class StudentTest {

	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		Student student1 = new Student(); // Student 클래스를 이용해서 student1 라는 변수에 Student 라는 객체를 생성, instance화 (student1, student2 각각이 인스턴스!)
		Student student2 = new Student("임채희", "5678", "WEB", 200); // ★아예 처음부터 입력값을 주면서 객체를 생성하는 방식이 좀 더 낫대.
		                                                            // 위 student1 처럼 아무 입력값이 없으면 여러모로 골치 아프니까 (?)
		
		student1.name = "김용희";
		student1.stdId = "1234";
		student1.subject = "자바";
		student1.score = 100;
		
		display(student1); // 1번째학생(student1 함수)을 보여줘라(display 함수)해라
	}
	private static void display(Student std) {
		System.out.println(std.name);
		System.out.println(std.stdId);
		System.out.println(std.subject);
		System.out.println(std.score);
		
		
	}
}
