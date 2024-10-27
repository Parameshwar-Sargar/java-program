package com.prsctice.question;

public class Qushtion8 {

	public static void main(String[] args) {
		Empolyee emp = new Empolyee(101, "sam", 1000);
		Qushtion8.show(emp);
		System.out.println(emp.getId()+" " + emp.getName() + " "+ emp.getSal());
	}

	public static void show(Empolyee ex) {
		System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSal());
		ex.setId(102);
	}


	}


