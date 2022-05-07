package com.Adapter;

public class School {

	public static void main(String[] args) {
Pen pa=new PenAdapter();
		AssignmentWork assgn = new AssignmentWork();
		assgn.setP(pa);
		assgn.writeAssignment("Complete the assignment !!!");

	}

}
