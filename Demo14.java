package Basic_Java;
// Test 3 qushtin 9...........
public class Demo14 {
	
	public static float m1(int i) {
		System.out.println("m1 called");
		return i*i;
	}

	public static void main(String[] args) {
	float a  = Demo14.m1(1);
		int total = 100+ (int)a;
		System.out.println(total);
	}
}
