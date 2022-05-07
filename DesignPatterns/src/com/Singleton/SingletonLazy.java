package com.Singleton;

public class SingletonLazy {

	public static void main(String[] args) {

		/*
		 * Thread t1=new Thread(new Runnable() {
		 * 
		 * @Override public void run() { AbcLazy obj1=AbcLazy.getInstance();
		 * 
		 * } });
		 * 
		 * 
		 * Thread t2=new Thread(new Runnable() {
		 * 
		 * @Override public void run() { AbcLazy obj1=AbcLazy.getInstance();
		 * 
		 * } });
		 * 
		 * t1.start(); t2.start();
		 */

		AbcLazy obj1 = AbcLazy.getInstance();
		AbcLazy obj2 = AbcLazy.getInstance();
	}

}
