public class TestPreLabStringList {

  public static void main(String[] args) {

    PreLabStringList s1 = new PreLabStringList();
    PreLabStringList s2 = new PreLabStringList();

    s1.addStringContainer( "hello!" );
    s1.addStringContainer( "100" );
    s1.addStringContainer( "250" );
    s1.addStringContainer( "350" );
    s1.addStringContainer( "800" );

    s2.addStringContainer( "25" );
    s2.addStringContainer( "35" );
    s2.addStringContainer( "45" );
    s2.addStringContainer( "55" );

    System.out.println( s1.average() );
    System.out.println( s1 ); // automatically calls the .toString() method
    
    System.out.println( s2.average() );
    System.out.println( s2 ); // automatically calls the .toString() method

  }

}
