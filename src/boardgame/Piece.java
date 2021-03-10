package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
//somente subclasses ou as dentro do mesmo pacote vão poder ter acesso
	protected Board getBoard() {
		return board;
	}

	
	
	
}
