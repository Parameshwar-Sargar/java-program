package com.prsctice.question;

public class Qushtion7 {

	public static void main(String[] args) {
      
		 Empolyee e = new Empolyee(101,"sam",100);
		 Empolyee e2 = new Empolyee(102,"ram",200);
		 show(e);
		 show(e2);
	}
	public static void show(Empolyee e) {
		System.out.println(e.id+""+e.name+""+e.sal);
	}

}
