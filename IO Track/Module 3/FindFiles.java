import java.util.*;
import java.io.*;

public class FindFiles {

  // Instance variable
  private ArrayList<File> allFiles;


  // Constructor
  public FindFiles () {
    allFiles = new ArrayList<>();
  }


  // Search for files.
  // Receives a directory as a String argument.
  public void dir ( String path ) {
    // Create a File object from the String filepath
    File fileObject = new File( path );
    // Call the other dir() method
    dir( fileObject );
  }


  // Search for files.
  // Receives a directory as a File object argument.
  public void dir ( File a ) {

    // Make sure the file is accessable (exists and is readable)
    if (!a.exists()) {
      System.out.println( "Can't access "+a );
      return;
    }

    // Ignore anything that starts with a dot "."
    if (a.getName().substring(0,1).equals(".")) return;

    // Is the File a directory?
    if (a.isDirectory()) {
      // Get a File[] array containing all the files in the directory
      File[] dirList = a.listFiles();
      // Verify that array has been initialized
      if (dirList == null) return;
      // Loop through each file
      for (File b : dirList) {
        // Recursively call this same method with each file in the directory.
        dir( b );
      }
    // Otherwise the file
    } else {
      // Add the file to the ArrayList.
      allFiles.add( a );
    }

  }


  // Return a reference to the list of files found.
  public ArrayList<File> list () {
    return allFiles;
  }


}
