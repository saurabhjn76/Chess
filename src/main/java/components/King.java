package components;
import java.lang.*;

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