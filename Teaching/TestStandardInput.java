public class TestStandardInput {

  static boolean[] myArray = new boolean[7];


  public static void main(String[] args) throws Exception {

    for (int i=0; i<myArray.length; i++) {
      int inputValue = System.in.read();
      if (inputValue == '\n') break;
      if (inputValue == '1') {
        myArray[i] = true;
      }
    }

    if (myArray[2]) {
      System.out.println( "true at position 2!");
    }

    for (int i=0; i<myArray.length; i++ ) {
      System.out.println( myArray[i] );
    }

  }

}
