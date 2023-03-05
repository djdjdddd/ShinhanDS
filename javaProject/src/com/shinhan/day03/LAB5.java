package com.shinhan.day03;

import java.util.Arrays;

public class LAB5 {

	public static void main(String[] args) {
		method2();
		
	}

	private static void method2() {
		//2차원 배열을 이용하여 두 행렬에 대한 차를 구할 수 있는 sub() 메소드와 
		//결과를 출력하는 prn() 메소드를 ArrayTest 클래스 내에 구현하십시오.  
		
		/*-	행렬의 차를 구하기 위한 메소드. [ a – b = c ]

				배열 a    -     배열 b     =     배열 c
				30 30 30 30     1  2  3  4        29 28 27 26 
				40 40 40 40  -  5  6  7  8    =   35 34 33 32 
				50 50 50 50     9 10  11  12       41 40 39 38 */
			
		int[][] arr1 = {{30,30,30,30}, {40,40,40,40}, {50,50,50,50}};
		int[][] arr2 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		int[][] arr3 = new int[3][4];
		int[][] arr4 = sub(arr1, arr2, arr3); // sub() 함수 호출, c값 리턴**
		/* 쌤 설명 참조**
		   * input : arr1, arr2, arr3 	
		   * 인풋값을 넣으면 sub 라는 함수를 거쳐
		   * output이 나오는데                                  
		   * (1) void : 그걸 굳이 리턴하지 않는                   
		   * (2) 위처럼 int[][] arr4 = sub(arr1, arr2, arr3); 형태로 = 돼있으면 
		   * sub 함수를 거쳐 나온 리턴값을 arr4라는 변수에 넣겠다는 뜻.  
		   * 그래서 return문이 필요한 거고, 그래서 return시 데이터 타입도 맞춰줘야 하고
		   */
		
		sub(arr1, arr2, arr3); // sub() 함수 호출
		
		prn(arr3); // prn() 함수 호출
		
		prn(arr4); // prn() 함수 호출
		
		
	}
	public static int[][] sub(int[][] a, int[][] b, int[][] c){ // sub() 메소드 정의
		
		// 쌤 방법
		for(int i=0; i < a.length; i++) {
			for(int j=0; j < b.length; j++) {
				c[i][j] = a[i][j] - b[i][j];
			}
		}
		
		return c; // 위에서 정의한 c 값(정확히는 주소)을 리턴**
	}
	
	public static void prn(int[][] a) { // prn() 메소드 정의
		for(int i=0; i < a.length; i++) {
			System.out.println("---------------------------");
			for(int j=0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
				
			}
		}
		
	}

	private static void method1() {
		int[] arr = {3, 24, 1, 55, 17, 43, 5};
		System.out.println("원본: " + Arrays.toString(arr)); // 원본 배열 잘 들어있다고 그냥 확인용으로 쓴 코드
		
		// 1. Selection sort 방법 (아래 설명)
		for(int i =0; i < arr.length; i++) {
			for(int j=i+1; j < arr.length; j++) { // j=i+1 : 내(i) 오른쪽부터 비교해나갈 거니까
				
				// 자리 바꾸는 경우
				if(arr[i] > arr[j]) {
					int temp = arr[i]; // ★temp라는 임시보관 장소를 만들어서 잠시 보관 (값이 사라지지 않게)(그림참조)
					arr[i] = arr[j]; 
					arr[j] = temp; // 코드로 적으니까 더 이해가 되는 거 같기도?
					
				}
			}
		}
		System.out.println("클래스 실행결과 : " + Arrays.toString(arr));
	}

}


/*# 오름차순(내림차순) 中 Selection sort 알고리즘 설명
0번째를 선택하고 1~끝까지 비교해나가
비교했는데 나보다 작아? 그럼 자리 바꿔 (왜냐면 오름차순이니까)
이걸 위해 for문을 이용한다. 
이때, temp라는 임시보관 장소를 만들어서 미리 빈 공간을 만들어놔야? 
값이 사리지지 않고 자리를 바꿀 수 있는 건가 (마치 전세 같네)*/