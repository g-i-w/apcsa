public class StringContainer {

  private String theStr;
  private int intValue;
  private double doubleValue;

  StringContainer ( String s ) {
    // save a reference to the String
    theStr = s;
    // try to create a double value from the string
    try {
      doubleValue = Double.valueOf( theStr );
    } catch (Exception e) {
      doubleValue = 0.0;
    }
    // initialize the intValue variable
    intValue = (int) doubleValue;
  }

  int getInt () {
    return intValue;
  }

  double getDouble () {
    return doubleValue;
  }

  String getStr () {
    return theStr;
  }

}
