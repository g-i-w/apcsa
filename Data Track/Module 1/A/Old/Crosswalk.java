public class Crosswalk {

  // input values (ASCII)
  private static final int RED = 114; // 'r'
  private static final int FLASHING_GREEN = 102; // 'f'
  private static final int GREEN = 103; // 'g'

  // states
  private static final int WAITING = 0;
  private static final int CROSSING_FIRST_LANE = 1;
  private static final int MIDDLE_ISLAND = 2;
  private static final int CROSSING_SECOND_LANE = 3;
  private static final int CROSSED = 4;

  // current state variable
  private static int state = WAITING;

  // current input variable
  private static int input;


  // input data
  public static void input () {
    try {
      int nextChar = System.in.read();
      if (nextChar == '\n') {
        input();
      } else {
        input = nextChar;
      }
    } catch (Exception e) {
      System.out.println( "ERROR: couldn't read from the standard input!" );
    }
  }


  // transition logic
  public static void nextState () {

    if (state == WAITING) {
      if (input == GREEN)
        state = CROSSING_FIRST_LANE;

    } else if (state == CROSSING_FIRST_LANE) {
      state = MIDDLE_ISLAND;

    } else if (state == MIDDLE_ISLAND) {
      if (input == GREEN || input == FLASHING_GREEN)
        state = CROSSING_SECOND_LANE;

    } else if (state == CROSSING_SECOND_LANE) {
      state = CROSSED;

    } else if (state == CROSSED) {
      state = CROSSED;
    }

  }


  // output logic
  public static void output () {

    if ( state == WAITING && input == RED )
      System.out.println( "Wait..." );

    if ( (state == WAITING || state == MIDDLE_ISLAND) && input == GREEN  )
      System.out.println( "Walk!" );

    if ( state == MIDDLE_ISLAND && input == RED )
      System.out.println( "Stop in the middle!" );

    if ( (state == CROSSING_FIRST_LANE || state == MIDDLE_ISLAND || state == CROSSING_SECOND_LANE) && input != GREEN )
      System.out.println( "Walk faster!" );

  }


  // logic loop
  public static void main (String[] args) {

    while (state != CROSSED) {
      input();
      output();
      nextState();
    }

    System.out.println( "We crossed the street!" );

  }

}
