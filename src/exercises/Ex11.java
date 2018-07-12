package exercises;

public class Ex11 {

	public static double calc(double a) {
		double result = 0;
		double b = 1;
		double c=0;
		for(int i = 1; i <= 6; i++)
		{
			if(i%2==0)
			{
				c = b*-1;
			}
			else
			{
				c = b;
			}
			
			result= result + (1.0/c);
			b= b+2;
		}
		return(a*result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calc(4.0));
	}

}
