package components;

public abstract class Piece {
	protected Location initLoc;
	protected Location curLoc;
	public abstract boolean validMove();
	public abstract void move();
	boolean status; // 1 is alive, 0 is dead.
	Color color;// 0 for white, 1 for black.
}
