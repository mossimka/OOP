package chess;

public class Rook extends Piece{
	public Rook(Position pos) {
		super(pos);
	}
	public boolean isLegalMove(Position move) {
		if(super.isRookMove(move)) {
			return true;
		}
		return false;
	}
	public String name() {
		return "Rook";
	}
}
