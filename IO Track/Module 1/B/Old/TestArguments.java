public class TestArguments {
  public static void main (String[] args) {

    Arguments commaSeparated = new Arguments( args, "," );
    Arguments tildeSeparated = new Arguments( args, " ~ " );

    commaSeparated.printArgs();
    tildeSeparated.printArgs();

    commaSeparated.setDelimiter( ",,," );
    commaSeparated.printArgs();
    commaSeparated.setMultiplier( 111 );
    commaSeparated.printArgs();

  }

}
