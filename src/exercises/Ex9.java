package exercises;

public class Ex9 {

	public static void mult(int a, int b)
	{
		int multi = a*b;
		System.out.println(a + " x " + b + " = " + multi);
	}
	public static void table(int a)
	{
		for(int i = 1; i <= 10; i++)
		{
			mult(a, i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		table(8);
	}

}
