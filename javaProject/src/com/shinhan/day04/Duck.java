package com.shinhan.day04;

public class Duck {
	
	String name;
	int legs;
	int length;
	
	// 생성자 : Duck duck = new Duck("꽥꽥이", 2, 15); 이렇게 객체를 만들 거니까 이에 맞춰서~
	Duck(String name, int legs, int length){
		this.name = name;
		this.legs = legs;
		this.length = length;
	}
	
	
	// 메서드
	void fly(){
		System.out.println("오리(" + name + ")는 날지 않습니다");
	}
	
	void sing(){
		System.out.println("오리(" + name + ")가 소리 내어 웁니다");
	}
	
	void setName(String name){
		this.name = name;
	}
	
	void display() {
		System.out.println("오리의 이름은 "
				+ name
				+ " 입니다. 다리는 "
				+ legs
				+ "이고 길이는 "
				+ length
				+ "입니다.");
	}


	
	
	// 오버라이드(덮어쓰기, 재정의 : 이미 가지고 있는 기능을 재정의한다.
	// 이름, 매개변수, return 모두 같아야만 '오버라이드' 가능 
	// 단, 접근제한자는 같거나 더 넓어져야 한다. (ppdp : public > protected > 생략(default) > private)
	// toString 도 우클릭으로 쉽게 생성 가능
	@Override
	public String toString() {
		return "Duck [name=" + name + ", legs=" + legs + ", length=" + length + "]";
	}
	
	/* 이건 X (사이트에 나온대로 써야 재정의 가능함) (알캡쳐)
	String toString() {
		return "aaaaaaaaaaaaaa";
	}*/
	
	/* 이건 오버라이드가 아니고 오버로딩임 (왜냐면 매개변수쪽이 다르자너)
	public String toString(int a) {
		return "aaaaaaaaaaaaaa";
	}*/
	

}
