public class TestPhysics {
  public static void main (String[] args) {

    // test the Physics.time() method
    System.out.println("----\nTesting Physics.time() method:\n----");
    double[] timeValues = Physics.time( 0.5, 3.0, 10.0 );
    Physics.graph( timeValues, "*" );

    // test the Physics.distance() method
    System.out.println("----\nTesting Physics.distance() method:\n----");
    double[] distanceValues = Physics.distance( 0.1, 3.0, -9.8, 10.0, 2.0 );
    Physics.graph( distanceValues, "*" );

    // test the Physics.trajectory() method
    System.out.println("----\nTesting Physics.trajectory() method:\n----");
    double[][] trajectoryValues = Physics.trajectory( 2.0, 10.0, 47.5, 0.1 );
    Physics.graph( trajectoryValues[0], "*" );
    Physics.graph( trajectoryValues[1], "*" );

  }
}
