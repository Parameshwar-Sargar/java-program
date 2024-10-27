package com.prsctice.question;

public class Qushtion10 {

	public static void main(String[] args) {

		
		Empolyee e = new Empolyee(101,"sam",1000);
		Qushtion9 q = new Qushtion9();
		q.show(e);
		e.sal=e.sal+100;
		q.show(e);
	}
	public static void show(Empolyee e) {
		System.out.println(e.getId()+""+e.getName()+""+e.getSal());
		
}
}