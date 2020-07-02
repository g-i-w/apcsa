public class TestCrossword {

	public static String printBoard ( Square[][] puzzle ) {
		String cwBoard = "";
		for (Square[] row : puzzle) {
			for (Square sq : row) {
				if (sq.isBlack()) {
					cwBoard += " __";
				} else {
					cwBoard += ( sq.getNum()<10 ? " 0"+sq.getNum() : " "+sq.getNum() );
				}
			}
			cwBoard += "\n";
		}
		return cwBoard;
	}

	public static void main (String[] args) {
		boolean[][] blackSquares = new boolean[][]{
			{ true, false, false, true, true, true, false, false, false },
			{ false, false, false, false, true, false, false, false, false },
			{ false, false, false, false, false, false, true, true, true },
			{ false, false, true, false, false, false, true, false, false },
			{ true, true, true, false, false, false, false, false, false },
			{ false, false, false, false, true, false, false, false, false },
			{ false, false, false, true, true, true, false, false, true }
		};
	
		Crossword crossword = new Crossword( blackSquares );
		
		System.out.println( printBoard(crossword.getPuzzle()) );
	}
	
}