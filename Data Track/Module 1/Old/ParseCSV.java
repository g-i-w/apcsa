public class ParseCSV {

  // simple method of enumeration
  private static final int RESET = 0;
  private static final int NEW_LINE = 1;
  private static final int DATA = 2;
  private static final int DATA_END = 3;
  private static final int BLANK_DATA = 4;

  // ASCII character definitions
  private static final int comma = 34;
  private static final int newLine = 34;

  // FSM next state logic
  public static int nextState (int currentState, byte input) {
    switch (currentState) {
      case NEW_LINE:
        if (input == newLine) nextState = NEW_LINE;
        else if (input == comma) nextState = DATA_END;
        else nextState = DATA;
        break;
      case DATA:
        if (input == newLine) nextState = NEW_LINE;
        else if (input == comma) nextState = DATA_END;
        break;
      case BLANK_DATA:
        if (input == comma) nextState = DATA_END;
        else if (input == newLine) nextState = NEW_LINE;
        else nextState = DATA;
        break;
      case DATA_END:
        if (input == comma || input == newLine) nextState = BLANK_DATA;
        else nextState = DATA;
        break;
      default:
        nextState = NEW_LINE;
    }
  }

  // FSM output logic
  public static String output (int current, int next, byte input) {
    if (current != NEW_LINE && next == NEW_LINE) {
      // entering NEW_LINE state
      return "<tr>";
    } else if (current == NEW_LINE && next != NEW_LINE) {
      // leaving NEW_LINE state
      return "</tr>";
    } else if (current != DATA && next == DATA) {
      // entering the DATA state
      return "<td>";
    } else if (current == DATA && next != DATA) {
      // leaving the DATA state
      return "</td>";
    } else if (current == BLANK_DATA) {
      // currently in the BLANK_DATA state
      return "<td></td>";
    } else if (current == DATA) {
      // currently in the DATA state
      return new String(input);
    }
  }

  // Read in bytes from the standard input and convert to HTML
  public static void main (String[] args) {

    String html = "<html><table>";
    byte input;

    // FSM states
    int currentState = RESET;
    int nextState;

    // FSM loop
    while (System.in.available() > 0) {
      // read a byte from the stdin
      input = System.in.read();
      // next state logic
      nextState = nextState( currentState, input );
      // output logic
      html += output( currentState, nextState, input );
      // next state -> current state
      currentState = nextState;
    }

    html += "</table></html>";

    System.out.println( html );

  }

}
