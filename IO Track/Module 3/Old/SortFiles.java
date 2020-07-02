import java.util.*;
import java.io.*;

public class SortFiles {
  
  public static void bubbleSort ( ArrayList<File> list ) {
    for (int a=0; a<list.size()-1; a++) {
      for (int b=0; b<list.size()-1-a; b++) {
        File f1 = list.get(b);
        File f2 = list.get(b+1);
        // if f1.getName() should come after f2.getName()
        if (f1.getName().compareTo(f2.getName()) > 0) {
          list.add( b, list.remove(b+1) );
        }
        // otherwise, just leave the order as it is
      }
    }
  }
  
}
  
