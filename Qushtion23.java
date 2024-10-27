package com.prsctice.question;

public class Qushtion23 {
	public static void m1(Object o){
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		//call m1 method from here
		Qushtion23 q = new Qushtion23();
		q.m1(q);
	}

}
