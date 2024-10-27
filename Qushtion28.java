package com.prsctice.question;

public class Qushtion28 {
	public static int m1(int i){
		System.out.println("m1 called");
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method and pass some number
	int a =	Qushtion28.m1(2);
		int total = 100 + a;
		System.out.println(total);
	}

}
