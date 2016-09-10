package components;
import java.lang.*;

public class Rook extends Piece{

	public Rook(int x, int y, Color colr){
		super(x, y, colr);
	}
	
	public boolean validMove(Location destination){
		int x = curLoc.getX();
		int y = curLoc.getY();
		assert (x != destination.getX() && y != destination.getY()) : "Invalid Move";

		
		if(Math.abs(x - destination.getX()) > 0 && Math.abs(y - destination.getY()) > 0)
			return false;
		if(color == Board.getLocPiece(destination))
			return false;
		
		return true;
		//Doing nothing
	}

	public void move(Location validDest){
		Board.setLocPiece(validDest,color);
		
	}
}
