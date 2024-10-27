package com.prsctice.question;

public class Qushtion29 {

	public static float m1(int i){
		System.out.println("m1 called");
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method and pass some number
	float a =	(int) Qushtion29.m1(5);
		int total = 100 +(int) a;
		System.out.println(total);


	}}
