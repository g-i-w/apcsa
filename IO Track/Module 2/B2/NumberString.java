public class NumberString {

  // instance variable
  private String theString;


  // constructor
  NumberString ( String s ) {
    // save a reference to the String object
    theString = s;
  }


  // constructor
  NumberString ( Double d ) {
    // create a String from the double
    theString = d.toString();
  }


  // method to create a Double object from the String object
  Double toDouble () {
    double primitiveDouble;
    try {
      // call a static method in the Double class
      primitiveDouble = Double.valueOf( theString );
    } catch (Exception e) {
      // otherwise the value is 0.0
      primitiveDouble = 0.0;
    }
    // create a new Double object from the primitive double value
    return new Double( primitiveDouble );
  }


  // return the String object
  String toString () {
    return theString;
  }

}
