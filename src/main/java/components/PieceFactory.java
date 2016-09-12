package components;

public class PieceFactory {

	public Piece createPiece(PieceType pType,int x,int y,Color colr) {
		switch(pType) {
			case PAWN: 	return new Pawn(x,y,colr);
					   	
			case BISHOP: 	return new Bishop(x,y,colr);
						
			case KING: 	return new King(x,y,colr);
					   	
			case QUEEN: 	return new Queen(x,y,colr);
						
			case KNIGHT: 	return new Knight(x,y,colr);
						
			case ROOK:return new Rook(x,y,colr);
						
			default: return null;
		}
	}
}
