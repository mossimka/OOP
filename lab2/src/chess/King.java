package chess;

public class King extends Piece{
	public King(Position pos) {
		super(pos);
	};
	public boolean isLegalMove(Position move) {
		if(Math.abs(pos.getHor() - move.getHor()) <= 1 && Math.abs(pos.getVer() - move.getVer()) <= 1) {
			return true;
		}
		return false;
	}
	public String name() {
		return "King";
	}
}
