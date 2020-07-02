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

}
