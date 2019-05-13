import java.util.Scanner;
public class Switcharoo {

	

	public static void main(String[] args) {
		
		int Grades;
		Scanner s =new Scanner(System.in);
		System.out.println("Select option");
		Grades = s.nextInt();
		
		switch (Grades){
		case 1: 
			System.out.println("you have earned the letter grade: A");
			break;
		case 2: 
			System.out.println("you have earned the letter grade: B");
			break;
		case 3: 
			System.out.println("you have earned the letter grade: C");
			break;
		case 4: 
			System.out.println("you have earned the letter grade: D");
			break;
		case 5: 
			System.out.println("you have earned the letter grade: F");
			break;
		default:
			System.out.println("ERROR you have entered an invalid grade");
			break;
		}
	}
}