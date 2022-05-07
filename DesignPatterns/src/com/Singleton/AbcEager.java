package com.Singleton;

public class AbcEager {
	static AbcEager obj = new AbcEager();

	private AbcEager() {
	}

	public static AbcEager getInstance() {
		return obj;
	}
}
