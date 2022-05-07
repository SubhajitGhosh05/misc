package com.Singleton;

public class SingletonEnum {
	public static void main(String[] args) {
		EnumAbc obj1=EnumAbc.INSTANCE;
		obj1.i=5;
		obj1.show();
		
		EnumAbc obj2=EnumAbc.INSTANCE;
		obj2.i=6;
		obj1.show();
		
	}


}
