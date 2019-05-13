
/* *****Tic- Tac- Toe- Rules****
 *  http://vikeshkhanna.webfactional.com/ultimate/
 * https://www.thespruce.com/tic-tac-toe-game-rules-412170
 * This is an AWESOME!! game of tic-tac-toe.  
 * The human & reining champion (Chase) is X and the computer (loser) is O. 
 */

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	//Display game board with dashes.2D board console output.

	private char gameBoard[] = {' ',' ',' ',' ',' ',' ',' ',' ',' '};
	private final int BOARD_SIZE = 9;// Board is 9 spaces. 
	
	public static final char Chase = 'X';
	public static final char Computer = 'O';
	
	private Random mRand; // Random
	
	public TicTacToe() {
		
		// import java.util.Random
		mRand = new Random(); 
		
		// Chase's turn first.		
		char turn = Chase;    
		int  win = 0;               
		
		// Tic-Tac-Toe game loops until human or computer wins.
		while (win == 0)
		{	
			displayBoard();

			if (turn == Chase)
			{
				getUserMove();
				turn = Computer;
			}
			else
			{
				getComputerMove();
				turn = Chase;
			}	

			win = checkForWinner();
		}

		displayBoard();

		// Report the Tic-Tac-Toe winner
		System.out.println();
		if (win == 1)
			System.out.println("It's a tie game.\nend program.\nStart over, Play to win!! ");
		
		else if (win == 2)
			System.out.println(Chase + " wins!..As you should");
		
		else if (win == 3)
			System.out.println(Computer + " wins!..Chase you failed");
		
		else
			System.out.println("Selection doesn't make sense!");
	}
	
	private void displayBoard()	{ // Game Board. Array == 0-8. Which is 9 spots.
		System.out.println();
		System.out.println(gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2]);
		System.out.println("-----------");
		System.out.println(gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5]);
		System.out.println("-----------");
		System.out.println(gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8]);
		System.out.println();
	}
	
	// Check for a winner.  
	// Return 0 to continue game.
	// Return 1 if it's a tie game.
	// Return 2 if X (Chase) wins.
	// Return 3 if O (Computer) wins.
	private int checkForWinner() {
		
		// Check for a horizontal win.
		for (int i = 0; i <= 6; i += 3)	{
			if (gameBoard[i] == Chase && 
				gameBoard[i+1] == Chase &&
				gameBoard[i+2]== Chase)
				return 2;// Chase (x) wins.
			if (gameBoard[i] == Computer && 
				gameBoard[i+1]== Computer && 
				gameBoard[i+2] == Computer)
				return 3;// Computer (y) wins.
		}
	
		// Check for a vertical win.
		for (int i = 0; i <= 2; i++) {
			if (gameBoard[i] == Chase && 
				gameBoard[i+3] == Chase && 
				gameBoard[i+6]== Chase)
				return 2; // Chase (x) wins.
			if (gameBoard[i] == Computer && 
				gameBoard[i+3] == Computer && 
				gameBoard[i+6]== Computer)
				return 3; // Computer (y) wins.
		}
	
			// Check for a diagonal win.
		if ((gameBoard[0] == Chase &&
			 gameBoard[4] == Chase && 
			 gameBoard[8] == Chase) ||
			(gameBoard[2] == Chase && 
			 gameBoard[4] == Chase &&
			 gameBoard[6] == Chase))
			return 2;  // Chase (x) wins.
		if ((gameBoard[0] == Computer &&
			 gameBoard[4] == Computer && 
			 gameBoard[8] == Computer) ||
			(gameBoard[2] == Computer && 
			 gameBoard[4] == Computer &&
			 gameBoard[6] == Computer))
			return 3; // Computer (y) wins.
	
				// Check for a tie game.
		for (int i = 0; i < BOARD_SIZE; i++) {
				// If no win/tie/loss, Continue game. Human VS. Computer.
				// Return == 0 , Continue Game. 
			if (gameBoard[i] != Chase && gameBoard[i] != Computer)
				return 0; //Continue game play.
		}
	
		
		return 1;
		// Return 1 == tie.
	}
	
	void getUserMove() 
	{
		
		Scanner s = new Scanner(System.in);// allows Chase (Human) to move. 
		
		int move = -1;
		
		while (move == -1) {			
			try {
				System.out.print("Chase's turn: ");
			    move = s.nextInt();
			
				while (move < 1 || move > BOARD_SIZE || 
					   gameBoard[move-1] == Chase || gameBoard[move-1] == Computer) {
					
					if (move < 1 || move > BOARD_SIZE)
						System.out.println("Please select between 1 and " + BOARD_SIZE + ".");
					else
						System.out.println("That space is occupied.  Please choose another space.");
		
					System.out.print("Chase it's your move: ");
				    move = s.nextInt();
				}
			} 
			catch (InputMismatchException ex) {
				System.out.println("Please enter a number between 1 and " + BOARD_SIZE + ".");
				s.next();  // Get next line so we can start new game. 
				move = -1;
			}
		}

		gameBoard[move-1] = Chase;
	}
	
	private void getComputerMove() 
	{
		int move;

		// First see if there's a move O (computer) can make to win
		for (int i = 0; i < BOARD_SIZE; i++) {
			if (gameBoard[i] != Chase && gameBoard[i] != Computer) {
				char letter = gameBoard[i];
				gameBoard[i] = Computer;
				if (checkForWinner() == 3) {
					System.out.println("The Computer selected " + (i + 1));
					return;
				}
				else
					gameBoard[i] = letter;
			}
		}
		//Computers turn to check to block Chase's "X" move..
		for (int i = 0; i < BOARD_SIZE; i++) {
			if (gameBoard[i] != Chase && gameBoard[i] != Computer) {
				char letter = gameBoard[i];   // Store selected letter (o/x)
				gameBoard[i] = Chase;
				if (checkForWinner() == 2) {
					gameBoard[i] = Computer;
					System.out.println(" The Computer selected " + (i + 1));
					return;
				}
				else
					gameBoard[i] = letter;
			}
		}

		// Perform random selection from computer's move.
		// import java.util.Random;
		// import java.util.Scanner;
		do
		{
			move = mRand.nextInt(BOARD_SIZE);
		} while (gameBoard[move] == Chase || gameBoard[move] == Computer);
			
		System.out.println("The Computer selected " + (move + 1));

		gameBoard[move] = Computer;
	}	
	
	
	// Main Method.
	public static void main(String[] args) {		
		new TicTacToe();		
	}
}
