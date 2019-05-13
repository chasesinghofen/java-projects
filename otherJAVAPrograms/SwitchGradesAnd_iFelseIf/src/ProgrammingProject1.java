import java.util.Scanner;

public class ProgrammingProject1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int NumberofGrades = 0;
		int grade = 0;
		int min = 100;
		int max = 0;
		double avg = 0;
		int sum = 0;
		int high = 0;
		int low = 0;
		int A, B, C, D, F;
		
		A=0;
		B=0;
		C=0;
		D=0;
		F=0;
		
		System.out.println("Enter grades in range of 0-100(type -1 when completed");
		
		do{
			
			grade = keyboard.nextInt();
			if (grade != -1){
				
				sum = sum + grade;
			}
		
		if(grade >= 0){
			NumberofGrades++;
			
			if(grade >= 90 && grade <= 100){
				
				A++;
				
			}
			if(grade >= 80 && grade <= 89){
				
				B++;
				
			}if(grade >= 70 && grade <= 79){
				
				C++;
				
			}if(grade >= 60 && grade <= 69){
				
				D++;
				
			}else if(grade >= 50 && grade <= 59){
				
				F++;
				
			}
		
			if(grade < min)
				min = grade;
			if(grade > max)
				max = grade;
			
			}
		}
		
		while (grade >= 0);
		
		
		avg = sum / NumberofGrades;
		System.out.println("total number of grades entered =" +NumberofGrades);
		System.out.println("total number of A's " +A);
		System.out.println("total number of B's " +B);
		System.out.println("total number of C's " +C);
		System.out.println("total number of D's " +D);
		System.out.println("total number of F's " +F);
		System.out.println();
		System.out.println("highest grade =" +max);
		System.out.println("lowest grade = " +min);
		System.out.printf("average score : %.2f", avg);
		
		
		
		
		
		
	}

}
