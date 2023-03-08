package com.shinhan.day11;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.shinhan.day09.Account;

public class LambdaTest3 {

	public static void main(String[] args) {
		f8();
	}

	
	// 16.6 생성자 참조
	private static void f8() {
		
		// 이렇게 만드는 것을
		BiFunction<String, String, Account> func1 = (no, owner) -> {
			return new Account(no, owner);
		};
		Account acc = func1.apply("1234", "kim");
		System.out.println(acc);
		
		
		// ::로 쉽게 생성자 만들 수 있다. 
		BiFunction<String, String, Account> func2 = Account::new;
				
	}


	// 16.5 메소드 참조 (책 706)
	private static void f6() {
		
		// (1) 아까 배운 Function 이용한 경우
		BiFunction<Integer, Integer, Integer> func1 = (a,b) ->{
			if(a>b) return a;
			return b;
		};
		int result = func1.apply(10, 20);
		System.out.println("큰값: " + result);
		
		
		// (2) 책, Math 쓴 경우
		BiFunction<Integer, Integer, Integer> func2 = (a,b) -> Math.max(a, b);
		int result2 = func2.apply(10, 20);
		System.out.println("큰값: " + result2);
		
		
		// (3) 책, '메소드 참조'를 통해 더 간단한 방법을 써보자
		BiFunction<Integer, Integer, Integer> func3 = Math :: max; // (a,b) -> {} 의 형태가 아니라
		int result3 = func3.apply(10, 20);                         // 이렇게 :: 를 이용해서 더 간단하게 나타낼 수도 있다~
		System.out.println("큰값: " + result3);
		
		
	}
	


	// 5. Predicate
	private static void f5() {
		Predicate<Integer> func1 = (a) -> a > 10;
		
		boolean result = func1.test(7);
		System.out.println(result);
		
		
		// 이번엔 Account를 조사해보자.
		Predicate<Account> func2 = (a) -> {
			System.out.println("--------Account의 잔고 조사하기---------"); 
			System.out.println(a);
			return a.getBalance() >= 100;
		};
		boolean result2 = func2.test(new Account("1234", "Hong", 1000));
		System.out.println(result2);
		
	}


	// 4. Operator
	private static void f4() {
		BinaryOperator<Integer> func1 = (a,b) -> a+b;
		BinaryOperator<Integer> func2 = (a,b) -> a-b;
		
		Integer i = func1.apply(100, 50);
		Integer j = func2.apply(100, 50);
		
		System.out.println(i);
		System.out.println(j);
	}


	// 3. function
	private static void f3() {
		// 3. 내가 주는 것도 있고 (a), (a,b) 등 ->    받는 것도 있을 때 쓴다고 함. 
		// 즉, 매개값이 있고 return하는 경우
		
		Function<String, Account> func1 = (a) -> new Account(a, null, 100); // 문장 하나라 return도 {}도 생략?
		Account acc1 = func1.apply("뭘 준다는 거지?");
		
		BiFunction<String, String, Account> func2 = (accNo, owner) -> {
			System.out.println("계좌번호: " + accNo);
			System.out.println("예금주: " + owner);
			return new Account(accNo, owner, 100);
		};
		Account acc2 = func2.apply("110405", "용");
		
		
		System.out.println(acc1);
		System.out.println(acc2);
		
	}


	// 2. Supplier (얘로부터 내가 공급 받는 건가?)
	private static void f2() {
		
		// 2. 이렇게 내가 주는 건 없고 ()      ->      받고 싶은 것만 있을 땐 쓴다고 하는데?
		Supplier<String> a = () -> "자바";
		Supplier<String> b = () -> {
			System.out.println("-----");
			return "자바2";
		};
		
		// 내가 공급(리턴??) 받을 놈을 ret라는 변수에 담아줬음. (*get 메소드를 이용해서 공급을 받았음)
		String ret1 = a.get();
		String ret2 = b.get();
		
		// 공급 받고 출력해봤음. 
		System.out.println(ret1);
		System.out.println(ret2);
		
		
	}


	// 1. Consumer (얘를 소비한다? 소비할 내용물을 넣어준다?) 사용 예제 (java.util.function)
	private static void f1() {
		
		// 1. 내가 주고 싶을 때 (a), (a,b) 등   ->     받고 싶은 건 없을 때?
		
		// 이런 식으로 '소비'(Consumer)하겠다고 설정해주고
		Consumer<Integer> f = (a) -> System.out.println(a+200);
		Consumer<String> f2 = (a) -> System.out.println(a+200);
		Consumer<Account> f4 = (a) -> {
			System.out.println(a);
			a.deposit(1000);
			int result = a.withdraw(500);
			System.out.println(result + " 출금 완료");
		};
		// accept 메소드를 사용해주는 방식 (*accept 메소드를 이용해서 소비해줬음)
		f.accept(100);
		f2.accept("100");
		f4.accept(new Account());
		
		// BiConsumer : 2개 타입을 주고 싶을 때 사용
		BiConsumer<String, Integer> f3 = (a,b) -> {
			System.out.println("a= " + a);
			System.out.println("b= " + b);
		};
		f3.accept("내가준 문자", 1246545);
		
	}

}
