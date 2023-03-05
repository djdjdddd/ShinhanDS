package com.shinhan.day03;

public class Person {

	// Person 객체가 생성될 때마다 증가시키고 싶으므로 (물론 numberOfPersons++; 를 생성자 블럭 안에 쓰긴 했음)
	private static int numberOfPersons; // 전체 인구수
	// 외부에서 접근하지 못하게끔 private
	
	// 멤버변수에는 : (1)instance변수, (2)static변수 (=클래스 변수, 쉐어 변수)
	// 지역변수는 멤버변수랑 또 다른 거고
	int age; 
	String name;
	
	public Person() { // 기본 생성자
		this(12, "Anonymous"); // '호출'을 통해(책 227) 초기화한 상태
							   // (cf. 생성자를 '호출'할 땐 꼭 첫번째 줄에만 쓸 수 있다. 왜냐면 나중에 배울 super, 부모 등과 관련)
	} 
	
	public Person(int age, String name) { // 매개변수 있는 생성자
		this.age = age;
		this.name = name;
		
		numberOfPersons++;
	}
	
	void selfIntroduce(){ // 생성자와 다르게 함수는 반드시 리턴값이 있어야 하므로 (1)void 또는 (2)데이터타입의 리턴
		System.out.println("내 이름은 " + name + "이며, " + "나이는 " + age + "입니다.");
		// (cf. print 괄호 안에 쉽게 쓰는 법은 엔터 키로 행을 나눠버리면 은근 편하다)
		
	}
	
	int getPopulation(){
		System.out.println();
		
		return numberOfPersons;
	}
	
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person(29, "김용희");
		
		person1.selfIntroduce();
		person2.selfIntroduce();
		System.out.println(person1.getPopulation());
	}
	
}

// class 밖에 main을 쓰려 하니까 안 됐음. 
// 왜냐면 main도 함수니까 class 안에 써야 한다. 

