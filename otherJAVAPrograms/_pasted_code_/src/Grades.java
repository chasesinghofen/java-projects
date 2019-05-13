import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		
		int Grades;
		
		String ERROR;
		char a;
		char b;
		char c;
		char d;
		
		 
		System.out.println("Please enter grade number");
		Scanner reader = new Scanner(System.in);
		Grades = reader.nextInt();
		
	
{			
			
		if (Grades > 100 && Grades < 0)
		{ 
		System.out.println("ERROR INVALID GRADE" + "ERROR");
		}
		else if (Grades >= 90)
		{
		System.out.printf("You have earned the letter grade:" + " a");
		}
		else if (Grades >= 80)
		{
		System.out.printf("You have earned the letter grade:" + " b");
		}
		else if (Grades >= 70)
		{
		System.out.printf("You have earned the letter grade:" + " c");
		}
		else if (Grades >= 60)
		{
		System.out.printf("You have earned the letter grade:" + " d");
		}
		else if (Grades < 60)
		{
		System.out.printf("You have earned the letter grade:" + "f");
		}
		
		
	}
		

  }

}
