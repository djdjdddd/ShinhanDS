package com.shinhan.day02;

public class 김용희3장 {

	public static void main(String[] args) {
		// 문제 7.
		double x = 5.0;
		double y = 0.0;
		double z = 5 % y;
		
		if(Double.isNaN(z)) { // 연산의 결과가 NaN인지 묻는 기능? 메소드? 
				              // 연산의 결과가 Infinity인지 묻는 건 Double.isInfinity() 
			System.out.println("0.0으로 나눌 수 없습니다");
			
		}else {
			double result = z +10;
			System.out.println(result);
		}
	}

}
