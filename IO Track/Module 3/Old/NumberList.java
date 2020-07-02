import java.util.*;
import java.io.*;

public class NumberList {

  // instance variable
  private ArrayList<NumberString> allNumberStrings;


  // constructor
  public NumberList () {
    // intialize the ArrayList object
    allNumberStrings = new ArrayList<NumberString>();
  }


  // create a new Double object from a String and add it to the ArrayList object
  public void addString ( String s ) {
    // create a new NumberString object using String s
    NumberString ns = new NumberString( s );
    // add the NumberString object to the ArrayList
    allNumberStrings.add( ns );
  }


  // check to see whether the ArrayList contains any NumberString objects
  public boolean numbersAvailable () {
    if (allNumberStrings.size() > 0) return true;
    else return false;
  }


  // return the next StringContainer object
  public NumberString nextNumber () {
    // objects start out as null
    NumberString ns;
    // call the containersAvailable method in this class
    if (containersAvailable()) {
      // remove a NumberString object reference from index 0 and place into ns
      ns = allContainers.remove(0);
    }
    // Note: ns will still be null if allNumberStrings was empty!
    return ns;
  }


  // read all lines from the File object into the ArrayList object
  public void read ( String filePath ) {
    try {
      // create a File object
      File fromFile = new File( filePath );
      // create a Scanner object to read lines from the "fromFile"
      Scanner readingFile = new Scanner( fromFile );
      // read all the lines from the file and try to create Double object
      while ( readingFile.hasNextLine() ) {
        // read 1 line from the file
        String line = readingFile.nextLine();
        // call the addString method in this class to add a NumberString object
        addString( line );
      }
    } catch (Exception e) {
      // print all the information from an Exception
      e.printStackTrace();
    }
  }


  // write all Strings to the file from the NumberString objects in the ArrayList object
  public void write ( String filePath ) {
    try {
      // create a File object
      File toFile = new File( filePath );
      // create a PrintWriter object to write to the "toFile"
      PrintWriter writingFile = new PrintWriter( toFile );
      // loop through each StringContainer object in the ArrayList object
      for (NumberString ns : allNumberStrings) {
        // write the String from the Container object to the File
        writingFile.write( ns.toString() );
      }
      // Make sure the file has been saved
      writingFile.close();
    } catch (Exception e) {
      // print all the information from an Exception
      e.printStackTrace();
    }
  }


}
