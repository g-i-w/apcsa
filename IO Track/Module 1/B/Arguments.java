public class Arguments {

  public static int binaryValue ( String unknownString ) {
    int digitValue = 1;
    int total = 0;
    for (int i=unknownString.length()-1; i>=0; i--) {

      String unknownChar = unknownString.substring(i, i+1);

      if ( !unknownChar.equals("0") && !unknownChar.equals("1") ) {
        return 0;
      }
      if ( unknownChar.equals("1") ) {
        total += digitValue;
      }
      digitValue *= 2;
    }
    return total;
  }

  public static void main (String[] args) {

    // check to see if there are any command line arguments
    if (args.length > 0) {
      // loop through the command line arguments
      int i = 0;
      while (i < args.length) {
        System.out.println( binaryValue(args[i]) );
        i++;
      }
    } else {
      // if there are no arguments, print a message
      System.out.println("No arguments were passed!");
    }

  }
}
