package components;
import java.lang.*;

<<<<<<< HEAD
public class King extends Piece {
	public King(int x, int y, Color colr){
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
		if( Math.abs(x -destination.getX())<=1 && Math.abs(y -destination.getY()<=1) ){
			if(color == Board.getLocPiece(destination))
					return false;
			move(destination);
			return true;
			
		}
		else 
			return false;		
	}

	public void move(Location validDest){
		Board.setLocPiece(validDest,color);
		
	}
}
	
=======
public class King extends Piece{

	public King(int x, int y, Color colr){
		super(x, y, colr);
	}
	
	@Override
	public boolean validMove(Location destination){
		//TODO:
		return true;
	}

	@Override
	public void move(Location validDest){
		//TODO:
		return ;
	}
}
>>>>>>> 4f2dd3553689656056891732e75baa6438662c77
