package components;

public abstract class Piece {
	protected Location initLoc;
	protected Location curLoc;
	public abstract boolean validMove();
	boolean status; // 1 is alive, 0 is dead.
	boolean color;// 0 for white, 1 for black.
}
