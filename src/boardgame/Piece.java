package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
	}
	
	// Somente classes dentro do mesmo pacote ou subclasses terão acesso ao getBoard()
	protected Board getBoard() {
		return board;
	}
	
}
