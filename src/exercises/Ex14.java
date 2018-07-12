package exercises;
import java.util.Scanner;

public class Ex14 {

	public static void password()
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Input your Password:");
		System.out.println("Your pasword was : " + reader.next());
		
		reader.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		password();
	}

}
