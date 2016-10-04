package components;

public class Board {
	//Defining a temporary Color matrix for storing info of Pieces on the board.
	//0 is No Piece, 1 is white piece, 2 is Black piece
	private static Piece[][] boardStatus = new Piece[8][8];
	public static void setLocPiece(Location loc,Piece piece){
		boardStatus[loc.getX()][loc.getY()] = piece;
	}

	public static Color getLocPieceColor(Location loc){
		return boardStatus[loc.getX()][loc.getY()].color;
	}

	public static Piece getLocPiece(Location loc){
		return boardStatus[loc.getX()][loc.getY()];
	}
	
}
