public class GetArguments {

  public static boolean isInt (String unknownString) {
    for (int a=0; a<String.length(); a++) {
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


  public static void main (String[] args) {

    int lastInt = 1;

    if (args.length > 0) {
      for (int i=0; i<args.length; i++) {
        String argString = args[i];
        if (i>0 && args[i-1].equals("int") && isInt(argString)) {
          int intValue = Integer.valueOf( argString );
          intValue *= lastInt;
          lastInt = intValue;
          argString = String.valueOf( intValue );
          System.out.println( argString );
        } else {
          System.out.println( argString );
        }
      }
    } else {
      System.out.println("No arguments were passed!");
    }

  }
}
