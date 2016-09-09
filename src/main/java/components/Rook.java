package components;

public class Rook extends Piece{
	public Rook(int x, int y, int colr){
		super();
		super.initLoc = new Location(x,y);
		super.curLoc = new Location(x,y);
		super.status = true;
		super.color = colr;
		
	}

	public boolean validMove(){
		return true;
		//Doing nothing
	}
}