package components;
import java.lang.*;

public class Bishop extends Piece{

	public Bishop(int x, int y, Color colr){
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