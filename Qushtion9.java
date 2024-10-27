package com.prsctice.question;

public class Qushtion9 {

	public static void main(String[] args) {
      
		Empolyee e = new Empolyee(101,"sam",1000);
		Qushtion9.show(e);
		e.sal=e.sal+100;
		Qushtion9.show(e);
	}
public static void show(Empolyee e) {
	System.out.println(e.getId()+""+e.getName()+""+e.getSal());
	
}

}
