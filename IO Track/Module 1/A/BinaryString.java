public class BinaryString {

  public static void main (String[] args) {

    
    String aStringOfBinaryDigits = "0001100101";




    // variables to hold place value and the total
    int digitValue = 1;
    int total = 0;

    // loop through each character (backwards) and add the
    for (int i=unknownString.length()-1; i>=0; i--) {

      // string variable to hold each character
      String unknownChar = unknownString.substring(i, i+1);

      // check for anything other than a 1 or 0
      if ( !unknownChar.equals("0") && !unknownChar.equals("1") ) {
        return 0;
      }

      // add the place value if there is a 1
      if ( unknownChar.equals("1") ) {
        total += digitValue;
      }

      // increase the place value
      digitValue *= 2;

    }

    // print the total
    System.out.println( total );

  }
}
