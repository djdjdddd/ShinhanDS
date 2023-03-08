package com.shinhan.day11;

import java.util.*;

public class Review {

	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		Map<String, Integer> map = new HashMap<>();
		map.put("1", 1);
		map.put("2", 2);
		map.put("3", 3);
		
		// Tree(검색 기능이 강화된 컬렉션) : TreeSet, TreeMap
		//                              data가 추가될 때 순서 정해짐. (크기비교 compareTo) 
		
		
		// Map은 key가 있으면 value를 읽을 수 있다. (value로 key를 읽으려면 어제 내가 찾은 방법으로)
		// 그래서 키들(keySet)을 불러온 다음
		// 반복실행을 통해 그 keySet을 변수에 넣어주면 key 하나하나를 찍을 수 있겠지?
		map.keySet();
		Set<String> keys = map.keySet();
		
		System.out.println(keys); // 단순히 이렇게 하면 타입이 Set<String>이니까 => [1, 2, 3] 일케 나옴.
		
		for(String key : keys) { // 따라서 향상 for를 이용해 String 타입에 하나씩 넣어줘야 하지.
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		
		// 
		
		
		
		
		
	}

}
