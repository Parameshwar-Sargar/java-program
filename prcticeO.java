package Basic_Java;

public class prcticeO {
	static int a = m1();
      static {
    	  
    	  int a = 100;
    	  int b = 200;
    	  int c = a+b;
    	  System.out.println(c);
    	  
      }
      public static void main(String[] args) {
      System.out.println("main method");
	}
	private static int m1() 
	{
		System.out.println("satic variable");
		return 10;
	}

}
