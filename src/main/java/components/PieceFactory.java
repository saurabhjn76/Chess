package components;

public class PieceFactory {
	public Piece createPiece(PieceType pType,int x,int y,Color colr) {
		switch(pType) {
			case PieceType.PAWN: 	return new Pawn(x,y,colr);
					   	break;
			case PieceType.BISHOP: 	return new Bishop(x,y,colr);
						break;
			case PieceType.KING: 	return new King(x,y,colr);
					   	break;
			case PieceType.QUEEN: 	return new Queen(x,y,colr);
						break;
			case PieceType.KNIGHT: 	return new Knight(x,y,colr);
						break;
			case PieceType.ROOK:return new Rook(x,y,colr);
						break;
			default: return null;
		}
	}
}
