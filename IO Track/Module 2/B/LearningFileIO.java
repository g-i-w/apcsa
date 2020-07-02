import java.util.*;
import java.io.*;

public class LearningFileIO {

  public static void main(String[] args) {

    File fromFile = new File( args[0] );
    File toFile = new File( args[1] );

    try {

      Scanner scanner = new Scanner( fromFile );
      String firstLine = scanner.nextLine();
      String secondLine = scanner.nextLine();

      PrintWriter printer = new PrintWriter( toFile );
      printer.write( "Here are the first two lines from " + fromFile.getName() + "!\n" );
      printer.write( "1. " + firstLine + "\n" );
      printer.write( "2. " + secondLine + "\n" );
      printer.close();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
