import java.util.*;

public class TestNumberGroups {

	public static void main ( String[] args ) {
		NumberGroup ng0 = new NumberGroup();
		ng0.addNumber(0);
		ng0.addNumber(1);
		ng0.addNumber(2);
		ng0.addNumber(3);
		NumberGroup ng1 = new NumberGroup();
		ng1.addNumber(11);
		ng1.addNumber(21);
		ng1.addNumber(31);
		NumberGroup ng2 = new NumberGroup();
		ng2.addNumber(30);
		ng2.addNumber(31);
		ng2.addNumber(32);
		
		Range r = new Range( 80, 90 );
		
		List<NumberGroup> ngList = new ArrayList<>();
		ngList.add( ng0 );
		ngList.add( ng1 );
		ngList.add( ng2 );
		MultipleGroups mg = new MultipleGroups( ngList );
		
		System.out.println( "Testing NumberGroup class" );
		System.out.println( "ng0 contains 2: " + ng0.contains(2) );
		System.out.println( "ng1 contains 31: " + ng1.contains(31) );
		System.out.println( "ng2 contains 12: " + ng2.contains(12) );
		
		System.out.println( "\nTesting Range class" );
		System.out.println( "r contains 85: " + r.contains(85) );
		
		System.out.println( "\nTesting MultipleGroups class" );
		System.out.println( "mg contains 21: " + mg.contains(21) );
		System.out.println( "mg contains 22: " + mg.contains(22) );
		
	}

}