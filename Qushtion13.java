package com.prsctice.question;

public class Qushtion13 {
	int x = 10;
	public void show(){
		int x = 100;
		System.out.println(x);//do required changes at this line but output should be 100
		System.out.println(this.x);//do required changes at this line but output should be 10
	}
	
	public static void main(String[] args) {
		
		Qushtion13 q = new Qushtion13();
		q.show();
		
	}

}
