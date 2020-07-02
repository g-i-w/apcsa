public class RandomLetterChooser extends RandomStringChooser {

	public RandomLetterChooser (String str) {
		super( getSingleLetters(str) );
	}
	
	public static String[] getSingleLetters (String str) {
		String[] letters = new String[str.length()];
		for (int i=0; i<str.length(); i++) {
			letters[i] = str.substring(i, i+1);
		}
		return letters;
	}
	
	public static void main (String[] args) {
		RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
		String[] strArray = letterChooser.getRandomSequence();
		for (int k=0; k<strArray.length; k++) {
			System.out.print(strArray[k]);
		}
		System.out.println();
	}
	
}