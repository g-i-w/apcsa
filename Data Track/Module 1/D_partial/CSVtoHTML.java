public class CSVtoHTML {

  // states
  private static final int LINE_START_STATE = 0;
  private static final int LINE_END_STATE = 1;
  private static final int DATA_STATE = 2;
  private static final int COMMA_STATE = 3;


  // special strings
  private static String ROW_START = "\t<tr>\n";
  private static String ROW_END = "\t</tr>\n";
  private static String DATA_START = "\t\t<td>";
  private static String DATA_END = "</td>\n";
  private static String BLANK_DATA = "\t\t<td></td>\n";
  private static String TABLE_START = "<table>\n";
  private static String TABLE_END = "</table>\n";


  // state variable
  private static int state = LINE_START_STATE;

  // input variable
  private static int input;


  // input logic
  public static boolean input () {
    try {
      input = System.in.read();
      if (input != -1) return true;
      else return false;
    } catch (Exception e) {
      System.out.println( "ERROR: couldn't read from the standard input!" );
      return false;
    }
  }


  // transition and output logic
  public static void transition () {

    // Add transition logic here
    //
    //
    //
    //
    //

  }


  // logic loop
  public static void main (String[] args) {

    System.out.print( TABLE_START );

    while (input()) {
      transition();
    }

    System.out.print( TABLE_END );

  }

}
