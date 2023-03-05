package com.shinhan.day08;

import java.util.Arrays;
import java.util.Comparator;

public class DecendingInteger implements Comparator<Integer>{ // Comparable 인터페이스가 아닌 Comparator

	@Override
	public int compare(Integer o1, Integer o2) {
	
		return o1 - o2;
	}

	
	public static void main(String[] args) {
		
		int[] arr = new int[] {100,30,80,20,99};
		
		Arrays.sort(arr);
		
		
	}
	
	
}
