package Basic_Java;

public class Constracter2 {
	int id =001;
	String name = "sam";
	int sal =100;
	
	public Constracter2(int a,int b,String c){
		a=id;
		b=sal;
		c=name;
	}
	
	public static void main(String[] args) {
		Constracter2 obj = new Constracter2(12,123,"sam");
	         System.out.println(obj.id);
	         System.out.println(obj.name);
	         System.out.println(obj.sal);
	         }

}
