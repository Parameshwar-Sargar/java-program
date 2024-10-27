package Basic_Java;

public class Constracter3 {
int id;
String name;
int sal;

public Constracter3(int a,String b, int c) {
  a=id;
  b=name;
  c=sal;
	
}
public static void main(String[] args) {
//	Constracter3 obj = new Constracter3( 1, "ram", 10233);
	Constracter3 obj1 = new Constracter3(1,"sham",12345);
	Constracter2 obj = new Constracter2(12,123,"sam");
    System.out.println(obj.id);
    System.out.println(obj.name);
    System.out.println(obj.sal);
}
	
}
