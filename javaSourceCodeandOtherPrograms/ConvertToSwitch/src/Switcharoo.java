import java.util.Scanner;

public class Switcharoo {

	public static void main(String[] args) {
		
		int choice = 140;
		int choice1 = -42;
		int choice2 = 85;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a choice");
		choice = s.nextInt();
		

		switch (choice){
		case 100: 
			System.out.printf("You have earned the letter grade :A");
			break;
		case 85: 
			
			System.out.printf("You have earned the letter grade : B\n end of program");
			break;
		case 70: 
			System.out.printf("You have earned the letter grade : C");
			break;
		case 60:
			System.out.printf("You have earned the letter grade : D");
			break;
		case 280/2: 
			//choice = 140;
		case -84/2:
			//choice = -42;
			System.out.println("ERROR You have entered and invaled grade");
			default:
			System.out.println("end of program");
			break;
			}
	}
}
	
	

