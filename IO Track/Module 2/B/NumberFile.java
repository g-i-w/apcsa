import java.util.*;
import java.io.*;

public class NumberFile {

  public static void main (String[] args) {

    // print the number of command line arguments that were passed
    if (args.length < 1) {
      System.out.println( "No args!" );
      return; // leave the main method and the program ends
    }

    // create a dynamic array to hold an unknown number of StringContainer objects
    ArrayList<StringContainer> allStringContainers = new ArrayList<>();

    // create file objects
    File fromFile = new File( args[0] );
    File toFile = new File( args[0]+".filtered" );

    // create a string reference to hold the data to be written to the "toFile"
    String toFileData = "";

    // Create a MovingAverage object
    MovingAverage ma = new MovingAverage( 5 );

    try {

      // create a Scanner object to read lines from the "fromFile"
      Scanner readingFile = new Scanner( fromFile, "UTF-8" );
      // create a PrintWriter object to write to the "toFile"
      PrintWriter writingFile = new PrintWriter( toFile, "UTF-8" );

      // read all the lines from the file and place each line into a StringContainer object
      while ( readingFile.hasNextLine() ) {
        allStringContainers.add( new StringContainer(readingFile.nextLine()) );
      }

      // loop through all the StringContainer objects and write the average to a file
      for (StringContainer container : allStringContainers) {
        ma.shift( container );
        writingFile.write( ma.average() + "\n" );
      }

      // We still have some StringContainer objects in the MovingAverage object,
      // so we need to loop through those remaining StringContainer objects
      while ( ma.shift() ) {
        writingFile.write( ma.average() + "\n" );
      }

      // Make sure all the data has been written to the disk
      writingFile.close();

    } catch (Exception e) {
      // print all the information from the Exception
      e.printStackTrace();
    }

  }

}
