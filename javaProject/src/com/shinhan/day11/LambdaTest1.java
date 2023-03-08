package com.shinhan.day11;

public class LambdaTest1 {

	public static void main(String[] args) {
		
		f4();
		
		
	}
	
	
	// (책 703) 매개변수가 있는 람다식 예제
	private static void f4() {
		Person p1 = new Person(); // action이란 함수가 static이 아니라서 먼저 객체 생성부터 해주었음.
		
		
		// (1) 인터페이스 익명객체 이용한 경우
		p1.action(new Workable() {
			@Override
			public void work(String name, String job) {
				System.out.println("이름은 " + name);
				System.out.println("직업은 " + job);
			}
		});
		
		
		// (2) 람다 표현식 이용한 경우
		p1.action( (a,b) -> {
			System.out.println("이름은 " + a);
			System.out.println("직업은 " + b);
		});
		
		
		// (3) 람다 표현식 이용해서 이렇게도 쓸 수 있다. 
		Workable w = (a,b) -> {
			System.out.println("이름은 " + a); 
			System.out.println("직업은 " + b); // a. 람다식을 변수 w(Workable 타입)에 넣고
		};
		p1.action(w); // b. 그 w를 실행하는 방법도 된다는 거네. 
		
		
		Speakable speakable = s -> s + " 여기가 추가됐습니다";
		p1.action2(speakable);
		
	}
	
	

	private static void work(Runnable r) { // ** 이번엔 Runnable r 를 매개변수인 work라는 함수를 만들어서
		// **여기서 스레드를 실행해주고
		Thread t1 = new Thread(r);
		t1.start();
		
	}

	
	private static void f3() {
		// 스레드에서 배운 Runnable 인터페이스도 '함수형 인터페이스'라서 람다표현식 가능
		Runnable r = () -> {};
		
		// **예전엔 여기서 스레드를 만들었는데
//		Thread t1 = new Thread(r);
//		t1.start();
		
		// **마지막으로 work를 실행해주기까지
		work(() -> {System.out.println("A1");});
		work(() -> {System.out.println("A2");});
		work(() -> {System.out.println("A3");});
	}

	private static void f2() {
		
		Calculable f3 = (a,b) -> {
			System.out.println("람다 표현식");
			System.out.println("곱하기: " + (a*b));
		};
		action(f3);
		
		
		
		action((a,b) -> {
			int result = a + b;
			System.out.println(result);
		});
		
	}

	private static void action(Calculable cal) {
		int a = 10; // 1) 데이터를 제공하고
		int b = 4; 
		cal.calculate(a, b); // 2) 추상메소드를 호출
	}

	private static void f1() {
		// 1. 구현 class 이용 (MyClassImplement로 만들어줬음)
		MyInterface a = new MyClassImplement();
		a.print();
		
		
		// 2. 익명 구현 class 이용
		// (1) 변수에 줘도 되고 => *여러번 사용 가능
		MyInterface b = new MyInterface() {
			@Override
			public void print() {
				System.out.println("MyInterface 인터페이스를 익명 객체로 만들어서 실행한 경우");
			}
		};
		b.print();
		
		// (2) 괄호 크게 싸서 통짜로 써도 되고
		(new MyInterface() {
			@Override
			public void print() {
				System.out.println("MyInterface 인터페이스를 익명 객체로 만들어서 실행한 경우");
			}
		}).print();
		
		
		// 3. 람다식 이용 (JS에선 화살표함수라고 부름)
//		() -> System.out.println("람다식으로 익명 객체로 만들어서 실행한 경우");
		MyInterface c = () -> System.out.println("람다식으로 익명 객체로 만들어서 실행한 경우");
		c.print();
		
		
		
	}

}
