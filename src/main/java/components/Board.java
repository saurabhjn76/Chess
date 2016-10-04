package components;

public class Board {
	//Defining a temporary Color matrix for storing info of Pieces on the board.
	//0 is No Piece, 1 is white piece, 2 is Black piece
	public static Piece[][] PieceStatus = new Piece[8][8];
	public static void setLocPiece(Piece pp,Location loc){
		PieceStatus[loc.getX()][loc.getY()] = pp;
	}

	public static Piece getLocPiece(Location loc){
		return PieceStatus[loc.getX()][loc.getY()];
	}
	
}
