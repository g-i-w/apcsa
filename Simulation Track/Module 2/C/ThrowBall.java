public class ThrowBall {
  public static void main (String[] args) {

    Physics[] ballObjects = new Physics[];

    ballObjects[0] = new Physics("A", 10.0, 10.0, 45.0, 0.1 );
    ballObjects[1] = new Physics("B", 10.0, 15.0, 30.0, 0.1 );
    ballObjects[2] = new Physics("C", 0.0, 10.0, 41.0, 0.222 );
    ballObjects[3] = new Physics("D", 1.5, 20.0, 81.0, 0.333 );


    // loop through the sub-arrays in ballData
    for (int ball=0; ball<ballObjects.length; ball++) {

      // print a graph of the Y distance values
      ballObjects[ ball ].graphY();

    }

  }
}
