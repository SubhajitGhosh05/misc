package com.thread.InterThreadComm;

class TotalEarnings extends Thread {
	int total = 0;

	public void run() {
		for (int i = 1; i <= 10; i++) {
			total = total + 100;
		}
	}
}

public class MovieBookApp {
	public static void main(String[] args) {
		TotalEarnings te = new TotalEarnings();
		te.start();
		System.out.println(" Total earnings " + te.total);
	}
}
