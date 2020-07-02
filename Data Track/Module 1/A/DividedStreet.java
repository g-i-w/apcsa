public class DividedStreet {

  // states
  private static final int WAITING = 0;
  private static final int CROSSING_FIRST_STREET = 1;
  private static final int MIDDLE_AREA = 2;
  private static final int CROSSING_SECOND_STREET = 3;
  private static final int CROSSED = 4;

  // state variable
  private static int state = WAITING;

  // input variable
  private static int input;


  // input data
  public static void input () {
    try {
      input = System.in.read();
    } catch (Exception e) {
      System.out.println( "ERROR: couldn't read from the standard input!" );
    }
  }


  // transition logic
  public static void transition () {

    if (state == WAITING) {
      if (input == 'g') state = CROSSING_FIRST_STREET;

    } else if (state == CROSSING_FIRST_STREET) {
      if (input == 'r') state = MIDDLE_AREA;
      else state = CROSSING_SECOND_STREET;

    } else if (state == MIDDLE_AREA) {
      if (input == 'g') state = CROSSING_SECOND_STREET;

    } else if (state == CROSSING_SECOND_STREET) {
      state = CROSSED;

    }

  }


  // output logic
  public static void output () {

    if ( state == WAITING ) System.out.println( "Waiting to cross..." );

    if ( state == MIDDLE_AREA ) System.out.println( "Waiting in the middle..." );

    if ( (state == WAITING || state == MIDDLE_AREA) && input == 'g'  )
      System.out.println( "Walk!" );

    if ( state == CROSSING_FIRST_STREET && input == 'r' )
      System.out.println( "Stop in the middle!" );

    if ( (state == CROSSING_FIRST_STREET || state == MIDDLE_AREA || state == CROSSING_SECOND_STREET) && input == 'f' )
      System.out.println( "Walk faster!" );

  }


  // logic loop
  public static void main (String[] args) {

    while (state != CROSSED) {
      output();
      input();
      transition();
    }
    System.out.println( "We crossed the street!" );

  }

}
