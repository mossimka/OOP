package chess;

public class Bishop extends Piece{
	public Bishop(Position pos) {
		super(pos);
	}
	public boolean isLegalMove(Position move) {
		if(super.isBishopMove(move)) {
			return true;
		}
		return false;
	}
	public String name() {
		return "Bishop";
	}
}
