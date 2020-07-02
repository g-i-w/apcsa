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
    int i = 0;
    while (i < arrayLengthInt) {
      timeArray[i] = t;
      t += interval;
      i++;
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
    int i=0;
    while (i < timeValues.length) {
      distValues[i] = (0.5 * a * Math.pow(timeValues[i],2.0)) + (v0 * timeValues[i]) + s0;
      i++;
    }

    // give back the resulting array of doubles
    return distValues;
  }


}
