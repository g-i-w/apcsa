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

      // Write a loop to read from the standard input System.in.read() into the input array.
      // Include logic to prevent assigning values outside the range of the input array.
      //
      //
      //
      //
      //
      //

      }
    } catch (Exception e) {
      System.out.println( "ERROR: couldn't read from the standard input!" );
    }
  }


  // transition logic
  public static void transition () {

    // Add transition logic here
    //
    //
    //
    //
    //

    }

  }


  // output logic
  public static void output () {

    String elevator_motor = "OFF";
    String door_motor = "OFF";

    // Add logic set the elevator_motor to "UP", "DOWN", or "OFF", based on the state.
    // Add logic set the door_motor to "OPENING", "CLOSING", or "OFF", based on the state.
    //
    //
    //

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
