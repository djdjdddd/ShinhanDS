package com.shinhan.day03;

public class Computer {
	
	// 아래에 컴퓨터의 속성을 썼음. 
	String model2;
	String os2;
	int price2;
	
	// JavaBeans기술 규격서(필수는X) : field는 private (정보은닉)
	// 즉, 외부에서 클래스의 변수를 바꾸지 못하게 설정하는 것. (private은 동일 패키지 내에서도 못 바꾸는 어쩌고 저쩌고)
	private String model;
	private String os;
	private int price;
	
	// 변수엔 2가지가 있다. instance변수와 static변수(=class변수)
	// static이 안 붙어 있으면 인스턴스 변수다
	int count2; // 이와 같은 인스턴스 변수는 new할 때마다 생성된다.
	
	static count; // 스태틱 변수는 클래스 변수다. 
	
	
	// public의 의미 
	// Computer(){} : 이렇게 퍼블릭이 없으면 다른 패키지에서는 이 패키지에 있는 이 클래스를 사용하지 X
	// public Computer() {} // 퍼블릭이 있으므로 다른 패키지에서도 접근 가능.
	
	
	
	
	// Overloading(오버로딩)의 뜻 : 아주 쉬움. 그냥 이름 같은 애(생성자)가 아래처럼 여러개 있다. 
	// 생성자 오버로딩 : 즉, 생성자 이름은 같고(Computer로) 개수는 여러개다. 
	// (cf. 이름이 같은 대신 매개변수 개수가 달라야 한다더라고? 같으면 에러난대)
	
	// ★오버로딩이 되니까 => 하나의 생성자가 다른 모양의 생성자를 호출할 수 있다. (코드 간소화)
	public Computer() {
		this("AA모델", "Mac", 500);
	}
	
	public Computer(String model) {
		this(model, null, 0);
	}
	
	public Computer(String os, int price) {
		this(null, os, price); 
	}
	
	public Computer(String model, String os, int price) {
		System.out.println("arg 3개짜리 생성자로 생성하였음");
		this.model = model;
		this.os = os; 
		this.price = price; 
	}
	
	// 일반 메서드
	public void ComputerInfoPrint() { // (1) 단순히 컴퓨터 정보를 알려주는 메서드를 만듦.
		System.out.println("model" + model);
		System.out.println("os" + os);
		System.out.println("price" + price);
		count++;
	}
	
	public String getModel() { // (2) 이번에는 모델명을 리턴하는 메서드를 만듦. (리턴 타입은 String)
		
		return model;
	}
	
	public String getos() {
		
		return os;
	}
	
	public int getPrice() { // (4) 가격은 리턴 타입이 int형으로 만들었구나~
		
		return price;
	}
	
}
