package com.shinhan.day03;

// class = 변수 + 메서드
public class Student {

	// class 안엔 아래 5가지만 쓸 수 있다.

	// 1. field (변수, 속성, 특징)
	// 2. Constructor(생성자 메서드) ... 필수는 X ... Compile시에 자동으로 default 생성자가 제공되거든.
	// 3. 일반 메서드 (행위)
	// 4. block (instance block - 생성시(new)마다 수행, static block - loade시 1회 수행)
	// 5. inner class (클래스 안에 클래스가 들어간)

	int a = 1; // 이렇게 변수(field)를 쓰는 건 가능하지만

	/*
	 * 아래와 같은 문장을 쓰는 건 안 된다! 
	 * system.out.println("문장은 클래스 안에 쓸 수 없다. 함수 안에 써야지");
	 * 
	 * 문장을 쓸 거면 위의 4. block 을 이용하면 된다. 
	 * (1) new할 때마다 수행할 거야? => instance block
	 * (2) 처음에 load할 때 1회 수행? => static block 
	 * 
	 * static block을 많이 쓴다. 
	 * ★왜냐면 처음에 문장을 쓰고 싶은 경우에 많이 씀. 근데 클래스 안엔 일반 문장을 못 쓰자너. 
	 * 그래서 쓸 거면 static block을 이용해서 쓴다~
	 */

	// 1. field (변수, 속성, 특징)
	String name;
	String stdId;
	String subject;
	int score;
	
	// 2. Constructor(생성자 메서드) ... 필수는 X ... Compile시에 자동으로 default 생성자가 제공되거든.
	Student(){} // default 생성자 정의방법
	
	// 단, 생성자가 정의되면 default 생성자가 만들어지지 않는다.
	// 생성자의 Overloading ... 이름은 같고 매개변수 사양이 다르다. (기본 생성자는 매개변수 없고, 내가 만든 생성자는 매개변수가 4개로 사양이 다르다는 뜻)
	Student(String name, String stdId, String subject, int score){
		
		/* ★현재 아래의 상황은 : 우측의 매개변수(argument)와 좌측의 멤버변수(field)가 충돌남.
		// 그래서 구별이 필요하다. 
		name = name; // 임채희를 받아서 name에다가 넣고
		stdId = stdId; // 5678을 받아서 stdId에 넣고
		subject = subject; //
		score = score; */
		
		// ★this를 쓰자 : 이 클래스로 만든 현재 객체를 this라고 한다.
		this.name = name; // 임채희를 받아서 name에다가 넣고
		this.stdId = stdId; // 5678을 받아서 stdId에 넣고
		this.subject = subject; //
		this.score = score; //
	}
	
	
		
	// 3. 일반 메서드 (행위)
	// 4. block (instance block - 생성시(new)마다 수행, static block - loade시 1회 수행)
	{
		System.out.println("instance block입니다.");
	}
	static {
		System.out.println("static block입니다.");
	}
	// 5. inner class (클래스 안에 클래스가 들어간)
}
