import java.util.*;
import java.io.*;

public class TestSort {

  static void printFiles (ArrayList<File> a ) {
    for (File f : a) System.out.println( f.getName() );
    System.out.println( "-----------------------" );
  }

  public static void main (String[] args) {
    FindFiles f = new FindFiles();
    f.dir( args[0] );
    printFiles( f.list() );
    SearchFileNames.bubbleSort( f.list() );
    printFiles( f.list() );
    
  }
}
    
    