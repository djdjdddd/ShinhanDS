package com.shinhan.day04;

public class Employee {
	
	// 필드 (private, 외부에서 접근 못하게 막아놓은 상태)
	private String name;
	private String title;
	private int baseSalary;
	private int totalSalary;
	
	
	// 생성자
	/* public Employee(String name, String title, int baseSalary) {
	 3개의 매개변수를 차례대로 같은 이름의 멤버변수 값으로 초기화하는 문장 정의
	} */

	
	// ** 생성자도 자동으로 만드는 기능 : 우클릭 - source - Generate Constructor using Fields - 마찬가지로 원하는 변수만 체크!
	public Employee(String name, String title, int baseSalary) { // new할 때 이름, 직급, 기본급은 ?? 하겠다?
		this.name = name; 
		this.title = title; // **** 만약 ' this.name = name + "님"; ' 이렇게 문자열을 바꿔버리면 주소가 바뀌니까..
		this.baseSalary = baseSalary;
		getTotalSalary(); // ***
	}
	
	
	// 메서드
	// 3-1
	public void getTotalSalary() {
		if(title == "부장") { // **** title == "부장님" 해봐야 매칭X => title.equals("부장님") 을 써야 매칭된다. 이걸 주의해라!
			totalSalary = (int) (baseSalary + baseSalary * 0.25); // 이거 타입 변환 뭘로 고르는게 맞을까? 이 문제에선 상관없으려나?
		}else if(title == "과장"){
			totalSalary = (int) (baseSalary + baseSalary * 0.15);
		}else {
			totalSalary = (int) (baseSalary + baseSalary * 0.05); // 타입 변환 연산자 (int) 쓰면서 괄호 잘못 씌워서 연산 틀렸다. 젠장
		}
	}
	
	// 3-2
	public void print() { // TIP. (1) 미리 문장을 다 쓰고, (2) 아래처럼 엔터키로 나눠서 쓰면 훨씬 편하네
		System.out.println(title
				+ " 직급의"
				+ name
				+ " 씨의 본봉은 "
				+ baseSalary
				+ "원이고 총급여는 "
				+ totalSalary
				+ " 원입니다.");
	}

}
