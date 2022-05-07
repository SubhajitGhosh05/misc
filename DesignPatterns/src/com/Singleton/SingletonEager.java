package com.Singleton;

public class SingletonEager {

	public static void main(String[] args) {
		AbcEager obj1 = AbcEager.getInstance();
		AbcEager obj2 = AbcEager.getInstance();
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj2);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
