public class TrimSpaces {

  // states
  private static final int LINE_START_STATE = 0;
  private static final int PRE_PADDING_STATE = 1;
  private static final int CHARACTER_STATE = 2;
  private static final int UNKNOWN_SPACE_STATE = 3;

  // state variable
  private static int state = LINE_START_STATE;

  // input data variable
  private static int input;


  // input data
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


  // transition logic
  public static void transition () {

    if (state == LINE_START_STATE) {
      if (input == ' ') {
        state = PRE_PADDING_STATE;
      } else if (input == '\n') {
        // no state transition
        System.out.print( '\n' );
      } else {
        state = CHARACTER_STATE;
        System.out.print( (char)input );
      }

    } else if (state == PRE_PADDING_STATE) {
      if (input == ' ') {
        // no state transition
      } else if (input == '\n') {
        state = LINE_START_STATE;
        System.out.print( '\n' );
      } else {
        state = CHARACTER_STATE;
        System.out.print( (char)input );
      }

    } else if (state == CHARACTER_STATE) {
      if (input == '\n') {
        state = LINE_START_STATE;
        System.out.print( '\n' );
      } else if (input == ' ') {
        state = UNKNOWN_SPACE_STATE;
      } else {
        // no state transition
        System.out.print( (char)input );
      }

    } else if (state == UNKNOWN_SPACE_STATE) {
      if (input == '\n') {
        state = LINE_START_STATE;
        System.out.print( '\n' );
      } else if (input == ' ') {
        // no state transition
      } else {
        state = CHARACTER_STATE;
        System.out.print( " " + (char)input );
      }

    }

  }


  // logic loop
  public static void main (String[] args) {

    while (input()) {
      transition();
    }

  }

}
