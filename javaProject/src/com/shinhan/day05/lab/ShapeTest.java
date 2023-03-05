package com.shinhan.day05.lab;

// ShapeTest 클래스를 작성하여 위에서 작성한 클래스를 테스트 하십시오.
public class ShapeTest {

	public static void main(String[] args) {
		
		new Rectangle(5, 6);
		new RectTriangle(6, 2);
		
		// 위의 2개 객체를 배열에 추가합니다.
		Shape[] s = new Shape[2];
		s[0] = new Rectangle(5, 6);
		s[1] = new RectTriangle(6, 2);
		
		// 순환문을 사용해서 배열에 들어있는 각 쉐잎의 area와 perimeter를 출력.
		for(Shape ss : s) {
			System.out.println("area : " + ss.getArea());
			System.out.println("perimeter : " + ss.getPerimeter());
			
			// 만일 해당 Shape가 Resizable하다면, 0.5만큼 resize한 후 새로운 area와 perimeter를 출력
			if(ss instanceof Resizable re) {
				re.resize(0.5);
				System.out.println("area : " + ss.getArea());
				System.out.println("perimeter : " + ss.getPerimeter());
			}
		}
		
		
		
	}

}
