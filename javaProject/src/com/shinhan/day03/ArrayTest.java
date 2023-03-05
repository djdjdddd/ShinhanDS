package com.shinhan.day03;

import java.util.Arrays;


// cmd>java com/shinhan/day03/ArrayTest 100 200 (이 100과 200을 받아줄 수 있는 String[] args를? 명령행 매개변수라고 한다)
// (cf. main메소드에 String[]인 이유는 숫자든 문자든 모두 다 입력받기 위해서 그랬다고 한 듯)
public class ArrayTest {

	public static void main(String[] args) { // 명령행 매개변수
		System.out.println(args.length);
		
		// 배열 길이가 2보다 작을 때 수행 안하게끔 하려는 코드
		if(args.length < 2) {
			// 1.main 빠지기
			// return; 
			
			// 2. 프로그램 종료
			System.exit(0); // 0이 정상종료, -1이 비정상종료
		}
		
		int a = Integer.parseInt(args[0]); // Integer.parstInt() : 이거 뭐였더라?
		int b = Integer.parseInt(args[1]);
		System.out.println("더하기:" + (a+b));
		
	}

	private static void f6() {
		// 5.9 배열 복사 (책 187pg)
		int[] arr1 = new int[] {100,90,50,88}; // 길이 4짜리 배열인 arr1
		int[] arr2 = new int[10]; // 길이 10짜리 배열인 arr2
		int[] arr3 = new int[10];
		
		// 방법1. for문을 이용
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i]; // arr1의 [i]를 arr2의 [i]에 대입하겠다. (=복사)
			
			
		// 방법2. arraycopy() 메소드 이용
		System.arraycopy(arr1, 0, arr3, 0, arr1.length); 
		System.out.println(arr3.toString());
		}
	}

	private static void f5() {
		// 선언 + 생성 + (자동 초기화)
		int[] arr = new int[5]; // 좌측이 선언, 우측이 생성(따로 값을 주진 않았으므로 길이를 꼭 지정해야)
		
		// 선언 + 생성 + 직접 초기화 (★이때 길이는 쓰면 안 된다!)
		int[] arr2 = new int[] {100, 90, 88, 100}; // 방법1
		
		int[] arr3 = {100, 90, 88, 100}; // 방법2. new int[] 생략해도 ㄱㅊ
		
		int[] arr4;
		arr4 = new int[] {100, 90, 88, 100}; // 방법3. 단, 따로 따로 할 땐 new int[]가 생략 안 됨 ㅋㅋ
	
		// 2차원(다차원) 배열에 값을 줄 때 이렇게 {}를 여러개 써서 
		int[][] arr5 = new int[][] {{100, 90, 88, 100}, {10, 9, 8}};
		                           // ★행렬이라고 치면 {}, {} 니까 2행, 각 행이 4열, 3열로 이뤄진 다차원 배열!!
		
		for(int[] aa : arr5) { // arr5 배열의 값을 int[] aa에 대입하겠다.
			                   // ppt 5.10에 자세한 설명
		/*쌤 설명 : arr5에서 하나의 값을 뽑으면 뭐임? {100, 90, 88, 100} 이거나 {10, 9, 8} 이잖아?
				이건 배열이잖아. 그러니까 값을 대입하는 녀석도 ' int[] aa '라는 '배열'에 대입을 해줘야 하는 것.
				이걸 또 다시 뽑게 되면 그땐 정수니까 int bb 에 대입해주면 되겠지?*/
			System.out.println(Arrays.toString(aa));
		}
	
	}

	private static void f4() {
		// 정방행렬이 아니고 각각 길이가 다른 다차원배열 만드는 법
		
		// 1. 배열 변수 선언
		int[][] arr2; // [] 2개니까 2차원
		
		
		// 2. 배열 생성 ... (배열 길이 필수!)
		arr2 = new int[3][]; // (1) 여기서 첫번째 길이만 지정하고, 그 다음껀 지정 안 한 상태 (null)
		arr2[0] = new int[3]; // (2) 이렇게 따로 따로 지정해주면 된다. 
		arr2[1] = new int[4];
		arr2[2] = new int[2];
		
		// 3. 배열 사용
		// 일반 for
		for(int i=0; i < arr2.length; i++) { // i와 j를 그림으로 상상하면서 코드를 봐보자.
			for(int j=0; j < arr2[i].length; j++) {
				System.out.printf(" %d행 %d열 = %d \n", i, j, arr2[i][j]);
		
			}
	}
	}

	private static void f3() {
		// 2차원배열 : 배열의 배열

		// 1. 배열 변수 선언
		int[][] arr1;
		int[] arr2[]; // 이런 형태도 가능하긴 하다.
		int arr3[][]; // 이런 형태도 가능하긴 하다.

		// 2. 배열 생성 ... (배열 길이 필수!)
		arr1 = new int[3][4]; // 3개짜리 각각이 4개짜리를 갖고 있는 형태! (책 그림 참조)
		arr2 = new int[3][]; // 3개짜리 각각이 null을 갖는
		// arr3 = new int[][]; // 이건 안 된다.

		// 3. 배열 사용
		System.out.println(arr1[0][0]);
		System.out.println(arr2[0]);

		// 일반 for
		for (int i = 0; i < arr1.length; i++) { // i와 j를 그림으로 상상하면서 코드를 봐보자.
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.printf(" %d행 %d열 = %d \n", i, j, arr1[i][j]);
			}
		}

		// 향상 for (ppt 5.10에 자세한 설명)
		for (int[] aa : arr1) { // int[] aa 에 arr1 값 하나 하나를 대입하겠다.
			for (int bb : aa) { // int su 에 aa 값 하나 하나를 대입하겠다.
				System.out.print(bb + " \t");
			}
		}
	}

	private static void f2() {
		// 1. 배열 (변수) 선언
		int[] scores;

		// 2. 배열 생성 ... ★배열의 개수는 필수이다.
		// 생성시 자동으로 초기화된다.
		scores = new int[26];

		// 3. 배열 사용
		scores[0] = 100; // 배열 0번째엔 100이라는 숫자를 대입하겠다.
		scores[1] = 90; // 배열 1번째엔 90을
		scores[2] = 80; // 배열 2번째엔 80을

		int total = 0;
		System.out.println(scores.length); // 배열의 개수인 26을 직접 넣기보단 .length 를 쓰자. (그래야 나중에 유지보수)

		// (1) 일반for
		for (int index = 0; index < scores.length; index++) { // < 가 아니라 <= 를 하면 26번째까지인데, 이러면 OutOfBounds 라는 에러 뜨게 된다
																// ㅋㅋ
			System.out.println("scores[" + index + "]=" + scores[index]);
			total += scores[index];
		}
		System.out.println("총점은" + total);

		// (2) 향상for, 확장for
		for (int score : scores) { // scores라는 배열에 있는 값들을 score라는 변수 하나 하나에 넣어주는 for문
			total += score;
		}
		System.out.println("총점은" + total);
	}

	private static void f1() {
		// 배열 : 하나의 이름으로 동일한 타입의 연속 공간을 (heap영역에) 만드는 자료구조.

		// 배열을 사용하기 위해선
		// 1. 배열 (변수) 선언
		int[] arr1 = null; // 배열도 null로 초기화 가능 (참조변수라 그런 듯?)
		double[] arr3;
		boolean[] arr4;
		String[] arr5;

		// 2. 배열 생성 ... ★배열의 개수는 필수이다.
		// 생성시 자동으로 초기화된다. (정수:0, 실수:0.0, boolean:false, 객체:null) (기본형이 아닌 참조형? 객체는
		// null로 자동으로 초기화된다는 뜻)
		arr1 = new int[5];
		arr3 = new double[6];
		arr4 = new boolean[6];
		arr5 = new String[6];

		// 3. 배열 사용
		System.out.println(arr1[0]);
		System.out.println(Arrays.toString(arr1)); // 배열도 Arrays. 라는 메소드? 있다.
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5)); // 출력해보면 자동으로 초기화된 사실을 알 수 있다.
	}

}
