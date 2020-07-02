public class TestFindFiles {
  public static void main(String[] args) {
    FindFiles f = new FindFiles();
    f.searchDir( args[0] );
    System.out.println( f );
  }
}
