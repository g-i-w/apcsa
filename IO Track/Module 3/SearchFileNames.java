import java.util.*;
import java.io.*;

public class SearchFileNames {
  ArrayList<File> sortedList;

  public SearchFileNames ( ArrayList<File> list ) {
    bubbleSort( list );
    sortedList = list;
  }


  public static void bubbleSort ( ArrayList<File> list ) {
    for (int a=0; a<list.size()-1; a++) {
      for (int b=0; b<list.size()-1-a; b++) {
        String f1 = list.get(b).getName();
        String f2 = list.get(b+1).getName();
        // if f1.getName() should come after f2.getName()
        if (f1.compareTo(f2) > 0) {
          list.add( b, list.remove(b+1) );
        }
        // otherwise, just leave the order as it is
      }
    }
  }


  private int binarySearch ( String firstChars, int start, int end, int call ) {
    int mid = (start + end) / 2;
    // if (end-start) == 1, then mid==start
    System.out.println( call + " " + sortedList.get(mid).getName() );

    // ensure mid > start
    if (start >= mid) return start;

    // make comparison
    // remember: start might be equal to (mid-1)
    int compareToMid_1 = firstChars.compareTo(sortedList.get(mid-1).getName());
    int compareToMid = firstChars.compareTo(sortedList.get(mid).getName());

    // boolean statements about index (mid - 1)
    boolean beforeMid_1 = (compareToMid_1 < 0);
    boolean exactMatchMid_1 = (compareToMid_1 == 0);
    boolean afterMid_1 = (compareToMid_1 > 0);

    // boolean statements about index mid
    boolean beforeMid = (compareToMid < 0);
    boolean exactMatchMid = (compareToMid == 0);
    boolean afterMid = (compareToMid > 0);


    if (exactMatchMid_1 || beforeMid_1) {
      return binarySearch( firstChars, start, mid-1, ++call );

    } else if (exactMatchMid) {
      return mid;

    } else if (afterMid_1 && beforeMid) {
      return mid-1;

    } else {
      return binarySearch( firstChars, mid+1, end, ++call );

    }


  }


  public ArrayList<File> getFiles ( String firstChars ) {
    ArrayList<File> matches = new ArrayList<>();
    int start = binarySearch( firstChars, 0, sortedList.size()-1, 0 );
    while (sortedList.get(start).getName().indexOf(firstChars) == 0) {
      matches.add( sortedList.get(start) );
      start++;
      if (start>sortedList.size()-1) break;
    }
    return matches;
  }


}
