package components;

public class Board {
	//Defining a temporary Color matrix for storing info of Pieces on the board.
	//0 is No Piece, 1 is white piece, 2 is Black piece
	private static Color[][] boardStatus = new Color[8][8];
	public static void setLocPiece(Location loc,Color color){
		boardStatus[loc.getX()][loc.getY()] = color;
	}

	public static Color getLocPiece(Location loc){
		return boardStatus[loc.getX()][loc.getY()];
	}
}
