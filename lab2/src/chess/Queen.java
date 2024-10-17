package chess;

public class Queen extends Piece{
	public Queen(Position pos) {
        super(pos);
    }
	public boolean isLegalMove(Position move) {
		if(super.isBishopMove(move) || super.isRookMove(move)) {
			return true;
		}
		return false;
	}
	public String name() {
		return "Queen";
	}
}
