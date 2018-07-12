package exercises;

public class Ex10 {

	public static double calc1(double a, double b) {
		return (a * b - b * b);
	}
	public static double calc2(double a, double b) {
		return (a - b);
	}
	public static void calc3(double a, double b) {
		double result = a / b;
		System.out.println(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc3(calc1(25.5, 3.5), calc2(40.5, 4.5));
	}

}
