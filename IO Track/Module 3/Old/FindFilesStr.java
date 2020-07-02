import java.util.*;
import java.io.*;

public class FindFiles {

  // Instance variable
  private ArrayList<File> allFiles;
  private String searchStr;


  // Constructor
  public FindFiles ( String s ) {
    allFiles = new ArrayList<>();
    searchStr = s;
  }


  // Find files with names that contain the String searchStr.
  // Accepts a String filepath.
  public void find ( String path ) {
    // Create a File object from the String filepath
    File fileObject = new File(path);
    // Call the other find() method
    find( fileObject );
  }


  // Find files with names that contain the String searchStr.
  // Accepts a File object.
  public void find ( File a ) {

    // File must be accessable (exists and readable), and not be ".." or ".".
    if (!a.exists() || a.getName().equals("..") || a.getName().equals(".")) return;

    // Is the File a directory?
    if (a.isDirectory()) {
      // Get a File[] array referenence
      File[] dirList = a.listFiles();
      // Verify that array has been initialized
      if (dirList == null) return;
      // Loop through each file
      for (File b : dirList) {
        // Recursively call this same method with each file in the directory.
        find( b );
      }
    } else if (a.getName().indexOf(searchStr) != -1) {
      // Add the file to the ArrayList.
      allFiles.add( a );
    }

  }


  // Get the list of files found.
  public ArrayList<File> getFiles () {
    return allFiles;
  }


  public String toString () {
    String fileString = "";
    for (File f : allFiles) {
      fileString += f + "\n";
    }
    return fileString;
  }


}
