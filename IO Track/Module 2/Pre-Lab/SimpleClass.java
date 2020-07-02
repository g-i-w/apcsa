public class SimpleClass {

  // static variable
  private static int iAmStatic = 100;

  // instance variables
  private int firstInt;
  private int secondInt;

  // constuctor method
  public SimpleClass ( int a, int b, int c ) {
    firstInt = a;
    secondInt = b;
    iAmStatic = c;
  }

  public int getFirst () {
    return firstInt;
  }

  public int getSecond () {
    return secondInt;
  }

  public static int getStatic () {
    return iAmStatic;
  }

}
