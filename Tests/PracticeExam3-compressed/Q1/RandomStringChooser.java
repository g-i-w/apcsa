import java.util.*;

public class RandomStringChooser {

	List<String> randomList;
	String[] randomArray;
	
	public RandomStringChooser (String[] inputArray) {
		randomList = new ArrayList<String>();
		randomArray = new String[inputArray.length];
		for (String str : inputArray) {
			randomList.add(str);
		}
		int i=0;
		while (randomList.size() > 0) {
			int randomIndex = (int)(Math.random()*randomList.size());
			randomArray[i++] = randomList.remove(randomIndex);
		}
	}
	
	public String[] getRandomSequence () {
		return randomArray;
	}
	
}