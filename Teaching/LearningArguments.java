public class LearningArguments {


  static int binaryValue( String s ) {

    int total = 0;

    for( int i=s.length()-1; i>=0; i-- ) {
      String oneChar = s.substring(i,i+1);
      if (oneChar.equals("1")) {
        total = total + 1;
        
      }
    }

    return total;

  }


  public static void main( String[] args ) {

    for (int i=0; i<args.length; i++) {
      System.out.println( binaryValue( args[i] ) );
    }


  }


}
