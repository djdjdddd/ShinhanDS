package com.shinhan.day08;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) throws Exception {
		Method[] declaredMethods = Service.class.getDeclaredMethods(); // 지금 선언된 메소드가 뭐뭐 있는지 물어보는 메소드
		for (Method method : declaredMethods) {
			//PrintAnnotation 얻기
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class); // method.getAnnotation : 메소드의 어노테이션이 있으면 얻어라! (입력값은 PrintAnnotation.class 의 형태로)
			System.out.println("[메서드이름]" + method.getName());
			
			System.out.println(printAnnotation.number()); // 
			System.out.println(printAnnotation.value());
			System.out.println(printAnnotation.jin());
			
			//설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
			
			//메소드 호출
			method.invoke(new Service()); // method.invoke : (new Service 해서 그 안에 있는) 메소드들을 호출하는 함수
			
			//설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
		}
	}

	public static void printLine(PrintAnnotation printAnnotation) {
		if (printAnnotation != null) {
//number 속성값 얻기
			int number = printAnnotation.number();
			for (int i = 0; i < number; i++) {
//value 속성값 얻기
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}
}
