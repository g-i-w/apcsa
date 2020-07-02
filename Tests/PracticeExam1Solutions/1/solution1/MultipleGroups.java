import java.util.*;

public class MultipleGroups extends NumberGroup {
	
	private List<NumberGroup> groupList;
	
	public MultipleGroups ( List<NumberGroup> groupList ) {
		super( new int[]{} ); // initialize parent class with empty list
		this.groupList = groupList;
	}
	
	public boolean contains ( int test ) {
		for (NumberGroup ng : groupList) {
			if (ng.contains(test)) return true;
		}
		return false;
	}
	
}