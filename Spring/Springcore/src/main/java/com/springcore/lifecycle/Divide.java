package com.springcore.lifecycle;

import javax.annotation.PostConstruct;

public class Divide {
	private int m;
	private int n;
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public Divide(int m, int n) {
		super();
		this.m = m;
		this.n = n;
	}
	public Divide() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Divide [m=" + m + ", n=" + n + "]";
	}
	@PostConstruct
	public void run() {
		System.out.println("Initalise using annotation");
	}
	
	@PostConstruct
	public void stop() {
		System.out.println("Destroy using annotation");
	}

}
