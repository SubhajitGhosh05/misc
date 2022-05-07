package com.thread;

public class ThreadTest extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread");
		} else {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		// Thread.currentThread().setDaemon(true);
		System.out.println("Main Thread");
		ThreadTest t1 = new ThreadTest();
		t1.setDaemon(true);
		t1.start();

	}

}
