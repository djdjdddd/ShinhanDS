package com.shinhan.day10;

import java.util.Comparator;

// Comparator is a raw type. References to generic type Comparator<T> should be parameterized
public class FruitComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.compareTo(o2);
	}

}
