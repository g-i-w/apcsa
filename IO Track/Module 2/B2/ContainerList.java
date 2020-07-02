import java.util.*;
import java.io.*;

public class ContainerList {

  // instance variable
  private ArrayList<StringContainer> allContainers;


  // constructor
  public ContainerList () {
    // intialize the ArrayList object
    allContainers = new ArrayList<StringContainer>();
  }


  // create a new StringContainer object and add it to the ArrayList object
  public void createContainer ( String s ) {
    String newContainer = new StringContainer( s );
    allContainers.add( newContainer );
  }


  // check to see if there are StringContainer objects available
  public boolean containersAvailable () {
    if (allContainers.size() > 0) return true;
    else return false;
  }

  // return the next StringContainer object
  public StringContainer nextContainer ( int index ) {
    if (containersAvailable()) return allContainers.remove(0);
    else return null;
  }


  // read lines from the File object into the ArrayList object
  public void read ( String filePath ) {
    try {
      // create a File object
      File fromFile = new File( filePath );
      // create a Scanner object to read lines from the "fromFile"
      Scanner readingFile = new Scanner( fromFile );
      // read all the lines from the file and try to create Double object
      while ( readingFile.hasNextLine() ) {
        // read 1 line from the file and create a StringContainer object
        createContainer( readingFile.nextLine() );
      }
    } catch (Exception e) {
      // print all the information from an Exception
      e.printStackTrace();
    }

  }


  // write lines to the file from StringContainer objects in the ArrayList object
  public void write ( String filePath ) {
    try {
      // create a File object
      File toFile = new File( filePath );
      // create a PrintWriter object to write to the "toFile"
      PrintWriter writingFile = new PrintWriter( toFile );
      // loop through each StringContainer object in the ArrayList object
      for (StringContainer container : allContainers) {
        // write the String from the Container object to the File
        writingFile.write( container.getString() );
      }
      // Make sure the file has been saved
      writingFile.close();
    } catch (Exception e) {
      // print all the information from an Exception
      e.printStackTrace();
    }
  }

}
