package com.prsctice.question;

public class Qushtion24 {
	public static void m1(Empolyee e){
		//display data here
		System.out.println(e.id+""+e.name+""+e.sal);
	}
	public static void main(String[] args) {
		//call m1 method from here
		Empolyee e = new Empolyee(101,"sam",1000);
		Qushtion24.m1(e);
	}

}
