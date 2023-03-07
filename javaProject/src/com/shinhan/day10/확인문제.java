package com.shinhan.day10;

import java.util.*;

public class 확인문제 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;


		// 1. 평균점수 출력 (iterator 사용)
		Iterator<String> it = map.keySet().iterator();

		while (it.hasNext()) {
			int score = map.get(it.next());
			totalScore += score;
		}
		System.out.println(totalScore / map.size());
		
		
		// 2. 최고점수 출력 
		// maxScore 초기화 했으니까
		for(int i=0; i < map.size(); i++) {
			
		}
		
		
		
		// 3. 최고점수를 받은 아이디를 출력
		
	}

}
