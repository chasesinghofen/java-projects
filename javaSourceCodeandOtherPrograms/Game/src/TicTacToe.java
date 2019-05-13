import java.util.Scanner;

public class TicTacToe{
	public static int row, col;
	public static Scanner scan = new Scanner(System.in);
	public static char [][]board = new char [3][3];
	public static char turn = 'X';
	
	public static void main(String[] args){
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				board[i][j] = '_';
			}
		}
		Play();
	}
	
	
	public static void Play() {
		boolean playing = true;
		//prints the board first. then user can enter row & column.
		PrintBoard();
		while(playing){
			System.out.println(" Please enter a row and column. Example: 1(row), 2(column) like so. ");
			System.out.println("Enter only numbers 1-3 b/c there are only 3 rows and 3 columns.");
			System.out.println("Dont act foolish and enter 5(row) & 9(column)");
			
			row = scan.nextInt() -1;
			col = scan.nextInt() -1;
			board[row][col] = turn;
			if (GameOver(row, col)) {
				playing = false;
				System.out.println("Game over Player " + turn + " wins :)");
			
			}
			PrintBoard();
			if (turn == 'X')
				turn = 'O';
			else
				turn = 'X';
			
		}
		
		
	}
	
	public static void PrintBoard(){
		for (int i = 0; i < 3; i++){
			System.out.println();
			for (int j = 0; j < 3; j++){
				if (j == 0)
					System.out.print("| ");
				System.out.print(board[i][j] + " | ");
			}
		}
		System.out.println();
	}
	
	public static boolean GameOver(int rowMove, int colMove){
		//check horizontal and vertical wins.
		if (board[0][colMove] == board[1][colMove]
				&& board[0][colMove] == board[2][colMove])
			return true;
		if (board [rowMove][0] == board[rowMove][1]
				&& board[rowMove][0] == board[rowMove][2])
			return true;
		//check diagonal wins.
		if (board[0][0] == board[1][1] && board[0][0] == board[2][2]
				&& board[1][1] != '_')
			return true;
		if (board[0][2] == board[1][1] && board[0][2] == board[2][0]
				&& board[1][1] != '_')
				return true;
		return false;
		
	}
}
