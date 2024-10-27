package com.prsctice.question;

public class Qushtion25 {
	public static void m1(Empolyee o){
		//display employee data here
		System.out.println(o.id+""+o.name+""+o.sal);
	}
	public static void main(String[] args) {
		//create Employee object here with 101,sam,1000 data
		Empolyee o = new Empolyee(101,"sam",1000);
		//call m1 method by passing this Employee object
		
		Qushtion25.m1(o);
	}

}
