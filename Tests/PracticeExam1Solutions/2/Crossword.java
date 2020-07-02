public class Crossword {

	private Square[][] puzzle;

	public Crossword (boolean[][] blackSquares) {
		puzzle = new Square[blackSquares.length][blackSquares[0].length];
		int nextLabel = 1;
		for (int r=0; r<blackSquares.length; r++) {
			for (int c=0; c<blackSquares[r].length; c++) {
				int label = 0;
				if (toBeLabeled( r, c, blackSquares )) {
					label = nextLabel++;
				}
				puzzle[r][c] = new Square( blackSquares[r][c], label );
			}
		}
	}
	
	private boolean toBeLabeled ( int r, int c, boolean[][] blackSquares ) {
		if (
			! blackSquares[r][c] && (
				c==0 ||
				r==0 ||
				blackSquares[r][c-1] ||
				blackSquares[r-1][c]
			)
		) {
			return true;
		} else {
			return false;
		}
	}
	
	public Square[][] getPuzzle () {
		return puzzle;
	}
		
}