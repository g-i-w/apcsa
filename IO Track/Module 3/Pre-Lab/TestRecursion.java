public class TestRecursion {

  public static void countTo100 ( int a ) {
    if (a == 100) {
      System.out.println( "Counted to 100!" );
    } else {
      System.out.println( a );
      countTo100( ++a );
    }
  }

  public static void doubleStrings ( String s ) {
    if (s.length() < 100) {
      System.out.println( s );
      doubleStrings( s + s );
    }
  }

  public static int unknown( int call, int max ) {
    if (call++ < max)
      return unknown( call, max ) + unknown( call, max );
    else
      return 1;
  }

  public static void main(String[] args) throws Exception {
    countTo100( 0 );
    doubleStrings( "#" );
    System.out.println( unknown( 0, Integer.valueOf(args[0]) ) );
  }
}
