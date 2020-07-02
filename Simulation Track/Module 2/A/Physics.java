import java.lang.Math;

public class Physics {

  public static double[] time ( double interval, double start, double end ) {
    // here we are determining how many intervals fit between start and end
    double arrayLengthDouble = (end - start)/interval;
    // the length of an array must be an integer, so we'll convert the double to an int
    int arrayLengthInt = (int) arrayLengthDouble + 1;
    // here we create a new array of doubles using the length we calculated
    double[] timeArray = new double[arrayLengthInt];
    // now we need to populate the array with time values
    double t = start;
    for (int i=0; i < arrayLengthInt; i++) {
      timeArray[i] = t;
      t += interval;
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
    }

  }

  // we're going to make this public so we can use this method from another class
  public static double[][] trajectory ( double yInitDistance, double initVelocity, double angleAboveHoriz, double interval ) {
    // a(t) = f/m
    // v(t) = (-9.80665)t + v0
    // s(t) = 1/2(-9.80665)t^2 + v0t + s0

    // vector values
    ////////////////double initVelocity = 10;
    ////////////////double angleAboveHoriz = 45;
    double angleAboveHorizRad = Math.toRadians(angleAboveHoriz);

    // initial Y values
    ////////////////double yInitDistance = 0;
    double yInitVelocity = initVelocity * Math.sin(angleAboveHorizRad);

    // initial X values
    double xInitVelocity = initVelocity * Math.cos(angleAboveHorizRad);

    // quadratic formula to find t intercept
    double timeInAir = ( -yInitVelocity - Math.sqrt( Math.pow(yInitVelocity,2.0) - 4 * yInitDistance * 0.5 * -9.80665 ) ) / ( 2 * 0.5 * -9.80665 );

    // distance formula to find x(t)
    double xDistance = xInitVelocity * timeInAir;

    // velocity zero intercept
    double timeOfApogee = -yInitVelocity / -9.80665;
    // distance formula to find y(t)
    double yDistanceApogee = (0.5 * -9.80665 * Math.pow(timeOfApogee,2.0)) + (yInitVelocity * timeOfApogee) + yInitDistance;


    System.out.println("Height: "+yInitDistance);
    System.out.println("Y Velocity: "+yInitVelocity);
    System.out.println("X Velocity: "+xInitVelocity);
    System.out.println("Time In Air: "+timeInAir);
    System.out.println("Time of Apogee: "+timeOfApogee);
    System.out.println("Height at Apogee: "+yDistanceApogee);
    System.out.println("Distance: "+xDistance);


    // Here we are going to create arrays of X and Y distances and return them as tranjectoryData

    // get an array of y(t)
    double[] yDistances = distance( interval, timeInAir, -9.80665, yInitVelocity, yInitDistance );
    // get an array of x(t)
    double[] xDistances = distance( interval, timeInAir, 0.0, xInitVelocity, 0.0 );

    // insert both X and Y distances into a 2D array
    double[][] trajectoryData;
    trajectoryData = new double[2][];
    trajectoryData[0] = xDistances;
    trajectoryData[1] = yDistances;

    // return the 2D array;
    return trajectoryData;
  }

}
