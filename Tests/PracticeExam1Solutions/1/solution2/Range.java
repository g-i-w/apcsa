public class Range extends NumberGroup {

	public Range ( int min, int max ) {
		for (int number=min; number<=max; number++) {
			addNumber( number );
		}
	}
	
}