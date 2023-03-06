package com.shinhan.day08;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest {

	public static void main(String[] args) {
		f1();
	}
	
	
	
	private static void f4() {
		Car[] arr = {new Car("A", 5000), new Car("B", 52000), new Car("D", 503244300), new Car("C", 951000)};
		
		Arrays.sort(arr); // 마찬가지로 그냥 실행하면 분류 X
		
		print(arr);
	}

	private static void print(Car car[]) {
		for(Car c : car) {
			System.out.println(c);
		}
	}


	

	// 분류 
	private static void f3() {
		Money[] arr = {new Money(10), new Money(5), new Money(7), new Money(1), new Money(3) };
		System.out.println("sort하기 전: " + Arrays.toString(arr));
		
		Arrays.sort(arr); // **(Money 객체를 생성한 것이므로 Money 클래스에) Comparable 란 인터페이스를 구현하지 않으면 수행불가.
		                  // **왜냐면 (1)뭘 비교하고 : amount를 비교 
		                  //         (2)어떻게 비교할지 : amount - this.amount (작은 놈이 알아서 앞으로 오게 분류된다)
		                  // 에 대한 내용이 전혀 설정이 안돼있기 때문에. 
		
						  // => 따라서 Money 클래스에서 "class Money implements Comparable" 해줘야 함. 
		                  // => 그리고 compareTo 메소드를 오버라이드 해줘야 함. (무엇을? 어떻게? 비교를 할지에 대한 내용을 재정의)
		
		
		System.out.println("sort한 후: " + Arrays.toString(arr));
		
		// 마찬가지로 '익명 객체' 이용해서 Desc(오름차순) 해보자
		Arrays.sort(arr, new Comparator<Money>() { // 1. 이렇게 'new 인터페이스명<비교할 타입>' 형태로 써주고

			// 2. 재정의 해주기
			@Override
			public int compare(Money o1, Money o2) {
				return (o2.amount - o1.amount); // 3. Money라는 객체에 있는 amount 값을 비교해봤음. 
			} 
			
		});
		
		System.out.println("익명객체 이용하여 Desc으로 재정의한 경우: " + Arrays.toString(arr));
		
	}
	
	
	
	

	private static void f2() {
		
		// ASCII code(아스키 코드) : 'A' 65, 'a' 97 (소문자가 더 뒤에 있다 순서상)
		String[] arr = new String[] {"Spring", "Java", "JSP", "html", "CSS", "react"};
		System.out.println("sort하기 전: " + Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		
		System.out.println("sort한 후: " + Arrays.toString(arr));
				
		// *익명 구현 클래스를 만들어서 비교하는 방법을 배워보자. (괜히 귀찮게 DecendingInteger 클래스 만들었던 것처럼 하지 말고)
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			}); // *여기에 괄호가 닫힌 걸 보니 '익명 객체' 만든 거 맞네! 
		System.out.println("Descending한 후: " + Arrays.toString(arr));
		
		
	}

	
	
	
	
	private static void f1() {
		int[] arr = new int[] {100,30,80,20,99};
		System.out.println("sort하기 전: " + Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("sort한 후: " + Arrays.toString(arr));
	}

}
