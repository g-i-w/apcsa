import java.util.*;
import java.io.*;

public class Filter {

  // instance variables
  private ArrayList<Double> averageList;
  private File inputFile;
  private File outputFile;
  private int filterLength;


  // constructor
  public Filter ( String inputPath, String outputPath, int l ) {
    // intialize the ArrayList objects
    averageList = new ArrayList<Double>();
    // initialize the File objects
    inputFile = new File( inputPath );
    outputFile = new File( outputPath );
    // set the length of the filter
    filterLength = l;
    // pre-load the ArrayList with 0.0 values
    for (int i=0; i<filterLength; i++) {
      averageList.add( new Double(0.0) );
    }
  }


  // calculate the average of the values in averageList
  private Double average () {
    double avg = 0.0;
    for (Double d : averageList) {
      avg += d.doubleValue();
    }
    avg /= averageList.size();
    return new Double( avg );
  }


  // create a Double object from a String object
  private Double stringToDouble ( String s ) {
    try {
      // call static method in Double class
      double d = Double.valueOf( s );
      return new Double( d );
    } catch (Exception e) {
      return new Double( 0.0 );
    }
  }


  // read in numbers from inputFile, filter the numbers with a moving average, and write the averages to outputFile
  public void movingAverage () {
    try {
      // create a Scanner object to read lines from the inputFile
      Scanner readingFile = new Scanner( inputFile );
      // create a PrintWriter object to write to the outputFile
      PrintWriter writingFile = new PrintWriter( outputFile );
      // read lines in inputFile and try to create a Double object
      while ( readingFile.hasNextLine() ) {
        // read a line from the outputFile
        String line = readingFile.nextLine();
        // create a Double object from the String object
        Double d = stringToDouble( line );
        // add the new Double object to the ArrayList and remove the oldest
        averageList.add( d );
        averageList.remove( 0 );
        // calculate the new average
        Double avg = average();
        // write the Double to the outputFile
        writingFile.write( avg.toString() + "\n" );
      }
      writingFile.close();
    } catch (Exception e) {
      // print all the information from an Exception
      e.printStackTrace();
    }
  }


}
