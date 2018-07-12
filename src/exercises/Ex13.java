package exercises;

public class Ex13 {

	public static void swap(int a, int b)
	{
		int swap;
		
		swap = a;
		a = b;
		b = swap;
		
		System.out.println("a = " + a + "\nb = " + b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap(1,2);
	}

}
