import java.lang.Math;

public class Physics {

  // instance variables
  double angle;
  double height;
  double xInitVelocity;
  double yInitVelocity;

  // private static methods
  private static double cos(double angle) {
    return Math.cos( Math.toRadians(angle) );
  }
  private static double sin(double angle) {
    return Math.sin( Math.toRadians(angle) );
  }

  // constructor
  public Physics (double v0, double a, double h ) {
    // static methods can be called from inside the constructor, but not instance methods
    // only static methods exist before the constructor runs
    angle = a;
    height = h;
    xInitVelocity = v0 * cos(angle);
    yInitVelocity = v0 * sin(angle);
  }

  // constructor (default height)
  public Physics (double v0, double angle ) {
    this( v0, angle, 0.0 );
  }

  // constructor (default height and angle)
  public Physics (double v0 ) {
    this( v0, 45.0 );
  }


  // distance arrays
  public double[] distanceX ( double deltaT ) {
    return distance( deltaT, timeInAir(), 0.0, xInitVelocity, 0.0 );
  }
  public double[] distanceY ( double deltaT ) {
    return distance( deltaT, timeInAir(), -9.80665, yInitVelocity, height );
  }

  // maximum values
  public double timeInAir () {
    // we need the largest of the zero-intercept solutions of the Y distance
    //   equation: s(t) = 0.5*a*t^2 + v0*t + s0
    // so we use the quadratic formula for the second zero-intercept solution
    return ( -yInitVelocity - Math.sqrt( Math.pow(yInitVelocity,2.0) - 4 * height * 0.5 * -9.80665 ) ) / ( 2 * 0.5 * -9.80665 );
  }
  public double timeOfApogee () {
    // we need the time at which v(t) in the Y direction becomes 0
    // v(t) = v0 + at
    // so we set velocity to 0 and solve for time
    // 0 = v0 + at
    // -v0 = at
    // t = -v0 / a
    return -yInitVelocity / -9.80665;
  }
  public double maxDistX () {
    // s(t) = 0.5*0.0*t^2 + v0*t + s0
    return xInitVelocity * timeInAir();
  }
  public double maxDistY () {
    // s(t) = 0.5*-9.8*t^2 + v0*t + s0
    return (0.5 * -9.80665 * Math.pow(timeOfApogee(),2.0)) + (yInitVelocity * timeOfApogee()) + height;
  }


  // rename the time() method as the sequence() method
  public static double[] sequence ( double interval, double start, double end ) {

    int arrayLength = (int)((end - start)/interval + 1);

    double[] timeArray = new double[arrayLength];

    double t = start;
    for (int i=0; i < arrayLength; i++) {
      timeArray[i] = t;
      t += interval;
    }

    return timeArray;
  }

  public static double[] distance ( double deltaT, double finalT, double a, double v0, double s0 ) {
    // get a sequence of time values
    double[] timeValues = sequence( deltaT, 0.0, finalT );

    // create a new array of doubles
    double[] distValues = new double[timeValues.length];

    // loop through each element of time and dist arrays
    for (int i=0; i < timeValues.length; i++) {
      distValues[i] = (0.5 * a * Math.pow(timeValues[i],2.0)) + (v0 * timeValues[i]) + s0;
    }

    // give back the resulting array of doubles
    return distValues;
  }

  // graph the values in an array
  public static void graph ( double[] anArray, String marker ) {

    // Loop through the array indices
    for (int i=0; i < anArray.length; i++) {
      double value = anArray[i];
      String plotPoint = "";
      for (int spaces=0; spaces < value; spaces++) {
        plotPoint += " ";
      }
      plotPoint += marker;
      System.out.println( plotPoint );
    }

  }

}
