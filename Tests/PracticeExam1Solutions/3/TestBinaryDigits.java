import java.util.*;

public class TestBinaryDigits {

	private static String digitsInOrder ( List<Integer> list ) {
		String digitStr = "";
		for (int i=list.size()-1; i>=0; i--) {
			digitStr += list.get(i);
		}
		return digitStr;
	}
	
	private static void testBinaryDigitsValue ( int num ) {
		BinaryDigits bg = new BinaryDigits( num );
		System.out.println(
			num + " " +
			digitsInOrder( bg.getDigits() ) + " " +
			bg.hasOnesGroup()
		);
	}
			

	public static void main (String[] args) {
		
		testBinaryDigitsValue( 14 );
		testBinaryDigitsValue( 55 );
		testBinaryDigitsValue( 107 );
		testBinaryDigitsValue( 21 );
		testBinaryDigitsValue( 7 );
	
	}
	
}
