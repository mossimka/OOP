package chess;

public class Pawn extends Piece{
	public Pawn(Position pos) {
		super(pos);
	}
	public boolean isLegalMove(Position move) {
		int verMove = move.getVer()-pos.getVer();
		int horMove = Math.abs(move.getHor()-pos.getHor());
		//white
		if((verMove == 1 && horMove == 0) || (pos.getVer() == 2 && verMove == 2 && horMove == 0)) {
			System.out.print("If white ");
			return true;
		}
		if(verMove == 1 && horMove == 1) {
			System.out.print("If white and trying to take some piece ");
			return true;
		}
		//black
		if((verMove == -1 && horMove == 0) || (pos.getVer() == 7 && verMove == -2 && horMove == 0)) {
			System.out.print("If black ");
			return true;
		}
		if(verMove == -1 && horMove == 1) {
			System.out.print("If black and trying to take some piece ");
			return true;
		}
		
		return false;
	}
	public String name() {
		return "Pawn";
	}
}
