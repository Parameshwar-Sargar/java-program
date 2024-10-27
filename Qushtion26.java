package com.prsctice.question;

public class Qushtion26 {

	public static void m1(int i){
		System.out.println(i);
	}
	public static void main(String[] args) {
		//create Employee object here with 101,sam,1000 data
		Empolyee o = new Empolyee(101,"sam",1000);
		//call m1 method and pass employee id as parameter
		Qushtion26.m1(o.id);
	}


}
