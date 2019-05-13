
public class grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	


public String getGrade(int input)
{
    String letterGrade;
    switch(input/10)
    {
        case 9: letterGrade = "A";
                  break;
        case 8: letterGrade = "B";
                  break;
        case 7: letterGrade = "C";
                  break;
        case 6: letterGrade = "D";
        default:
                  letterGrade = "F";
    }return letterGrade;


