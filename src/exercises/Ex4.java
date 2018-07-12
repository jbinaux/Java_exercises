package exercises;

public class Ex4 {

	public static void operation1(int a, int b, int c) {
		int op = a + b * c;
		System.out.println(op);
	}
	public static void operation2(int a, int b, int c) {
		int op = (a + b) % c;
		System.out.println(op);
	}
	public static void operation3(int a, int b, int c, int d) {
		int op = a + b * c / d; 
		System.out.println(op);
	}
	public static void operation4(int a, int b, int c, int d, int e, int f) {
		int op = a + b / c * d - e % f;
		System.out.println(op);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operation1(-5, 8, 6);
		operation2(55, 9, 9);
		operation3(20, -3, 5, 8);
		operation4(5, 15, 3, 2, 8, 3);
	}

}
