package com.prsctice.question;

public class Empolyee {
int id;
String name;
int sal;


public Empolyee(int i,String n,int s) {
	id =i;
	name=n;
	sal=s;
	
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSal() {
	return sal;
}

public void setSal(int sal) {
	this.sal = sal;
}

}
