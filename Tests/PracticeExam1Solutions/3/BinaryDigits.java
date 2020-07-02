import java.util.*;

public class BinaryDigits {

	private ArrayList<Integer> digitList;
	
	public BinaryDigits ( int num ) {
		digitList = new ArrayList<Integer>();
		while(true) {
			digitList.add( num % 2 ); // least significant digit is first
			num /= 2;
			if (num < 1) break;
		}
	}
	
	public boolean hasOnesGroup () {
		for (int i=0; i<digitList.size()-2; i++) {
			if (
				digitList.get(i).intValue()==1 &&
				digitList.get(i+1).intValue()==1 &&
				digitList.get(i+2).intValue()==1
			) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Integer> getDigits () {
		return digitList;
	}
	
}