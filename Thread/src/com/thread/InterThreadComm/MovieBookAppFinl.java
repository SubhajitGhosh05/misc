package com.thread.InterThreadComm;

class TotalEarningsFinl extends Thread {
	int total = 0;

	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				total = total + 100;
			}
			this.notify();
		}
	}
}

public class MovieBookAppFinl {
	public static void main(String[] args) throws InterruptedException {
		TotalEarningsFinl te = new TotalEarningsFinl();
		te.start();
		// System.out.println(" Total earnings " + te.total);
		synchronized (te) {
			te.wait();
			System.out.println(" Total earnings " + te.total);
		}
	}
}
