package Basic_Java;

public class demo9 {
	
	 static float  a = 10.5f;
	 
	public static void main(String[] args) {
		Employee e1=new Employee(1,"sam",1000);
	
		 Employee e2 = new Employee(e1);
		
		System.out.println(e2.id+""+e2.name+""+e2.sal);
	}

}
