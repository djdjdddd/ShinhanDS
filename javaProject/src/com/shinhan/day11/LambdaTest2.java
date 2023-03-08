package com.shinhan.day11;

public class LambdaTest2 {

	public static void main(String[] args) {
		f1(100);
		
	}

	
	// 옛날 ppt 자료
	
	// **람다식도 객체, 클래스이므로 => 지역변수 사용에 유의!!
	private static void f1(int su1) { // *지역변수 (마찬가지로 매개변수도 지역변수)
		
		int su2 = 200; // *지역변수 (왜냐면 함수 안에 있는 변수니까)
		int su3 = 300;
		su3++; // **이렇게 내부 class에서 사용하지 않은 지역변수들은 final 특성 가지지 X
		
		
		// 1. 람다식도 내부class다.
		Calculable2 f = (x,y) -> {
				System.out.println("람다표현식");
				
//				su1++; (변경불가)
				// **Local variable su1 defined in an enclosing scope must be final or effectively final
				// **내부 class에서 지역변수 사용한다면 final의 특성을 갖는다. (따라서 수정불가)
				
				return x+y+su1+su2;
			};
		
		int result = f.calculate(1, 2);
		
		System.out.println(result);
		
		
	}

}
