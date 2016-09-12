package components;
import java.lang.*;

public class Rook extends Piece{

	public Rook(int x, int y, Color colr){
		super(x, y, colr);
	}
	
	public boolean validMove(Location destination){
		int x = curLoc.getX();
		int y = curLoc.getY();
		int i;
		if(x == destination.getX() && y == destination.getY()){
			System.out.println("Cannot move from Current Location to Current Location.");
			return false;
		}

		//detecting if there is any obstacle in movement path
		if ( x == destination.getX() ){
			//move in horizontal direction
			if ( y < destination.getY() ){
				//go right
				for (i = x+1 ; i <= destination.getY() ; i++){
					Location tmpDest = new Location(x,i);
					if(Board.g