// create a public class named PreLabStringContainer
______ _______ ________________ {

  // define a private String variable and a private int variable
  ________ String _________;
  ________ int _________;

  // complete the constructor method to initialize the private variables
  public _____________ ( String s ) {
    // initialize the String variable
    _________ = s;

    try {
      // initialize the int variable with the numerical value of the string
      _______ = Integer.valueOf( _______ );
    } catch (Exception e) {
      // or initialize to zero if an Exception is thrown
      _______ = 0;
    }
  }

  // complete the public method to return the String object
  _______ String __________ () {
    return __________;
  }

  // complete the public method to return the integer value
  _______ int __________ () {
    return __________;
  }

}
