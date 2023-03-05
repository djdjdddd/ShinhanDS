package com.shinhan.day08;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

class Container<T, M>{
	T key;
	M value;
	
	
	// ***** 3. 그래서 생성자가 필요했던 거고 (arg 2개짜리)
	public <K, V> Container(K key2, V value2) {	}

	void set(T t, M m){
		
	}
	
	T getKey(){
		return key;
	}
	
	M getValue(){
		return value;
	}
	
	// 
//	String get(){
//		return kind;
//	}
}


public class ContainerExmaple<K, V> {
	
	// **makeContainer()라는 함수를 정의해보시오.
	// (힌트: GenericTest의 Boxing 예제와 같은 것.)
	// 이런 걸 보고 '제네릭 메소드'라고 부르는구나??
	private static <K, V> Container<K, V> makeContainer(K key, V value){
		
		// ***** 2. 이렇게 한번 거쳐서, 돌아서 하는 방법에 대해 가르쳐주신 듯
		return new Container<K, V>(key, value); // ***** 그래서 여기에 값을 넣어줬나보다. (마치 this.key = key 목적으로)
	}

	public static void main(String[] args) {
		                                       // ***** 1. new 하는 행위를
		Container<String, String> container1 = makeContainer("홍", "길동"); // **new Container<>(); 가 아니라 makeContainer(); 로 만들 수 있게끔 
		container1.set("홍길동", "도적");
		String nam1 = container1.getKey();
		String job = container1.getValue();
		
		Container<String, Integer> container2 = makeContainer("박", 100);
		container2.set("홍길동", 6);
		String name2 = container2.getKey();
		int age = container2.getValue();
	}
	
//	// 제네릭 메소드
//			// 1. 만약 이렇게 입력값 타입이 여러개가 있다 치면
//			// ★★★'결정되지 않은 타입(T)'이 각각 String, Integer로 선언된 케이스구나 이게
//			HappyBox<String> box1 = Boxing("입력값을 써주면"); // **main에서는 ( ) 안에 입력값을 주니까 보통
//			HappyBox<Integer> box2 = Boxing(5000);
//			System.out.println(box1);
//			
//			// 제네릭 메소드
//			// 2. 아래의 제네릭 메소드는 자신의 타입에 맞는 놈을 딱 골라서 (호출하고 어쩌고)를 한다는 뜻인 듯??
//			private static <T> HappyBox<T> Boxing(T kind) { // **여기선 매개변수를 써주고 (입력값을 받을)
//				
//				return new HappyBox<>(kind, 10);
//			
//			
//			}

}
