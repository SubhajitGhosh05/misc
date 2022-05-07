package com.thread;

class Table2 {
	synchronized void printTable(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class MyThread12 extends Thread {
	Table2 t;

	MyThread12(Table2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread22 extends Thread {
	Table2 t;

	MyThread22(Table2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class TestSync2 {
	public static void main(String args[]) {
		Table2 obj = new Table2();// only one object
		MyThread12 t1 = new MyThread12(obj);
		MyThread22 t2 = new MyThread22(obj);
		t1.start();
		t2.start();
	}
}