public class Arguments {

  // data structure
  String[] arguments;
  String delimiter;
  int multiplier;

  // constructor
  public Arguments ( String[] args, String d ) {
    arguments = args;
    delimiter = d;
    multiplier = 1;
  }

  public void printArgs () {
    if (arguments.length > 0) {
      // loop through the remaining arguments
      for (int i=0; i < arguments.length; i++) {
        String argString = arguments[i];
        if ( isInt(argString) ) {
          int intValue = Integer.valueOf(argString);
          intValue *= multiplier;
          argString = String.valueOf(intValue);
        }
        if (i != 0) System.out.print( delimiter );
        System.out.print( argString );
      }
      // print next line char
      System.out.println();
    } else {
      // if arguments.length is 0...
      System.out.println("No arguments were passed!");
    }
  }

  public void setDelimiter ( String newDel ) {
    delimiter = newDel;
  }

  public void setMultiplier ( int a ) {
    multiplier = a;
  }

  public boolean isInt ( String unknownString ) {
    for (int a=0; a<unknownString.length(); a++) {
      String unknownChar = unknownString.substring(a, a+1);
      if (
        !unknownChar.equals("0") &&
        !unknownChar.equals("1") &&
        !unknownChar.equals("2") &&
        !unknownChar.equals("3") &&
        !unknownChar.equals("4") &&
        !unknownChar.equals("5") &&
        !unknownChar.equals("6") &&
        !unknownChar.equals("7") &&
        !unknownChar.equals("8") &&
        !unknownChar.equals("9")
      ) {
        return false;
      }
    }
    return true;
  }



}
