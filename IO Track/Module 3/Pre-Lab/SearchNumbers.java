import java.util.*;
import java.io.*;

public class SearchNumbers {

  // Instance variable
  // A reference to an ArrayList of Doubles
  ArrayList<Double> uniqueSortedList;


  // Create the static method readNumberFile() to read numbers from a file.
  public static ArrayList<Double> readNumberFile ( String filePath ) {
    ArrayList<Double> list = new ArrayList<>();
    try {
      Scanner numberFile = new Scanner( new File( filePath ) );
      while( numberFile.hasNextLine() ) {
        list.add( Double.valueOf( numberFile.nextLine() ) );
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return list;
  }

  // Create a static method bubbleSort() to sort a list of numbers
  public static void bubbleSort ( ArrayList<Double> list ) {
    for (int a=0; a<list.size()-1; a++) {
      for (int b=0; b<list.size()-1-a; b++) {
        if (list.get(b).doubleValue() > list.get(b+1).doubleValue()) {
          list.add( b, list.remove(b+1) );
        }
      }
    }
  }

  // Method to print the list of numbers
  public static void printList ( ArrayList<Double> list ) {
    System.out.println( "---" );
    for (Double d : list) System.out.println( d );
  }

  // Constructor
  public SearchNumbers ( String filePath ) {
    uniqueSortedList = readNumberFile( filePath );
    printList( uniqueSortedList );
    bubbleSort( uniqueSortedList );
    printList( uniqueSortedList );
  }

  // Recursive method to search for a number
  // Returns the index of the number (-1 if not found)
  public int binarySearch ( double number, int start, int end, int call ) {
    if (end < start) return -1;

    int mid = (start + end) / 2;
    // safe from overflow: mid = start + (end-start)/2
    double numberAtMidIndex = uniqueSortedList.get(mid).doubleValue();

    System.out.println( "binarySearch "+call+": found "+numberAtMidIndex+" at index "+mid );
    call++;

    if (number == numberAtMidIndex) {
      return mid;
    } else if (number < numberAtMidIndex) {
      return binarySearch( number, start, mid-1, call );
    } else {
      return binarySearch( number, mid+1, end, call );
    }


  }

  public int binarySearch ( double number ) {
    return binarySearch( number, 0, uniqueSortedList.size()-1, 0 );
  }


  public static void main(String[] args) throws Exception {
    SearchNumbers sn = new SearchNumbers( args[0] );
    int index = sn.binarySearch( Double.valueOf(args[1]) );
    System.out.println( "binarySearch returned "+index );
  }

}
