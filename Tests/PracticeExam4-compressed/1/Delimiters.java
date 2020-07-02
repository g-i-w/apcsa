import java.util.*;

public class Delimiters {

	private String openDel;
	private String closeDel;
	private String[] tokens;
	
	public Delimiters (String o, String c, String[] t) {
		openDel = o;
		closeDel = c;
		tokens = t;
	}
	
	public List<Integer> precedenceRank () {
		int rank = 0;
		List<Integer> precedence = new ArrayList<Integer>();
		for (String token : tokens) {
			if (token.equals(openDel)) {
				rank++;
			} else if (token.equals(closeDel)) {
				rank--;
			}
			precedence.add( rank );
		}
		return precedence;
	}
	
	public List<String> evaluateFirst () {
		int highestRank = 0;
		List<Integer> precedence = precedenceRank();
		List<String> first = new ArrayList<String>();
		for (int rank : precedence) {
			if (rank > highestRank) {
				highestRank = rank;
			}
		}
		for (int i=0; i<precedence.size(); i++) {
			if (
				precedence.get(i) == highestRank &&
				!tokens[i].equals(openDel) &&
				!tokens[i].equals(closeDel)
			) {
				first.add( tokens[i] );
			}
		}
		return first;
	}
	
	public String toString () {
		String output = "";
		output += "Precedence:\n";
		int i = 0;
		for (int rank : precedenceRank())
			output += rank + ": " + tokens[i++] + "\n";
		output += "Evaluate first:\n";
		for (String token : evaluateFirst())
			output += token + "\n";
		return output;
	}
	
	public static void main (String[] args) {
		Delimiters del1 = new Delimiters( "(", ")", new String[]{
			"a+",
			"(",
			"(",
			"x+y",
			")",
			"*b",
			")"
		});
		Delimiters del2 = new Delimiters( "<q>", "</q>", new String[]{
			"aa",
			"<q>",
			"bb",
			"</q>",
			"cc",
			"<q>",
			"dd",
			"</q>"
		});
		System.out.println( del1 );
		System.out.println( del2 );
	}
	
}
			