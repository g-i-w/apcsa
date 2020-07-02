public class TestStringHierarchy {

  public static StringHierarchy search ( StringHierarchy sh, String text ) {


    return
  }

  public static void main(String[] args) {

    StringHierarchy g1 = new StringHierarchy( "Grandpa 1" );
    StringHierarchy d1 = g1.select( "Dad 1-1" );
    d1.select( "Son 1-1-1" );

    System.out.println( g1 );

    g1
      .select( "Dad 1-1" )
        .select( "Son 1-1-2" )
          .attach( "unborn 1-1-2-1")
          .attach( "unborn 1-1-2-2")
          .attach( "unborn 1-1-2-3")
        .back()
        .attach( "Son 1-1-3" )
        .attach( "Son 1-1-4" )
        .select( "Son 1-1-5" )
        ;

    System.out.println( g1 );

  }

}
