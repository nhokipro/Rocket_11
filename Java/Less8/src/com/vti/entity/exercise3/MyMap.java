package com.vti.entity.exercise3;

public class MyMap<K, V> {
	private K key;
	private V value;
	public MyMap(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	
	
}
