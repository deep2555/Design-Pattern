package com.deepanshu.adapterDesignPattern;

public class School {

	public static void main(String[] args) {
		PilotPen pp = new PilotPen();
		Assignment as = new Assignment();
		as.setP(pp);
		as.writeAssignment("Im am tired");
	}
}
