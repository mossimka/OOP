package chess;

public abstract class Piece {
    protected Position pos;
    public Piece(Position pos) {
        this.pos = pos;
    }
    public Position getPosition() {
        return pos;
    }
    public void setPosition(Position pos) {
        this.pos = pos;
    }
    
    protected boolean isRookMove(Position move) {
        return (move.getHor() == pos.getHor() && move.getVer() != pos.getVer())
            || (move.getHor() != pos.getHor() && move.getVer() == pos.getVer());
    }
    
    protected boolean isBishopMove(Position move) {
        return Math.abs(pos.getHor() - move.getHor()) == Math.abs(pos.getVer() - move.getVer());
    }
    
    public abstract boolean isLegalMove(Position move);
    
    public abstract String name();
}
