package com.shinhan.day05;

public class InheritanceTest2 {

	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		Student st1 = new Student("123", "홍길동");
		Student st2 = new Student("124", "박길동", "컴공");
		Student st3 = new Student("1235", "양길동", "화학", 99);
		ExchangeStudent st4 = new ExchangeStudent("126", "은빈", new String[] {"영어", "프랑스"}); 
		// ExchangeStudent에서 만든 생성자에서 맨 뒤 매개변수는 배열의 형태여서 이렇게 썼음. new를 매개변수 사이드에서 하면서 값을 줬다는데 무슨..말?
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
		System.out.println(Student.count + "명");
	}

}
