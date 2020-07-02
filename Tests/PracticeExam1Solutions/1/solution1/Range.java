public class Range extends NumberGroup {

	private static int[] range ( int min, int max ) {
		int[] numbers = new int[max-min+1];
		for (int i=0; i<numbers.length; i++) {
			numbers[i] = min++;
		}
		return numbers;
	}
	
	public Range ( int min, int max ) {
		super( range(min,max) );
	}
	
}