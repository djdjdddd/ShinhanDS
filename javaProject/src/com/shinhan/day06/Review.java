package com.shinhan.day06;


// 2.28 리뷰 (아침 9시)

/*
1. 변수 : data를 저장하기 위한 '기억장소이름', 값수정가능
2. 상수 : data를 저장하기 위한 '기억장소이름', 값수정불가
3. enum : 상수들의 묶음
4. method : 문장들의 묶음
5. class : object를 만드는 틀 (내용물: 변수, 상수, method 등)
6. object : class로 new한 실체
7. interface : 규격서 (내용물: 상수, 추상 메서드, +@)
 */

// 추상 클래스
abstract class ParentClass{
	abstract void method1();
}

// 규격서
interface MyInterface{
	void method2();
}

interface MyInterface2{
	void method2_1();
}

interface MyInterface3 extends MyInterface, MyInterface2{ // interface는 '다중상속 가능' (클래스와 다른 점)
	void method3_1();
}

// ★이렇게 상속(받거나) 또는 implements(했다면) => 추상메소드를 '반드시 구현'해야 한다. 
class Myclass1 extends ParentClass implements MyInterface3{
	void method1() {}
	public void method2() {}
	@Override
	public void method2_1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method3_1() {
		// TODO Auto-generated method stub
		
	}
}
class Myclass2 extends ParentClass implements MyInterface{
	void method1() {}
	public void method2() {}
}

public class Review {
	
	public static void main(String[] args) {
		
		// ** 이렇게 자식(Myclass1) 타입으로 받기 보단 부모(ParentClass) 타입으로 받아야 
		// 'new 우측에 있는 객체'를 다른 걸로 변경해도 쉽게 변경할 수 있다. 
		// => 이게 바로 '다형성'이라기 보단 interface 등을 사용하는 목적이라고 볼 수 있겠네. (다형성은 메타몽 같은 성질을 의미하는 거고)
		Myclass1 v1 = new Myclass1(); // 따라서 이것 보단
		ParentClass v2 = new Myclass1(); // 이게 바람직
		ParentClass v3 = new Myclass2(); // 그래야 이렇게 new 우측의 객체를 다른 걸로 바꿔도 나중에 무탈하다.
		
		// **이것들 대신 'work()'라는 함수로 바꾸고 싶은데... 과연 매개변수를 어떤 타입으로 해야 할까?
//		v1.method1();
//		v1.method2();
//		v1.method2_1();
//		v1.method3_1();
		work(v2);
		
		
	}
	
	static void work(ParentClass aa) { // ** 따라서 얘도 ParentClass로 받는 게 바람직하겠죠?
		aa.method1();

		if(aa instanceof MyInterface3 my) { // instanceof 연산자
			// MyInterface3 my = (MyInterface3)aa; // ***이 코드를 한방에 쓴 게 위 코드임. 
			my.method2();
			my.method2_1();
		}
		
	}

}
