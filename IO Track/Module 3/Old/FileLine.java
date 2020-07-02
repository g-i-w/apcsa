public class FileLine {

  String line;
  ArrayList<File> fileList;
  
  public FileLine ( File f, String s ) {
    fileList = new ArrayList<File>();
    fileList.add( f );
    line = s;
  }
  
  public String getLine () {
    return line;
  }
  
  public 

}