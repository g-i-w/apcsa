import java.util.*;
import java.io.*;

public class TestBinarySearch {

  public static void main (String[] args) {
    FindFiles find = new FindFiles();
    find.dir( args[0] );
    
    SearchFileNames search = new SearchFileNames( find.list() );
    ArrayList<File> files = search.getFiles( args[1] );
    for (File f : files) System.out.println( f );
    
  }
}