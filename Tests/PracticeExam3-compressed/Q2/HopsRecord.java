import java.util.*;

public class HopsRecord {

	private int hopCount;
	private int hopSum;
	private boolean success;
	private List<Integer> hopList;
	
	public HopsRecord () {
		hopList = new ArrayList<Integer>();
		hopCount = 0;
		hopSum = 0;
	}
	
	public void addHop (int hop) {
		hopCount++;
		hopSum += hop;
		hopList.add(hop);
	}
	
	public int getSum () {
		return hopSum;
	}
	
	public int getCount () {
		return hopCount;
	}
	
	public void setSuccess (boolean success) {
		this.success = success;
	}
	
	public String toString () {
		String output = "count: "+hopCount+", sum: "+hopSum+", (";
		for (int i : hopList) output += i+" ";
		return output+"), "+success;
	}
	
}