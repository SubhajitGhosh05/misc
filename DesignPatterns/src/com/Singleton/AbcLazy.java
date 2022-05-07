package com.Singleton;

public class AbcLazy {
	static AbcLazy obj = new AbcLazy();

	private AbcLazy() {
		System.out.println("Instance created");
	}

	public static AbcLazy getInstance() {
		// double checked locking
		if (obj == null) {
			synchronized (AbcLazy.class) {
				if (obj == null)
					obj = new AbcLazy();
			}
		}
		return obj;
	}
}
