public class TestBinarySort {
  public static void main (String[] args) {
    FindFiles f = new FindFiles();
    f.searchDir( "~/" );
    System.out.println( f.getAllFiles() );
    SortFiles.bubbleSort( f.getAllFiles() );
    System.out.println( f.getAllFiles() );
  }
}
    
    