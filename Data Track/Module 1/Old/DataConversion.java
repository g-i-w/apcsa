public class DataConversion {

  public static byte[] getStandardInput ( int maxSize ) {
    byte[] stdin = new byte[maxSize];
    for (int i=0; i<maxSize; i++) {
      // stop looping if there is no more data
      if (System.in.available()==0) break;
      // read a byte into the stdin array
      stdin[i] = System.in.read();
    }
    return stdin;
  }

  public static String convertCSVtoHTML ( byte[] csv ) {

    String html = "<html>";

    // simple way to accomplish enumeration
    final int RESET = 0;
    final int DATA = 1;
    final int QUOTE = 2
    final int COMMA = 3;
    final int NEW_LINE = 4;
    final int END_OF_FILE = 5;

    // Finite State Machine states
    int currentState = RESET;
    int nextState;

    // Finite State Machine logic
    while (nextState != END_OF_FILE) {
      // next state logic
      switch (currentState) {
        case RESET:
          if (getChar()
        case DATA:
        case QUOTE:
        case COMMA:
        case NEW_LINE:
        case END_OF_FILE:
          nextState =
        default:
          nextState = RESET;
          break;
      }
      // next state -> current state
      currentState = nextState;
    }

  }

}
