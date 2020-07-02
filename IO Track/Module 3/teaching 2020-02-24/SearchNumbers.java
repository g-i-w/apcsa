import java.util.*;
import java.io.*;

public class SearchNumbers {

  // Instance variable:
  // A reference to an ArrayList of Doubles
  ArrayList<Double> uniqueSortedList;


  // Create a static method to read numbers from a file.
  public static ArrayList<Double> readNumberFile ( String s ) {
    ArrayList<Double> num = new ArrayList<Double>();
    try {
      // Create a new Scanner object from the file path String passed.
      Scanner scan = new Scanner( new File( s ) );
      // Loop through the lines in the file and convert them to Doubles.
      while( scan.hasNextLine() ) {
        // Add each Double to the ArrayList.
        num.add( Double.valueOf( scan.nextLine() ) );
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    // Return the ArrayList.
    return num;
  }


  // Create a static method to sort a list of numbers
  public static void bubbleSort ( ArrayList<Double> numbers ) {
    for (int a=0; a < numbers.size()-1; a++) {
      for (int b=0; b < numbers.size()-1-a; b++) {
        // Compare two double values.
        // If the first value is greater than the second, then we need to
        //  swap the two values.  If the second is greater than the first,
        //  or if they are equal, then we don't need to do anything.
        if (numbers.get(b).doubleValue() > numbers.get(b+1).doubleValue()) {
          // Use the remove() method to remove the second Double.  This will
          //  cause all the following indices to shift up by 1.
          // Use the add() method to insert the second value into the index of
          //  the first value.  This will cause the first Double (and all the
          //  following indices) to shift down by 1.
          numbers.add( b, numbers.remove(b+1) );
        }
      }
    }
  }


  // Create a method to print the list of numbers
  public static void printList ( ArrayList<Double> number ) {
    System.out.println( "---" );
    for (  Double d : number ) System.out.println( d );
  }


  // Constructor:
  // Assign an ArrayList<Double> reference to uniqueSortedList from
  //  a call to readNumberFile().  Pass the file path String that was passed
  //  to the readNumberFile() method.
  // Call the printList() method with the ArrayList to display the list before
  //  it is sorted.
  // Call the bubbleSort() method with the ArrayList to sort the list.
  // Call the printList() method again with the ArrayList to display the list
  //  after it is sorted.
    public SearchNumbers( String t ) {
    uniqueSortedList = readNumberFile( t );
    printList( uniqueSortedList );
    bubbleSort( uniqueSortedList );
    printList( uniqueSortedList );
  }


  // Create a recursive method to search for a number
  // Return the index of the number if found.
  // Return -1 if the number is not found.
  public int binarySearch ( double number, int start, int end, int call ) {
    // The variables start and end will keep moving closer together, each call.
    // If start and end are the same, there is still a chance the number is
    //  located at that index.
    // But, if start and end reverse (start > end), then we know we have checked
    //  every index, and the number has not been found; so we return -1.
    if (start > end) return -1;

    // Calculate the middle index (between start and end) if there are an odd
    //  number of indices, or an index beside the middle point if there are an
    //  even number of indices; essentially the average index.
    int mid = (start + end) / 2;
    // If we want to be safe from the possibility of overflow, we can Calculate
    //  the middle point using this modified average formula:
    //         mid = start + (end-start)/2

    // Find the value at the middle index of uniqueSortedList
    double numberAtMidIndex = uniqueSortedList.get(mid).doubleValue();

    // Print each recursive call to this method.
    // This is not necessary for a binary search, but is helpful to show the
    //  "depth" of the recursive calls.
    System.out.println( "binarySearch "+call+": found "+numberAtMidIndex+" at index "+mid );
    call++;

    // Check to see if number is equal to numberAtMidIndex
    if (number == numberAtMidIndex) {
      // If so, then we found the number, and we can return mid as the index.
      return mid;
    // Otherwise, check to see if number is smaller than numberAtMidIndex.
  } else if (number < numberAtMidIndex) {
      // If so, then we need to change our search range to start <--> mid-1.
      // Call this method again with the new search range.
      return binarySearch( number, start, mid-1, call );
    // Otherwise the number must be larger than numberAtMidIndex.
    } else {
      // Change our search range to mid+1 <--> end.
      // Call this method again with the new search range.
      return binarySearch( number, mid+1, end, call );
    }

  }


  // Create a method with the same name binarySearch(), that receives a number
  //  to search, and calls the other binarySearch() method with the default
  //  start <--> end range (which is 0 to the last index).
  public int binarySearch ( double b ) {
    return binarySearch( b , 0, uniqueSortedList.size()-1, 0 );
  }


  // main method:
  // Create a main method that creates a SearchNumbers object.
  // Call the binarySearch() method on the SearchNumbers object.
  // Print the value returned by the binarySearch() method.
  public static void main(String[] args) throws Exception {
    SearchNumbers sn = new SearchNumbers(args[0]);
    int index = sn.binarySearch( Double.valueOf(args[1]));
    System.out.println( "binarySearch returned "+index );
  }

}
