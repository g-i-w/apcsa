import java.util.*;

public class NumberGroup {

	private List<Integer> numbers;

	public NumberGroup () {
		numbers = new ArrayList<Integer>();
	}
	
	public void addNumber ( int number ) {
		numbers.add( number );
	}
	
	public boolean contains ( int test ) {
		for (int number : numbers) {
			if (number==test) return true;
		}
		return false;
	}

}