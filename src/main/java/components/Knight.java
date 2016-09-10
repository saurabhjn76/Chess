package components;

public class Knight extends Piece{
	public Knight(int x, int y, Color colr){
		super(x, y, colr);
		Board.setLocPiece(initLoc,colr);
	}

	public boolean validMove(Location destination){
		int x = curLoc.getX();
		int y = curLoc.getY();
		assert (x != destination.getX() && y != destination.getY()) : "Invalid Move";
		//Considering upper right corner of the Matrix as [0[0]
		if( x+2 == destination.getX() || x-2 == destination.getX() ){
			if( y-1 == destination.getY() || y+1 == destination.getY() ){
				if(color == Board.getLocPiece(destination))
					return false;
				move(destination);
				return true;
			}
			else 
				return false;
		}
		else if( y+2 == destination.getY() || y-2 == destination.getY() ){
			if( x-1 == destination.getX() || x+1 == destination.getX() ){
				if(color == Board.getLocPiece(destination))
					return false;
				move(destination);
				return true;
			}
			else
				return false;
		}
		else 
			return false;

		
	}

	public void move(Location validDest){
		Board.setLocPiece(validDest,color);
		
	}
}