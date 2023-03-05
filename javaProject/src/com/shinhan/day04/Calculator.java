package com.shinhan.day04;

// 복습 (9시 강의)

// class : object를 만들기 위한 틀, 설계도
// object : class를 이용해서 만들어진 실체(객체, 인스턴스, 오브젝트)
public class Calculator {

	// class 안엔 아래 5가지만 쓸 수 있다.

	// 1. Field(특징, 속성, 변수) : static(클래스 변수), non-static(=인스턴스 변수)
	private String color;
	private int price;
	private String model;

	static String company = "신한"; // ** Calculator란 설계도로 만든 객체 모두 company가 "신한"이란 걸 지정한 셈.

	// 2. 생성자(new할때 자동으로 실행되는 메서드)... compile시 자동으로 default constructor가 제공됨.
	// 생성자는 초기화가 목적
	// 생성자 오버로딩 : 이름은 같고 매개변수 사양은 다름.
	Calculator(String color) {
		// this.color = color;

		this(null, color, 0);
	}

	Calculator(String model, String color) {
		/*
		 * this.model = model; this.color = color;
		 */

		// this : 이 class를 이용해서 만든 '현재 객체'
		// (1) 매개변수와 멤버변수의 충돌 방지
		// (2) 하나의 생성자가 다른 생성자를 호출할 때; 반복되는 코드를 줄이고자 '호출'을 통해 간소화한다.
		this(model, color, 1000);

	}

	Calculator(String model, String color, int price) {
		this.model = model;
		this.color = color;
		this.price = price; // 굳이 this를 쓰는 건 근본없는 변수명을 쓰기 싫으니까..
	}

	// 3. method(일반 메서드)... 동작, 기능
	// 마찬가지로 static, non-static 있음.
	// 함수의 경우 생성자와 달리 반드시 return타입을 써야 한다.
	
	void powerOn() {
		System.out.println(color + "," + model + "모델의 계산의 전원을 켠다");
	}
	
	// 만약 static이 붙어있다면 이 안에서는 this를 쓸 수 없다. 인스턴스 변수도 쓸 수 없다. 그게 클래스니까,,
	// 왜냐면 아직 인스턴스, 객체가 생성된 상태가 아니니까 뭔 this여 (this는 객체를 가리키는 그건데)
	static void powerOn2() {
		System.out.println(this.color + "," + model + "모델의 계산의 전원을 켠다");
	}
	
	// void : return값이 없다.
	void powerOff() {
		System.out.println(color + "," + model + "모델의 계산의 전원을 끈다");
	}

	int add(int a, int b) {

		return a + b;

	}

	int sub(int a, int b) {

		return a - b;

	}
	
	// getter와 setter
	// ** private로 정보 은닉되어있는 멤버변수들을 *읽기하는 기능 만들기 (getter)
	public String getModel(){
		
		return model;
	}
	
	public String getColor(){
		
		return color;
		
	}
	
	//  getter, setter는 앵간하면 public이다. (나중에 자바 외에 다른 ?와 작업을 공유할 때 접근할 수 있어야 하니까) 
	public int getPrice(){
		
		return price;
	}
	
	// ** private로 정보 은닉되어있는 멤버변수들을 **수정하는 기능 만들기 (setter)
	public void setModel(String model){ // 입력값으로 받은 데이터를 바꾸고 싶을 때
		this.model = model;
	}
	
	// 위와 같은 getter와 setter 쉽게 만드는 기능이 있다. 
	// 우클릭 - source - Generate Getter and Setters - 적용하고 싶은 변수에 체크하고 클릭
	
	
	
	
	
	
	
	
	
	
	
	// 4. block (instance, static)
	// (1) instance block : 인스턴스 생성(new)시마다 수행된다. 수행 순서는 생성 전에
	{
		
	}

	// (2) static block : 클래스에 로드될 때 1회 수행된다.
	static {
		System.out.println("1");
	}
	
	static {
		System.out.println("2");
	}
	
	// 5. inner class (클래스 내에 있는 클래스를 의미) : 지금 예시에선 Calculator 클래스 안에 AA라는 클래스가 있는 거죠.
	class AA{
		
	}
}
