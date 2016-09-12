package components;
import java.lang.*;

public class Pawn extends Piece{

	public Pawn(int x, int y, Color colr){
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