import java.util.*;
import java.io.*;

public class NumberFile {

  // instance variables
  private ArrayList<StringContainer> allContainers;
  private File fileObject;


  // constructor
  public NumberFile ( String filePath ) {
    // intialize the ArrayList object
    allContainers = new ArrayList<>();
    // initialize the File object
    fileObject = new File( filePath );
  }


  // add a StringContainer object
  void addString ( String toAdd ) {
    String newContainer = new StringContainer(toAdd);
    allContainers.add( newContainer );
  }


  // read lines from the File object into the ArrayList object
  void read ( String filePath ) {
    try {
      // create a Scanner object to read lines from the "fromFile"
      Scanner readingFile = new Scanner( fromFile );
      // read all the lines from the file and try to create Double object
      while ( readingFile.hasNextLine() ) {
        // read 1 line from the file and create a StringContainer object
        String line = readingFile.nextLine();
        StringContainer container = new StringContainer( line );
        // add the StringContainer object to the ArrayList of StringContainer objects
        allContainers.add( container );
      }
    } catch (Exception e) {
      // print all the information from an Exception
      e.printStackTrace();
    }

  }


  // write lines to the file from StringContainer objects in the ArrayList object
  void write ( String filePath ) {
    try {
      // create a File object
      File toFile = new File( filePath );
      // create a PrintWriter object to write to the "toFile"
      PrintWriter writingFile = new PrintWriter( toFile );
      // loop through each StringContainer object in the ArrayList object
      for (StringContainer container : allContainers) {
        // get the String object from the Container object
        String line = container.getString();
        // add the String to a the file
        writingFile.write( line );
      }
      // Make sure the file has been saved
      writingFile.close();
    } catch (Exception e) {
      // print all the information from an Exception
      e.printStackTrace();
    }
  }

}
