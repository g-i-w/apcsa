public class CsvToHtml {

  // simple enumeration
  private static final int NEW_LINE = 0;
  private static final int DATA = 1;
  private static final int QUOTE = 2
  private static final int UNQUOTE = 3
  private static final int QUOTED_DATA = 4
  private static final int COMMA = 5;
  private static final int NEW_LINE = 6;
  private static final int END_OF_FILE = 7;

  public static int nextState (int currentState, byte input) {
    switch (currentState) {
      case NEW_LINE:
        if (input==34) nextState = QUOTE;
        else nextState = DATA;
        break;
      case DATA:
        if (input==44) nextState = COMMA;
        break;
      case QUOTE:
        if (input==34) nextState = UNQUOTE;
        else nextState = QUOTED_DATA;
        break;
      case UNQUOTE:
        if (input==44) nextState = COMMA;
        break;
      case QUOTED_DATA;
        if (input==34) nextState = UNQUOTE;
        break;
      case COMMA:

      case NEW_LINE:
      case END_OF_FILE:
        nextState =
      default:
        nextState = RESET;
        break;
    }
  }

  public static String convertCSVtoHTML ( byte[] csv ) {

    String html = "<html>";
    byte currentByte;


    // Finite State Machine states
    int currentState = RESET;
    int nextState;

    // Finite State Machine logic
    while (System.in.available() > 0) {
      // next state logic

      // output logic


      // next state -> current state
      currentState = nextState;
    }

  }

}
