package Basic_Java;
// Test 2 Qushtion 8......................

public class Demo13 {
	
	public static void main(String[] args) {
		
		Employee e = new Employee(101,"sam",100);
		show(e);
		e.sal =e.sal+100;
	    show(e);
		
		
		}
public static void show(Employee e) {
	System.out.println(e.id+""+e.name+""+e.sal);
	
//	System.out.println(e.id+""+e.name+""+e.sal);
	
}
}
