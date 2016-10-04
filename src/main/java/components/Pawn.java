package components;
import java.lang.*;

public class Pawn extends Piece{

	public Pawn(int x, int y, Color colr){
		super(x, y, colr);
		//Board.setLocPiece(initLoc,colr);
	}
	
	@Override
	public boolean validMove(Location destination){
		int x = curLoc.getX();
		int y = curLoc.getY();

		if(x == destination.getX() && y == destination.getY()){
			System.out.println("Cannot move from Current Location to Current Location.");
			return false;
		}


		// If the pawn is moving in its own vertical line,
		if ( x == destination.getX()){
			//and this is its first move,
			if (x == initLoc.getX() && y == initLoc.getY()){
				//it can move upto 2 positions
				if( destination.getY() == y+1 || destination.getY() == y+2){

					//provided there is no obstacle on its path
					for(int i = y+1 ; i <= y+2; i++){
					Location tmpDest = new Location(x,i);
					if(Board.getLocPieceColor(tmpDest) != null)
						return false;
					}

					move(destination);
					return true;
				}

				else
					return false;

			}
			// If pawn is not at init position, it can move only 1 position
			else if ( Board.getLocPieceColor(destination) == null && destination.getY() == y+1 ){
				move(destination);
				return true;
			}

			else 
				return false; 
		}

		//A pawn can kill a piece of other player by moving diagonally by 1 step

		else if( destination.getX() == x+1 || destination.getX() == x-1){
			if( destination.getY() == y+1 ){
				if( Board.getLocPieceColor(destination) != null && color != Board.getLocPieceColor(destination) ){

					move(destination);
					return true;
				}
				else
					return false;
			}
			else
				return false;
		}

		else 
			return false;


	}

	@Override
	public void move(Location validDest){
		//Board.setLocPiece(validDest,color);
		return ;
		
	}
}
