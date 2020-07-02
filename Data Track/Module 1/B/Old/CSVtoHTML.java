public class CSVtoHTML {

  // states
  private static final int FILE_END_STATE = 1;
  private static final int LINE_START_STATE = 2;
  private static final int LINE_END_STATE = 3;
  private static final int DATA_STATE = 4;
  private static final int COMMA_STATE = 5;


  // special strings
  private static String TABLE_START = "<table>\n";
  private static String TABLE_END = "</table>\n";
  private static String ROW_START = "\t<tr>\n";
  private static String ROW_END = "\t</tr>\n";
  private static String DATA_START = "\t\t<td>";
  private static String DATA_END = "</td>\n";
  private static String BLANK_DATA = "\t\t<td></td>\n";


  // input logic
  public static int input () {
    try {
      return System.in.read();
    } catch (Exception e) {
      System.out.println( "ERROR: couldn't read from the standard input!" );
      return 0;
    }
  }

  // transition and output logic
  public static int nextState ( int state, int input ) {

    if (state == LINE_START_STATE) {
      if (input == ',') {
        System.out.print( ROW_START + BLANK_DATA );
        return COMMA_STATE;
      } else if (input == '\n') {
        System.out.print( ROW_START + ROW_END );
        return LINE_END_STATE;
      } else {
        System.out.print( ROW_START + DATA_START + (char)input );
        return DATA_STATE;
      }

    } else if (state == DATA_STATE) {
      if (input == ',') {
        System.out.print( DATA_END );
        return COMMA_STATE;
      } else if (input == '\n') {
        System.out.print( DATA_END + ROW_END );
        return LINE_END_STATE;
      } else {
        System.out.print( (char)input );
        return DATA_STATE;
      }

    } else if (state == COMMA_STATE) {
      if (input == ',') {
        System.out.print( BLANK_DATA );
        return COMMA_STATE;
      } else if (input == '\n') {
        System.out.print( BLANK_DATA + ROW_END );
        return LINE_END_STATE;
      } else {
        System.out.print( DATA_START + (char)input );
        return DATA_STATE;
      }

    } else if (state == LINE_END_STATE) {
      if (input == ',') {
        System.out.print( ROW_START + BLANK_DATA );
        return COMMA_STATE;
      } else if (input == '\n') {
        System.out.print( TABLE_END );
        return FILE_END_STATE;
      } else {
        System.out.print( ROW_START + DATA_START + (char)input );
        return DATA_STATE;
      }

    }

    return state; // otherwise just return the same state we're in
  }

  // logic loop
  public static void main (String[] args) {

    System.out.print( TABLE_START );

    int state = LINE_START_STATE;

    while (state != FILE_END_STATE) {
      // state transition and output
      state = nextState( state, input() );
    }

  }

}
