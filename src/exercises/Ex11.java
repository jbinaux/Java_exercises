package exercises;

public class Ex11 {

	public static double calc(int iterations) {
		double result = 0;
		double diviseur = 1;
		for(int i = 1; i <= iterations; i++)
		{
			if(i%2==0)
			{
				result -= 1/diviseur;
			}
			else
			{
				result += 1/diviseur;
			}
			diviseur += 2;
		}
		return(4.0*result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calc(2000000000));
	}

}
