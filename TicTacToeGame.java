package tictactoe;

public class TicTacToeGame {
	static char[] board;
	
	public static void createBoard() {
		for (int i = 0; i <= 9; i++) {
            board[i]= ' ';
        }
	}

	public static void main(String[] args) {
		char[] board = new char[10];
		
		createBoard();
	}
}
