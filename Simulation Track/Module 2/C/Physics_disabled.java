import java.lang.Math;

public class Physics {

  // time variables (data structure)
  double timeInterval;
  double timeStart;
  double timeEnd;

  // instance variable (data structure)
  double yInitDistance;
  double yInitVelocity;
  double xInitVelocity;
  double xDistance;
  double yDistanceApogee;
  double angleAboveHorizRad;
  double timeInterval;
  double timeInAir;
  double timeOfApogee;
  String marker;
  double[][] trajectoryData = new double[2][];

  public static double[] time () {
    // here we are determining how many intervals fit between timeStart and timeEnd
    double arrayLengthDouble = (timeEnd - timeStart)/timeInterval;
    // the length of an array must be an integer, so we'll convert the double to an int
    int arrayLengthInt = (int) arrayLengthDouble + 1;
    // here we create a new array of doubles using the length we calculated
    double[] timeArray = new double[arrayLengthInt];
    // now we need to populate the array with time values
    double t = timeStart;
    for (int i=0; i < arrayLengthInt; i++) {
      timeArray[i] = t;
      t += timeInterval;
    }
    // now give back the resulting array of time doubles
    return timeArray;
  }

  public static double[] distance ( double deltaT, double finalT, double a, double v0, double s0 ) {
    // get a sequence of time values
    double[] timeValues = time( deltaT, 0.0, finalT );

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
      TimeUnit.SECOND.
    }

  }

  // constructor
  public void Physics ( String m, double y0, double v0, double theta, double dt ) {
    marker = m;
    yInitDistance = y0;
    timeInterval = dt;

    // a(t) = f/m
    // v(t) = (-9.80665)t + v0
    // s(t) = 1/2(-9.80665)t^2 + v0t + s0

    // vector values
    ////////////////double initVelocity = 10;
    ////////////////double angleAboveHoriz = 45;
    angleAboveHorizRad = Math.toRadians(theta);

    // initial Y values
    ////////////////double yInitDistance = 0;
    yInitVelocity = v0 * Math.sin(angleAboveHorizRad);

    // initial X values
    xInitVelocity = v0 * Math.cos(angleAboveHorizRad);

    // quadratic formula to find t intercept
    timeInAir = ( -yInitVelocity - Math.sqrt( Math.pow(yInitVelocity,2.0) - 4 * yInitDistance * 0.5 * -9.80665 ) ) / ( 2 * 0.5 * -9.80665 );

    // distance formula to find x(t)
    xDistance = xInitVelocity * timeInAir;

    // velocity zero intercept
    timeOfApogee = -yInitVelocity / -9.80665;
    // distance formula to find y(t)
    yDistanceApogee = (0.5 * -9.80665 * Math.pow(timeOfApogee,2.0)) + (yInitVelocity * timeOfApogee) + yInitDistance;


    System.out.println("Height: "+yInitDistance);
    System.out.println("Y Velocity: "+yInitVelocity);
    System.out.println("X Velocity: "+xInitVelocity);
    System.out.println("Time In Air: "+timeInAir);
    System.out.println("Time of Apogee: "+timeOfApogee);
    System.out.println("Height at Apogee: "+yDistanceApogee);
    System.out.println("Distance: "+xDistance);


    // Here we are going to create arrays of X and Y distances and return them as tranjectoryData

    // array of y(t)
    double[] yDistances = distance( interval, timeInAir, -9.80665, yInitVelocity, yInitDistance );
    // array of x(t)
    double[] xDistances = distance( interval, timeInAir, 0.0, xInitVelocity, 0.0 );

    // insert both X and Y distances into a 2D array
    trajectoryData[0] = xDistances;
    trajectoryData[1] = yDistances;

  }

  public void graphX () {
    graph( trajectoryData[0] );
  }

  public void graphY () {
    graph( trajectoryData[1] );
  }

}
