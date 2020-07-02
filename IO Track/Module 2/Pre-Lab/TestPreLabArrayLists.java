public class TestPreLabArrayLists {

  public static void main(String[] args) {

    PreLabArrayLists firstList = new PreLabArrayLists();
    PreLabArrayLists secondList = new PreLabArrayLists();

    firstList.addString( "this" );
    firstList.addString( "is" );
    firstList.addString( "fun!" );
    firstList.addInteger( 1 );
    firstList.addInteger( 2 );
    firstList.addDouble( 10.0 );
    firstList.addDouble( 20.0 );

    secondList.addString( "hello" );
    secondList.addString( "!!!" );
    secondList.addInteger( 3 );
    secondList.addInteger( 4 );
    secondList.addDouble( 30.0 );
    secondList.addDouble( 40.0 );

    double firstValues = firstList.getSumOfAllValues();
    String firstStrings = firstList.getAllStrings();

    double secondValues = secondList.getSumOfAllValues();
    String secondStrings = secondList.getAllStrings();

    System.out.println( firstValues );
    System.out.println( firstStrings );

    System.out.println( secondValues );
    System.out.println( secondStrings );

  }
}
