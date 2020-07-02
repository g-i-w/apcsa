public class Phrase {

	private String currentPhrase;
	
	public Phrase (String p) {
		currentPhrase = p;
	}
	
	public int[] findAllOccurances (String str) {
		int[] indices = new int[currentPhrase.length()]; // max possible
		int indexAt = currentPhrase.indexOf( str );
		int i = -1;
		while(indexAt != -1) {
			indices[++i] = indexAt;
			indexAt = currentPhrase.indexOf( str, indexAt+str.length() );
		}
		int[] newIndices = new int[i+1];
		for (i=0; i<newIndices.length; i++) {
			newIndices[i] = indices[i];
		}
		return newIndices;
	}
	
	public void replaceAllOccurances (String str, String repl) {
		int[] occurances = findAllOccurances(str);
		if (occurances == null) return;
		int dif = repl.length() - str.length();
		int correction = 0;
		for (int index : occurances) {
			int correctedIndex = index + correction;
			String firstPart = currentPhrase.substring(0, correctedIndex);
			String lastPart = currentPhrase.substring(correctedIndex + str.length(), currentPhrase.length());
			currentPhrase = firstPart + repl + lastPart;
			correction += dif;
		}
	}
	
	public String toString () {
		return currentPhrase;
	}
	
	public static void main (String[] args) {
		Phrase phrase1 = new Phrase("A cat ate.");
		/* for (int i : phrase1.findAllOccurances("ate"))
			System.out.print(i+",");
		System.out.println(); */
		phrase1.replaceAllOccurances("ate", "slept");
		System.out.println(phrase1);
		
		Phrase phrase2 = new Phrase("aaaa");
		phrase2.replaceAllOccurances("aa", "xx");
		System.out.println(phrase2);
		
		Phrase phrase3 = new Phrase("aaaa");
		phrase3.replaceAllOccurances("aa", "bbb");
		System.out.println(phrase3);
	}
	
}