public class MakeMethods {

  static int changeString ( String s ) {

    int total = 0;

    for (int i=0; i<s.length(); i++) {
      String thisChar = s.substring( i, i+1 );
      if (thisChar.equals("1")) {
        System.out.println( "1!" );
        total++;
      }
    }

    return total;
  }


  public static void main (String[] args) {

    int theTotal = changeString( "abc100101011" );

    System.out.println( "I found " + theTotal + " 1s!" );

  }

}
