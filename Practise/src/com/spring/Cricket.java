package com.spring;

public class Cricket {

	private Bowling bl;

	public Bowling getBl() {
		return bl;
	}

	public void setBl(Bowling bl) {
		this.bl = bl;
	}

	public void getBowling() {
		bl.speed();
	}
}
