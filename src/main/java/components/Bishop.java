package components;
import java.lang.*;

public class Bishop extends Piece{

	public Bishop(int x, int y, Color colr){
		super(x, y, colr);
		Board.setLocPiece(initLoc,colr);
	}
	
	
	public boolean validMove(Location destination){
		int x = curLoc.getX();
		int y = curLoc.getY();
		
		
		if(x == destination.getX() && y == destination.getY()){
			System.out.println("Cannot move from Current Location to Current Location.");
			return false;
		}

		
		if(Math.abs(x - destination.getX()) == Math.abs(y - destination.getY())){

			//yet to check if there's a piece on the way.
			if(color == Board.getLocPiece(destination))
					return false;
			else
				return true;
		else 
			return false;
		}
		
	}


	@Override
	public void move(Location validDest){
		Board.setLocPiece(validDest,color);	
	}
}
