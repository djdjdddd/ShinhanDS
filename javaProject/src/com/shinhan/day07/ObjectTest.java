package com.shinhan.day07;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Car { // extends Object가 생략돼있음.
	private String model;
	private int price;

	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
	
	// toString 재정의
	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}

	// (1) 내가 직접 override한 hashCode 메소드
//	// (책 500 그림) 해시코드도 비교해주는 메소드를 override 해보자. 
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return model.hashCode() + price; // 그냥 model의 해쉬코드에 price를 더한 아주 단순한 return 값을 줘봤음. (지식이 짧아서..)
//	}
	
	// (2) 이클립스에서 제공하는 기능을 이용한 hashCode 메소드
	// (책 500 그림)
	// 동등비교 (예, HashSet은 중복불가) => hashCode() 도 같고, equals() 도 같아야 같은 객체로 판별하는
	// 이렇게 hashCode 도 우클릭으로 쉽게 만들 수 있다. (위에 toString 처럼)
	@Override
	public int hashCode() {
		return Objects.hash(model, price); // **model과 price 변수 2개가 모두 같으면 동등한 객체로 본다는 의미임. 
										   // 만약 model만 같아도 동등한 객체로 본다면 => 선택할 때 price는 체크해제 해주면 되겠죠?
	}
	
	
	
}

public class ObjectTest {

	public static void main(String[] args) {
//		f1();
//		f2();
//		f3();
//		f4();
		f5();
//		f6();
	}
	
	private static void f6() {
		// Set : 순서없음. 중복허용X (주머니라고 생각하셈) (List는 순서가 있는 반면)
		Set<String> data = new HashSet();
//		data.add(100); // *이렇게 여러개 타입이 (주머니에) 들어가게 되면 나중에 골치 아프다.
		data.add("월"); // *그래서 쓰는 게 바로 generics <>
		data.add("화"); 
		data.add("수"); 
		data.add("월"); 
		data.add("월"); 
		
		for(String s : data) {
			System.out.println(s); // 출력하면 월, 화, 수 만 나온다. (중복을 허용 안 하니까)
			System.out.println(s.hashCode());
		}
	
	}

	private static void f5() {
		
		Car obj4 = new Car("D", 100);
		Car obj5 = new Car("E", 100);
		Car obj6 = new Car("F", 100);
		
		Set<Car> data = new HashSet<Car>();
		data.add(new Car("A", 100));
		data.add(new Car("A", 100));
		data.add(new Car("B", 100));
		data.add(obj4);
		data.add(obj5);
		data.add(obj6);
		
		for(Car s : data) {
			System.out.println(s);
			System.out.println(s.hashCode());

		}
		// 이렇게 한 뒤 출력을 하면 *분명 중복을 허용X 라고 했는데, 값이 똑같은 것들도 중복해서 나온다.
		// 왜 그럴까?
		// 이럴 때 쓰는게 바로 (책 500 그림) 해시코드 비교
		// 내용은 같아도, 해시코드가 다른 케이스.??
		
	}

	private static void f4() {
		Car obj1 = new Car(null, 0);
		obj1.setModel("A모델"); obj1.setPrice(100);
		Car obj2 = new Car(null, 0);
		obj1.setModel("A모델"); obj1.setPrice(100);
		
		System.out.println(obj1 == obj2? "주소같다" : "주소다르다"); 
		System.out.println(obj1.equals(obj2)? "주소같다" : "주소다르다"); 
		// **Car의 (extends Object니까) .equals 메소드는 String, Date와 다르게 Object의 .equals를 쓸테니까 내용이 아닌 주소를 비교하는 메소드인 것!!
		
		// 근데 .equals 를 **재정의 해주면 내 입맛대로 바꿔 쓸 수 있는 거임.  

	}

	// 3. Date를 보자 (2개가 있는데, 주로 .util 꺼를 많이 쓴다고 함 .sql보다)
		private static void f3() {
			Date obj1 = new Date();
			Date obj2 = new Date();
			
			System.out.println(System.identityHashCode(obj1));
			System.out.println(System.identityHashCode(obj2));
			
			System.out.println(obj1 == obj2? "주소같다" : "주소다르다"); // (1) == : 기본형이었다면 '값'을 비교하겠지만, 객체(참조형)의 경우 주소를 비교함.
			System.out.println(obj1.equals(obj2)? "내용같다" : "내용다르다"); // (2) Date equals() : 내용 비교로 *재정의됐음. (API 사이트를 보니까, 캡쳐)
		}
	
	// 2. String을 보자
	private static void f2() {
		String obj1 = new String();
		String obj2 = new String();
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		
		System.out.println(obj1 == obj2? "주소같다" : "주소다르다"); // (1) == : 기본형이었다면 '값'을 비교하겠지만, 객체(참조형)의 경우 주소를 비교함.
		System.out.println(obj1.equals(obj2)? "내용같다" : "내용다르다"); // (2) String equals() : 내용 비교로 *재정의됐음. (원래는 주소를 비교하는 메소드였다가)

	}
	
	// 1. Object를 먼저 보면
	private static void f1() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		
		System.out.println(obj1 == obj2? "주소같다" : "주소다르다"); // (1) == : 기본형이었다면 '값'을 비교하겠지만, 객체(참조형)의 경우 주소를 비교함.
		System.out.println(obj1.equals(obj2)? "주소같다" : "주소다르다"); // (2) Object equals() : 주소를 비교
	
	
	
	
	}
}



