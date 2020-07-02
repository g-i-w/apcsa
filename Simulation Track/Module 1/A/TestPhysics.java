public class TestPhysics {
  public static void main (String[] args) {

    // test the Physics.time() method
    System.out.println("----\nTesting Physics.time() method:\n----");
    double[] timeValues = Physics.time( 0.5, 3.0, 10.0 );
    int a=0;
    while (a < timeValues.length) {
      System.out.println( timeValues[a] );
      a++;
    }

    // test the Physics.distance() method
    System.out.println("----\nTesting Physics.distance() method:\n----");
    double[] distanceValues = Physics.distance( 0.1, 3.0, -9.8, 10.0, 2.0 );
    int value=0;
    while (value < distanceValues.length) {
      System.out.println( distanceValues[value] );
      value++;
    }

  }
}
