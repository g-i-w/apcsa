public class DataArrayFile {

  private File myFile;
  private String myDelimiter;
  private ArrayList<ArrayList<String>> myData;
  private Scanner fileReader;
  private PrintWriter fileWriter;

  public DataArrayFile ( File file, String delimiter ) throws IOException {
    // Initialize instance variables
    myFile = file;
    myDelimiter = delimiter;
    myData = new ArrayList<ArrayList<String>>; // each sub ArrayList<String> has not yet been intialialized.
    fileReader = new Scanner( myFile );
    fileWriter = new PrintWriter( myFile );

    // Loop through each line in the file.
    while (fileReader.hasNextLine()) {
      // Create a String from the nextLine() method.
      String line = fileReader.nextLine();
      // Create a new String[] array from the split() method.
      String[] dataArray = line.split( myDelimiter );
      // Create a new ArrayList<String> object.
      ArrayList<String> dataList = new ArrayList<String>();
      // Loop through each String in the String[] array and add to the ArrayList.
      for (String data : dataArray) {
        dataList.add( data );
      }
      // Add the ArrayList<String> to the ArrayList<ArrayList<String>>.
      myData.add( dataList );
    }

  }


  public ArrayList<ArrayList<String>> getArrayList2D () {
    return myData;
  }


  public String[][] getArray2D () {
    String[][] array2D = new String[ myData.size() ][];

    for (int a=0; a<myData.size(); a++) {

      ArrayList<String> mySubData = myData.get(a);

      array2D[a] = new String[ mySubData.size() ];

      for (int b=0; b<mySubData.size(); b++) {
        array2D[a][b] = mySubData.get(b);
      }

    }

    return array2D;
  }


}
