import java.util.*;
import java.io.*;

           SearchFileNames {

   // Instance variable:
   // Create an ArrayList<File> variable that can reference
   //  an ArrayList containing File objects.


   // Constructor:
   // Write a constructor method that receives an ArrayList<File>
   //  reference.
                            ( ArrayList<File> list ) {
    /*
     - Pass the ArrayList<File> reference to the bubbleSort() static
       method (only static methods can be called from inside of a
       constructor).
     - Assign the ArrayList<File> that was passed, to the instance variable.
    */
  }



  // Write a static method to implement a Bubble Sort, which will be
  //  used to sort an ArrayList<File>.
  // This method receives a reference to an ArrayList<File> as an
  //  argument.
                      bubbleSort (                  ) {
    /*
    - Create a for-loop within another for-loop.  The outer loop should
      loop from 0 to the last index - 1, and the inner for-lop should
      start by looping from 0 to the last index - 1, but then 1 less
      each time after that.
    */
    for (                         ) {
      for (                         ) {
      /*
      - Create 2 String variables with the names of two sequential File
        objects (using the inner loop variable) from the ArrayList<File>
        that was passed to this method.
      */
        String name0 =        .get(   ).getName();
        String name1 =        .get(   + 1 ).getName();
      /*
      - Write an if-statement that uses the compareTo() method to compare
        the names of the File objects.  If you are unsure how compareTo()
        works, Google "String docs.oracle.com", then click on
        "String (Java Platform SE 7 ) - Oracle Help Center" and search the
        page for the compareTo method.
      - If name0 should come after name1, then use the remove() method to
        remove the second File object and use the add() method to insert
        the second File object at the index of the first File object.
      - If name0 and name1 are in the correct order, or if they are the
        same, then leave them as they are.
      */
        if (        .compareTo(        ) ) {

        }

      }
    }
  }



    // Write an instance method to implement a recursive binary search.
                   binarySearch ( String firstChars, int start, int end, int call ) {
    /*
    Description of the parameter variables:
    - String firstChars contains the first few characters of the name
      of a file we are searching for.
    - int start, int end are the begining and ending indices where we start
      searching in the ArrayList<File> instance variable.
    - int call is not a necessary part of the binary search, but it is used
      to keep track of how many recursive calls are made to this method.
    */


    // Find a middle index, halfway between start and end.  If there are an even
    //  number of indices between start and end, then as close to the middle as
    //  possible.
    int mid =                      ;

    // Print the value of call and the name of the File object located at that
    //  middle index.
    System.out.println( call + " " +             .get(mid).getName() );
    // Increment call so that it keeps track of how many recursive calls have
    //  been made to this method.
    call++;


    /*
    What we want to accomplish with this binary search:
    - Remember there might be multiple file names that begin with the characters
      we are searching (the firstChars variable).
    - We want to find the file name at the smallest index in the sorted
      ArrayList<File> that matches our search.
    - Also, it's possible that there is no file that matches our search exactly.
      - If no file name matches, then we want to return the next file name after
        the place in the list where our searched file name would be located (if
        it existed).


    Example:

      Search: abc
       +------------+
    0  | aaabc      |
       +------------+
    1  | abccc      | <-- match (return this index)
       +------------+
    2  | abccc      | <-- match
       +------------+
    3  | abcee      | <-- match
       +------------+
    4  | bcde       |
       +------------+

    - We want to return index 1 because "abc" comes after "aaabc", and index 1
      is the next (smallest) index that contain a match with our search.
    - We need an if-statement with two comparisons: the index before mid, and
      the index at mid.
    - Refer to the SearchNumbers.java pre-lab binarySearch for help.
    - Keep in mind, the binary search in SearchNumbers.java is more simple,
      and only looks for exact matches.  Also, if there are duplicate entries
      in the list, the binary search in SearchNumbers.java will return the first
      entry it finds, even if that index is not the smallest index.
    - In the example above, if index 2 was found as a match, then we would still
      need to search above index 2 because index 1 does not come before our
      search characters.  Index 0 does come before our search characters, so
      index 1 is the smallest index that is a match.

    */

  }


  // Return an ArrayList<File> containing only the set of Files with names
  //  that match our search.
  public ArrayList<File> getFiles ( String firstChars ) {
    /*
    - This method receives a String containing characters to search.
    - This method calls binarySearch(  ) to get the smallest index that matches
      our search String (firstChars).
    - This method creates a new ArrayList<File> that will only hold matches
      with our search String.
    - Starting with the index returned by binarySearch(  ), this method
      sequentially moves down the sorted ArrayList<Files> instance variable and
      copies references to each File object with a name that matches our
      search.
    - The new ArrayList<File> containing matching File objects is returned.
    */
    ArrayList<File> matches = new ArrayList<>();
    int start = binarySearch( firstChars, 0, __________.size()-1, 0 );
    while ( __________.get(start).getName().indexOf(firstChars) == 0) {
      matches.add( __________.get(start) );
      start++;
      if (start > __________.size()-1) break;
    }
    return matches;
  }


}
