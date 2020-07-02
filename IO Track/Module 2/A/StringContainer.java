public class StringContainer {

  private String theStr;
  private int intValue;

  StringContainer ( String s ) {
    // save a reference to the String
    theStr = s;
    // try to create an integer value from the string
    try {
      intValue = Integer.valueOf( theStr );
    } catch (Exception e) {
      intValue = 0;
    }
  }

  int getInt () {
    return intValue;
  }

  String getStr () {
    return theStr;
  }

}
