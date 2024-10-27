package Basic_Java;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee(1,"sam",100);
		Employee e1 = new Employee(2,"ram",200);
		

		Test.display(e);	
		Test.display(e1);
	}
	public static void display(Employee e) {
		System.out.println(e.id +""+ e.name +""+ e.sal);
		
	}
}
