public class PrintPracticeArrays2D {

  private static void printArray1D ( SimpleClass[] array1D) {
    for (SimpleClass sc : array1D) {
      System.out.print( sc );
    }
    System.out.println();
  }

  private static void printArray2D ( SimpleClass[][] array2D ) {
    for (SimpleClass[] array1D : array2D) {
      for (SimpleClass sc : array1D) {
        System.out.print( sc );
      }
      System.out.println();
    }
  }

  private static void printAll ( PracticeArrays2D paObject ) {
    System.out.println( "---\n---\n1D array:" );
    printArray1D( paObject.getArray1D() );
    System.out.println( "---\n1D array (first index of 2D array):" );
    printArray1D( paObject.getArray2Dchild( 0 ) );
    System.out.println( "---\n2D array:" );
    printArray2D( paObject.getArray2D() );
  }


  public static void main(String[] args) {

    PracticeArrays2D p1 = new PracticeArrays2D( 10, 5 );
    p1.fillArray1D();
    p1.fillArray2D();
    PracticeArrays2D p2 = new PracticeArrays2D( 10 );
    p2.fillArray1D();
    p2.fillArray2DnullCheck();

    printAll( p1 );
    printAll( p2 );

  }

}
