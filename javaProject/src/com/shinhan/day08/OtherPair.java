package com.shinhan.day08;

public class OtherPair<K, V> {

	private K key;
	private V value;
	
	// 생성자
	public OtherPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	// getter
	public K getKey() {return key;}
	public V getValue() {return value;}
	
}
