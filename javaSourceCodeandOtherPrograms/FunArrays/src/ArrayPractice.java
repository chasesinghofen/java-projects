import java.util.Scanner;


public class ArrayPractice {


   public static void main(String[] args) {
   int[] grades = new int [3];
   int[] grades1 = new int [3];
   int[] grades2 = new int [3];
   int[] grades3 = new int [3];
   int gradeTotal = 0;
   int gradeTotal1 = 0;
   int gradeTotal2 = 0;
   int gradeTotal3 = 0;
   
   Scanner input = new Scanner(System.in);
   
   for(int i = 0; i <3 ; i++){
   
   System.out.println("Please enter a Grade For student 1");
   grades[i]=input.nextInt();
   
   
   
   }
   for(int i = 0; i <3 ; i++){
   
   System.out.println("Please enter a Grade For student 2");
   grades1[i]=input.nextInt();
   
   
   
   }
   for(int i = 0; i <3 ; i++){
   
   System.out.println("Please enter a Grade For student 3");
   grades2[i]=input.nextInt();
   
   
   
   }
   for(int i = 0; i <3 ; i++){
   
   System.out.println("Please enter a Grade For student 4");
   grades3[i]=input.nextInt();
   
   
   
   }
  
   

   for(int myGrade: grades){
   gradeTotal=myGrade+gradeTotal;
   }
   int average =gradeTotal/3;
   System.out.println(average);
   for(int myGrade1: grades1){
   gradeTotal1=myGrade1+gradeTotal1;
   }
   average =gradeTotal2/3;
   System.out.println(average);
   for(int myGrade2: grades2){
   gradeTotal2=myGrade2+gradeTotal2;
   }
   average =gradeTotal2/3;
   System.out.println(average);
   for(int myGrade3: grades3){
   gradeTotal3=myGrade3+gradeTotal3;
   }
   average =gradeTotal3/3;
   System.out.println(average);
   
   input.close();
   }


	
}



