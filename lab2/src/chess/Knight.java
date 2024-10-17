package chess;

public class Knight extends Piece{
	public Knight(Position pos) {
		super(pos);
	}
	public boolean isLegalMove(Position move) {
		if(((Math.abs(move.getHor()-pos.getHor()) == 2) && (Math.abs(move.getVer()-pos.getVer()) == 1)) ||
				((Math.abs(move.getHor()-pos.getHor()) == 1) && (Math.abs(move.getVer()-pos.getVer()) == 2))) {
			return true;
		}
		return false;
	}
	public String name() {
		return "Knight";
	}
}
