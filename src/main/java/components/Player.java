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
		pawn = new Pawn[8];
		bishop = new Bishop[2];
		knight = new Knight[2];
		rook = new Rook[2];
		initialize();
	}

	public void initialize() {
		//PieceFactory pieceFactory = new PieceFactory();
		int rank1=0,rank2=0; // for positioning of pieces
		switch(color) {
		case WHITE: rank1=0;
				  rank2=1;
				 break;

		case BLACK: rank1=7;
				  rank2=6;
				  break;
		}
		for(int i=0;i<8;i++) 
			pawn[i] = (Pawn) new PieceFactory().createPiece(PieceType.PAWN,i,rank2,color);
		bishop[0] = (Bishop) new PieceFactory().createPiece(PieceType.BISHOP,2,rank1,color);
		Board.setLocPiece(bishop[0],bishop[0].curLoc);
		bishop[1] = (Bishop) new PieceFactory().createPiece(PieceType.BISHOP,5,rank1,color);
		knight[0] = (Knight) new PieceFactory().createPiece(PieceType.KNIGHT,1,rank1,color);
		knight[1] = (Knight) new PieceFactory().createPiece(PieceType.KNIGHT,6,rank1,color);
		rook[0] = (Rook) new PieceFactory().createPiece(PieceType.ROOK,0,rank1,color);
		rook[1] = (Rook)  new PieceFactory().createPiece(PieceType.ROOK,7,rank1,color);
		king = (King) new PieceFactory().createPiece(PieceType.KING,4,rank1,color);
		queen = (Queen) new PieceFactory().createPiece(PieceType.QUEEN,3,rank1,color);
	}
}
