package com.shinhan.day10;

import java.util.*;

public class ComparatorExample {

	public static void main(String[] args) {
		f3();
		
	}

	
	private static void f3() {
		
		TreeMap<String, Fruit> treeMap2 = new TreeMap<>(new Comparator<Fruit>()); 
		                               // Comparator < > 안에는 Key의 타입(지금은 String)이 와야 해서 에러가 뜨나본데??
		
		TreeMap<String, Fruit> treeMap = new TreeMap<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

	}


	// TreeMap 으로도 연습 (1)
	private static void f2() {
		TreeMap<String, Fruit> treeMap = new TreeMap<>();
		
		treeMap.put("A", new Fruit("포도", 3000));
		treeMap.put("C", new Fruit("수박", 10000));
		treeMap.put("B", new Fruit("딸기", 6000));
		
		for(String key : treeMap.keySet()) { // treeMap의 keySet들을 key에 넣어주고 (현재 String 타입이니까 타입 지정도 해주고)
			System.out.print(key);
			System.out.println(treeMap.get(key));
		}

	}

	// TreeSet 으로도 연습
	private static void f1() {
		TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());
		
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		
		for(Fruit f : treeSet) {
			System.out.println(f);
		}
	}

}
