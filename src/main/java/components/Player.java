package components;

public class Player {
	public Color color;
	public Pawn pawn[];
	public Queen queen;
	public King king;
	public Bishop bishop[];
	public Knight knight[];
	public Rook rook[];

	public Player(Color color) {
		this.color = color;
		pawn = new pawn[8];
		PieceFactory peiceFactory = new PieceFactory();
		bishop = new bishop[2];
		knight = new knight[2];
		rook = new rook[2];
		int rank1,rank2; // for positioning of pieces
		switch(color) {
		case Color.WHITE: rank1=0;
				  rank2=1;
				 break;

		case Color.BLACK: rank1=7;
				  rank2=6;
				  break;
		}
		for(int i=0;i<8;i++) 
			pawn[i] = new pieceFactory.createPiece(PieceType.PAWN,i,rank2,color);
		bishop[0] = new pieceFactory.createPiece(PieceType.CAMEL,2,rank1,color);
		bishop[1] = new pieceFactory.createPiece(PieceType.CAMEL,5,rank1,color);
		knight[0] = new pieceFactory.createPiece(PieceType.HORSE,1,rank1,color);
		knight[1] = new pieceFactory.createPiece(PieceType.HORSE,6,rank1,color);
		rook[0] = new pieceFactory.createPiece(PieceType.ELEPHANT,0,rank1,color);
		rook[1] = new pieceFactory.createPiece(PieceType.ELEPHANT,7,rank1,color);
		king = new pieceFactory.createPiece(PieceType.KING,4,rank1,color);
		queen = new pieceFactory.createPiece(PieceType.QUEEN,3,rank1,color);
	}
}
