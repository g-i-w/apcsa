import java.util.*;
import java.io.*;

public class FileInfo {

  File myFileObject;
  boolean fileIsAccessible;
  boolean fileIsDirectory;

  public FileInfo (String path) {
    myFileObject = new File( path );
    fileIsAccessible = myFileObject.exists();
    fileIsDirectory = myFileObject.isDirectory();
  }

  public void printInfo () {
    System.out.println( "---\nInformation for file '"+myFileObject.getName()+"':" );
    if (fileIsAccessible) {
      System.out.println( "Full path: "+myFileObject );
      System.out.println( "Size (kB): "+(myFileObject.length()/1024) );
      System.out.println( "Directory: "+(fileIsDirectory ? "Yes" : "No") );
    } else {
      System.out.println( "ERROR: unable to access file!" );
    }
  }

  public void printInfoSubFiles () {
    if (fileIsDirectory) {
      File[] fileArray = myFileObject.listFiles();
      if (fileArray != null) {
        for (File f : fileArray) {
          FileInfo fObject = new FileInfo( f.toString() );
          fObject.printInfo();
        }
      }
    } else {
      System.out.println( myFileObject.getName()+" is not a directory!" );
    }
  }

  public static void main (String[] args) {
    FileInfo fi = new FileInfo( args[0] );
    fi.printInfo();
    fi.printInfoSubFiles();
  }

}
