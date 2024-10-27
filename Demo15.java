package Basic_Java;

public class Demo15 {
	public static void show(Employee e) {
		System.out.println(e.id+""+e.name+""+e.sal);
	}
public static void process(Employee e) {
	 e.id = 101;
     e.name ="sam";
	e.sal = 1000;
	
}
public static void main(String[] args) {
	Employee e =new  Employee();
	Demo15.process(e);
	Demo15.show(e);
	
}
}
