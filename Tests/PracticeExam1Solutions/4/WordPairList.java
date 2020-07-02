import java.util.*;

public class WordPairList {

	private ArrayList<WordPair> allPairs;
	
	public WordPairList ( String[] words ) {
		allPairs = new ArrayList<WordPair>();
		for (int a=0; a<words.length-1; a++) {
			for (int b=a+1; b<words.length; b++) {
				allPairs.add(
					new WordPair( words[a], words[b] )
				);
			}
		}
	}
	
	public ArrayList<String> repeatedWords () {
		ArrayList<String> repeated = new ArrayList<>();
		for (WordPair wp : allPairs) {
			if (wp.getFirst().equals(wp.getSecond())) {
				repeated.add( wp.getFirst() );
			}
		}
		return repeated;
	}
	
	public ArrayList<WordPair> getAllPairs () {
		return allPairs;
	}
	
}