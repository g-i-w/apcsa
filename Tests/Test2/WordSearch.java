import java.util.*;

public class WordSearch
	{
	// The list of words.
	private ArrayList<String> wordFragments;
	
	
	/** Constructs a WordSearch object as described in part (a).
	*/
	public WordSearch(String word) {
		wordFragments = new ArrayList<String>();
		for (int i=0; i<word.length(); i++) {
			wordFragments.add( word.substring(0,i+1) );
		}
	}
	
	
	/** Returns true if String word is found
	* in wordFragments.
	*/
	public boolean isSimilar(String word) {
		for (String fragment : wordFragments) {
			if (word.equals(fragment)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	// method to return list of wordFragments (for testing)
	public List<String> getFragments () {
		return wordFragments;
	}
	
	// main method to test this class
	public static void main (String[] args) {
		WordSearch ws = new WordSearch("java");
		for (String str : ws.getFragments()) System.out.println( str );
		System.out.println( ws.isSimilar("ja") );
	}
		
}