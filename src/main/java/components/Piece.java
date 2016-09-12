package components;

public abstract class Piece {
	protected Location initLoc;
	protected Location curLoc;
	public abstract boolean validMove();
	public abstract void move();
	boolean status; // 1 is alive, 0 is dead.
	Color color;// 0 for white, 1 for black.

	Piece(int x,int y,Color colr) {
		this.color=colr;
		initLoc= new Location(x,y);
		curLoc = new Location(x,y);
		status =true;
	}
}
