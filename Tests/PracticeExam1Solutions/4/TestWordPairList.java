import java.util.*;

public class TestWordPairList {

	public static void main (String[] args) {
	
		WordPairList wpl = new WordPairList(
			new String[]{ "the", "red", "fox", "the", "red" }
		);
		
		for (WordPair wp : wpl.getAllPairs()) {
			System.out.println( "("+wp.getFirst()+","+wp.getSecond()+")" );
		}
		
		for (String str : wpl.repeatedWords()) {
			System.out.println( str );
		}
		
	}

}