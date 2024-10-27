package com.prsctice.question;

public class Qushtion6 {

	public static void main(String[] args) {
      
		 Empolyee e = new Empolyee(101,"sam",1000);
		 Qushtion6 q = new Qushtion6();
		 q.show(e);
		 
	}

	public void show(Empolyee e) {
		System.out.println(e.id+""+e.name+""+e.sal);
	}
}
