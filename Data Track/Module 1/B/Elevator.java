public class Elevator {

  // states
  private static final int TOP_OPEN = 0;
  private static final int DOOR_CLOSING_TOP = 1;
  private static final int GOING_DOWN = 2;
  private static final int DOOR_OPENING_BOTTOM = 3;
  private static final int BOTTOM_OPEN = 4;
  private static final int DOOR_CLOSING_BOTTOM = 5;
  private static final int GOING_UP = 6;
  private static final int DOOR_OPENING_TOP = 7;


  // state variable
  private static int state = TOP_OPEN;

  // input array
  private static boolean[] input = new boolean[7];


  // input data
  public static void input () {
    try {
      int i = 0;
      while(true) {
        int test = System.in.read();
        if (test == '\n') break;
        if (i<input.length) {
          if (test == '1')
            input[i] = true;
          else
            input[i] = false;
        }
        i++;
      }
    } catch (Exception e) {
      System.out.println( "ERROR: couldn't read from the standard input!" );
    }
  }


  // transition logic
  public static void transition () {

    if (state == TOP_OPEN) {
      if (input[6] && ! input[2])
        state = DOOR_CLOSING_TOP;

    } else if (state == DOOR_CLOSING_TOP) {
      if (input[2])
        state = DOOR_OPENING_TOP;
      else if (input[4])
        state = GOING_DOWN;

    } else if (state == GOING_DOWN) {
      if (input[1])
        state = DOOR_OPENING_BOTTOM;

    } else if (state == DOOR_OPENING_BOTTOM) {
      if (input[3])
        state = BOTTOM_OPEN;

    } else if (state == BOTTOM_OPEN) {
      if (input[5] && ! input[2])
        state = DOOR_CLOSING_BOTTOM;

    } else if (state == DOOR_CLOSING_BOTTOM) {
      if (input[2])
        state = DOOR_OPENING_BOTTOM;
      else if (input[4])
        state = GOING_UP;

    } else if (state == GOING_UP) {
      if (input[0])
        state = DOOR_OPENING_TOP;

    } else if (state == DOOR_OPENING_TOP) {
      if (input[3])
        state = TOP_OPEN;

    }

  }


  // output logic
  public static void output () {

    String elevator_motor = "OFF";
    String door_motor = "OFF";

    if (state == DOOR_CLOSING_TOP || state == DOOR_CLOSING_BOTTOM)
      door_motor = "CLOSE";
    else if (state == GOING_DOWN)
      elevator_motor = "DOWN";
    else if (state == DOOR_OPENING_TOP || state == DOOR_OPENING_BOTTOM)
      door_motor = "OPEN";
    else if (state == GOING_UP)
      elevator_motor = "UP";

    System.out.println( "Elevator: " + elevator_motor + ", Door: " + door_motor );

  }


  // logic loop
  public static void main (String[] args) {

    while (true) {
      output();
      input();
      transition();
    }

  }

}
