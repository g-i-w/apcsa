import java.util.*;

public class SparseArray {

	private int numRows;
	private int numCols;
	private List<SparseArrayEntry> entries;
	
	public SparseArray (int[][] intArray) {
		entries = new ArrayList<SparseArrayEntry>();
		numRows=0;
		numCols=0;
		for (int row=0; row<intArray.length; row++) {
			if (row >= numRows) numRows = row+1;
			for (int col=0; col<intArray[row].length; col++) {
				if (col >= numCols) numCols = col+1;
				if (intArray[row][col] != 0) {
					entries.add( new SparseArrayEntry( row, col, intArray[row][col] ) );
				}
			}
		}
	}
	
	public int getValueAt(int row, int col) {
		for (SparseArrayEntry entry : entries) {
			if (entry.getRow()==row && entry.getCol()==col) {
				return entry.getValue();
			}
		}
		return 0;
	}
	
	
	public int[] serialize() {
		int[] serialized = new int[numRows*numCols];
		int i=0;
		for (int row=0; row<numRows; row++) {
			for (int col=0; col<numCols; col++) {
				serialized[i++] = getValueAt(row,col);
			}
		}
		return serialized;
	}
	
	public List<SparseArrayEntry> getEntries () {
		return entries;
	}
			
	public static void main (String[] args) {
		int[][] sparseArray = new int[][]{
			{0,0,0,0,0},
			{0,5,0,0,4},
			{1,0,0,0,0},
			{0,-9,0,0,0},
			{0,0,0,0,0}
		};
		SparseArray sa = new SparseArray( sparseArray );
		for (SparseArrayEntry entry : sa.getEntries()) {
			System.out.println( entry );
		}
		for (int serialInt : sa.serialize()) {
			System.out.print( serialInt + "," );
		}
		System.out.println();
	}

}