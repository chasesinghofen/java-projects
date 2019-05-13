import java.util.Scanner;

public class Grades {

	private static Object String;

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int Grades;
		
		char A = 'A';
		char B = 'B';
		char C = 'C';
		char D = 'D';
		char F = 'F';
		String ERROR;
		
		System.out.println("Enter your grade:");
		Scanner reader = new Scanner(System.in);
		Grades = reader.nextInt();
		
		if (Grades >= 90 && Grades <=100)
		{
		System.out.printf("You have earned the letter grade : A" );
		}
		else if (Grades >= 80 && Grades <= 89)
		{
		System.out.printf("You have earned the letter grade: B");
		}
		else if (Grades >=70 && Grades <= 79)
		{
		System.out.printf("You have earned the letter grade: C");
		}
		else if (Grades >= 60 && Grades <= 69)
		{
		System.out.printf("You have earned the letter grade: D");
		}
		else if (Grades >= 0 && Grades <= 59)
		{
		System.out.printf("You have earned the letter grade: F");
		}
		else 
		{
		System.out.println("ERROR You have entered an invalid input");
		}
		
		{
			
		}
	}
}

