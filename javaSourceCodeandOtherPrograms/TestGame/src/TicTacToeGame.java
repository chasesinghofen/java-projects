
public class TicTacToeGame {

	private char [][] board;
	private char currentPlayerMark;
	
	public TicTacToeGame(){
		board = new char [3][3];
		currentPlayerMark = 'x';
		initializeBoard();
		
		}

	//Set & reset the jboard back to all empty values.
	public void initializeBoard(){
		
		//loop thru rows
		for (int i = 0; i < 3; i++){
			
			//loop thru columns
			for ( int j = 0; j < 3; j++){
				board[i][j] = '-';
				
			}
		}
	}

	//print the current board 
	public void printBoard(){
		System.out.println("-------------");
		
		for (int i = 0; i < 3; i++){
			System.out.print( " | ");
			for (int j = 0; j < 3; j++) {
			 System.out.print(board[i][j] + " | ");
		
		}
	System.out.println();
	System.out.println("-------------");
		}
	}

//loop thru all cells of the board and if one is found to be empty (contains char '-' ) then return false.
//otherwise board is full.
public boolean isBoardFull() {
	boolean isFull = true;
	
	for (int i = 0; i < 3; i++){
		for (int j = 0; j < 3; j++){
			if (board[i][j] == '-'){
				isFull = false;
				
			}
		}
	}
	return isFull;
}

//returns true if there is a win, false if not.
//this calls the other win check functions to check the entire board.
public boolean checkForWin(){
	return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
}

private boolean checkColumnsForWin() {
	// TODO Auto-generated method stub
	return false;
}

//loop thru rows and see if any are winners.
private boolean checkRowsForWin(){
	for (int i = 0; i < 3; i++){
		if ( checkRowCol(board[i][0], board[i][1], board[i][2]) == true ){
			
		}
	}
	return false;
}

//check the 2 diagonals to see if either is a winner. return true if either win
private boolean checkDiagonalsForWin(){
	return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
	
}

//Check to see if all three values are the same (and not empty) indicating a win.

 private boolean checkRowCol(char c1, char c2, char c3) {

     return ((c1 != '-') && (c1 == c2) && (c2 == c3));

 }
 
//Change player marks back and forth.

  public void changePlayer() {

      if (currentPlayerMark == 'x') {

          currentPlayerMark = 'o';

      }

      else {

          currentPlayerMark = 'x';

      }

  }

  // Places a mark at the cell specified by row and col with the mark of the current player.
  
      public boolean placeMark(int row, int col) {
 
           

          // Make sure that row and column are in bounds of the board.
          if ((row >= 0) && (row < 3)) {
  
              if ((col >= 0) && (col < 3)) {
 
                  if (board[row][col] == '-') {
  
                      board[row][col] = currentPlayerMark;
 
                      return true;

                  }
  
              }

          }
  
       
          return false;
  
      }
  
  }

