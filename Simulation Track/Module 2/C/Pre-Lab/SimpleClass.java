public class SimpleClass {

  // this variable lives only in the class (not in any object created from the class).
  private static int objectCount = 0;

  // instance varaibles
  private int myID;
  private int a;
  private int b;

  // constructor
  public SimpleClass () {
    /*
      - Assign objectCount to myID and then increment objectCount
      - MyID is an instance variable (only exists in an object or instance),
        but objectCount is static, so it only exists in the class.
      - Any change to a static variable is visible to all objects.
    */
    myID = objectCount++;
  }

  // constructor
  public SimpleClass ( int a ) {
    // Call the first constructor
    this();
    /*
      - If we want to use parameter variables with the same name as
        instance variables, then we can reference instance variables
        using the keyword "this" (refer)
    */
    this.a = a;
  }

  // constructor
  public SimpleClass ( int a, int b ) {
    // Call the first constructor
    this();
    this.a = a;
    this.b = b;
  }

  // get the value of a
  public int getA () {
    return a;
  }

  // get the value of b
  public int getB () {
    return b;
  }

  // return a String representing this object
  public String toString () {
    return "[ "+myID+" ]"; // convert int to String with the + operator
  }

}
