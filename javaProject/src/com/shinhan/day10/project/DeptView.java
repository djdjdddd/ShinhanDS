package com.shinhan.day10.project;

import java.util.*;

// View : display 담당 (비즈니스 이런게 아니라 그냥 보여주기만)
public class DeptView {
	
	// 그냥 message를 출력하는 기능
	public static void print(String message) {
		System.out.println("알림: " + message);
	}
	
	// dept 정보 '하나?'가 들어왔을 때 그걸 출력해주기 위해 만든 함수 
	public static void print(DeptVO dept) {
		System.out.println("dept정보: " + dept);
	}
	
	// 이건 dept 정보 '여러 건'이 들어왔을 때 그걸 출력해주기 위해 만든 함수
	public static void print(List<DeptVO> deptlist) {
		System.out.println("dept list 정보 : ");
		
		for(DeptVO dept : deptlist) {
			System.out.println(dept);
		}
	}

	

}
