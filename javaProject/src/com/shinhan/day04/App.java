package com.shinhan.day04;

public class App {

	public static void main(String[] args) {
		
		// 가변길이 매개변수 (책 234)
		// 메서드 오버로딩 : 메서드 이름은 같고 매개변수 사양은 다른. (생성자랑 똑같네)
		sum(1, 2); // **바로 아래에 함수 만들었는데 왜 에러 안 없어질까? => 정의한 sum이 static이 안 붙어 있어서
		sum(1, 2, 3);
		sum(1.5, 2.5);
		
		// **얘는 static인데 ~~~~하고 싶으면 => new로 객체를 만들어버리면 된다.
		// 어케 만들더라
	}

	// 얘가 바로 '가변길이 매개변수'의 형태 : '데이터타입...OO'
	static void sum(int...arr) { // ...을 쓴다는 게 포인트
			                     // int[] arr 로 쓴 것과 동일함 ㅋㅋ
		int total = 0;
		for(int su : arr) {
			total += su;
		}
		if(total == 0) {
			return; // return;(함수 종료하고 호출한 곳으로 돌아가라) 자체와 void(리턴 '값'이 없다)를 헷갈리지 말 것. 
		}
		System.out.println("가변길이매개변수: " + total);
	}
	
	private static void sum(double d, double e) {
		
	}

	private static void sum(int i, int j, int k) {
		
	}

	// static이 없어서 
	/* void sum(int a, int b){
		System.out.println("합계: " + (a+b));
	} */
	
	
	// 매개변수(파라미터)가 자동 형변환 된다. 
	static void sum(int a, int b){
		System.out.println("합계: " + (a+b));
	}

	
	
	
	
	private static void f1() {
		// 그냥 이렇게만 생성하면 변수(stack 영역에 생성되는)에 지정한 게 아니므로 나중에 '번지'를 찾아갈 때 모른다? 헷갈린다? 
		new Calculator("red");
		
		// 따라서 이렇게 v1이라는 변수에 대입함으로써 ~
		Calculator v1 = new Calculator("red");
		Calculator v2 = new Calculator("black");
		Calculator v3 = new Calculator("B모델", "blue");
		Calculator v4 = new Calculator("C모델", "Green", 2000);
		
		v1.model = "A모델"; // 커서 올리면 'setter' 어쩌고 저쩌고 하는 게 있죠?
		print(v1);
		print(v2);
		print(v3);
		print(v4);
		
		
		// ** (1) 개수가 많으면 코드 양이 늘어날 거다. 따라서 '배열'을 이용하면 훨씬 간단해질 수 있다.
		Calculator[] arr = new Calculator[4];
		arr[0] = new Calculator("red");
		
		arr[0].model = "A모델"; // **수정 기능이 필요해서 빨간줄이 떴다. (setter가 필요한 상태)
		arr[0].setModel("A모델"); // => setter에 의해 해결된 상태!
		
		arr[1] = new Calculator("black"); // 이렇게 arr[0], arr[1] 형태로 접근하고 있는 것.
		arr[2] = new Calculator("B모델", "blue");
		arr[3] = new Calculator("C모델", "Green", 2000);
		
		// ** (2) for-each 반복문을 이용해서 위의 print(v1)~print(v4)라는 귀찮은 작업을 간소화시킨 것!
		for(Calculator cc : arr) {
			print(cc);
		
		}
	}

	// print(v1), print(v2) 형태의 함수를 만든 형태가 바로 아래의 형태
	private static void print(Calculator cal) { // 매개변수로 ' Calculator OOO '을 받는 형태.
		
		System.out.println(cal.model);
		System.out.println(cal.color); // *읽기 기능이 필요해서 빨간줄이 떴다. (getter가 필요한 상태)
		System.out.println(cal.price);
		
		System.out.println(cal.getColor()); // => getter에 의해 해결된 상태!
		
		
		
		cal.powerOn();
		cal.powerOff();
		
		System.out.println(cal.add(1, 2));
		System.out.println(cal.sub(1, 2));
		
	}

}
