import java.util.*;
import java.io.*;

public class NumberFile {

  public static void main (String[] args) {

    // print the number of command line arguments that were passed
    if (args.length < 1) {
      System.out.println( "No args!" );
      return; // leave the main method and the program ends
    }

    // create a dynmaic array to hold an unknown number of StringContainer objects
    ArrayList<StringContainer> containers = new ArrayList<>();

    // create file objects
    File fromFile = new File( args[0] );
    File toFile = new File( "integers-" + args[0] );

    // create a string reference to hold the data to be written to the "toFile"
    String toFileData = "";

    try {

      // create a Scanner object to read lines from the "fromFile"
      Scanner scanFromFile = new Scanner( fromFile, "UTF-8" );
      // create a PrintWriter object to write to the "toFile"
      PrintWriter writeToFile = new PrintWriter( toFile, "UTF-8" );

      while ( scanFromFile.hasNextLine() ) {

        // Create a new StringContainer object and place a reference in aContainer
        StringContainer aContainer = new StringContainer( scanFromFile.nextLine() );

        // attach the new StringContainer object to the end of the containers array
        containers.add( aContainer );

        // print the integer value of the StringContainer objects
        System.out.println( aContainer.getInt() );
        // This does exactly the same thing (prints it again)
        System.out.println( containers.get(containers.size()-1).getInt() );

        // String to write to the "toFile"
        String dataStr = containers.get(containers.size()-1).getStr() + " -> " + containers.get(containers.size()-1).getInt();

        // write the data to the "toFile"
        writeToFile.write( dataStr + "\n" );

        // we've written to a memory buffer, but it might not have written to the disk yet...
        System.out.println(dataStr + " might have written...");
        System.out.print("press <return>");
        System.in.read();
        // "flush" the memory buffer to the disk
        writeToFile.flush();
        // Now we know that we have written the data to the disk.
        System.out.println(dataStr + " has been written!");
        System.out.print("press <return>");
        System.in.read();

      }

      // all files are automatically flushed and closed when the JVM quits...
      // so this is only necessary if we want to close the file without quiting the JVM.
      writeToFile.close();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
