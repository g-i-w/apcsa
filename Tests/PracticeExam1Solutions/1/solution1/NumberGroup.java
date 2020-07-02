public class NumberGroup {

	private int[] numbers;

	public NumberGroup ( int[] numbers ) {
		this.numbers = numbers;
	}
	
	public boolean contains ( int test ) {
		for (int number : numbers) {
			if (number==test) return true;
		}
		return false;
	}

}