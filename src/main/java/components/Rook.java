package components;
import java.lang.*;

public class Rook extends Piece{

	public Rook(int x, int y, Color colr){
		super(x, y, colr);
		//Board.setLocPiece(initLoc,colr);
	}
	
	
	@Override
	public boolean validMove(Location destination){
		int x = curLoc.getX();
		int y = curLoc.getY();
		int i;
		if(x == destination.getX() && y == destination.getY()){
			System.out.println("Cannot move from Current Location to Current Location.");
			return false;
		}

		//detecting if there is any obstacle in movement path
		if ( x == destination.getX()){
			// move horizontally

			if ( y < destination.getY()){
				//moving right
				for(i = y+1 ; i < destination.getY(); i++){
					Location tmpDest = new Location(x,i);
					if(Board.getLocPieceColor(tmpDest) != null)
						return false;
				}
				if(color == Board.getLocPieceColor(destination))
					return false;
				move(destination);
				return true;
			}

			else{
				//moving left
				for(i = y-1 ; i> destination.getY(); --i){
					Location tmpDest = new Location(x,i);
					if( Board.getLocPieceColor(tmpDest) != null)
						return false;
				}
				if(color == Board.getLocPieceColor(destination))
					return false;
				move(destination);
				return true;
			}
		}

		else if ( y == destination.getY()){

			//move vertically

			if ( x < destination.getX()){
				//moving up
				for(i = x+1 ; i < destination.getX(); i++){
					Location tmpDest = new Location(i,y);
					if(Board.getLocPieceColor(tmpDest) != null)
						return false;
				}
				if(color == Board.getLocPieceColor(destination))
					return false;
				move(destination);
				return true;
			}

			else{
				//moving down
				for(i = x-1 ; i> destination.getX(); --i){
					Location tmpDest = new Location(i,y);
					if( Board.getLocPieceColor(tmpDest) != null)
						return false;
				}
				if(color == Board.getLocPieceColor(destination))
					return false;
				move(destination);
				return true;
			}
		}

		else
			return false;

	}

	@Override
	public void move(Location validDest){
		//Board.setLocPiece(validDest,color);
	}
}