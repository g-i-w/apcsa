import java.util.*;

public class PreLabArrayLists {

  private ArrayList<String> listOfStrings;
  private ArrayList<Integer> listOfIntegers;
  private ArrayList<Double> listOfDoubles;


  // constructor
  public PreLabArrayLists () {
    listOfStrings = new ArrayList<String>();
    listOfIntegers = new ArrayList<Integer>();
    listOfDoubles = new ArrayList<Double>();
  }


  public void addString ( String s ) {
    listOfStrings.add( s );
  }


  public void addInteger ( int i ) {
    listOfIntegers.add( new Integer(i) );
    // Java will automatically create a new Integer object if you only pass a primitive int.
    // Like this: listOfIntegers.add( i );
  }


  public void addDouble ( double d ) {
    listOfDoubles.add( new Double(d) );
    // Could also could write: listOfDoubles.add( d );
  }


  // returns the sum of all the integer and the double values
  public double getSumOfAllValues () {
    double total = 0.0;

    // loop through each Integer object
    for (int i=0; i<listOfIntegers.size(); i++) {
      Integer integerObject = listOfIntegers.get( i );
      total += integerObject.intValue();
    }

    // loop through each Double object
    for (int i=0; i<listOfDoubles.size(); i++) {
      Double doubleObject = listOfDoubles.get( i );
      total += doubleObject.doubleValue();
    }

    return total;
  }


  // returns a String containing all the strings separated by spaces
  public String getAllStrings () {
    String allStrings = "";

    // loop through all the String objects in listOfStrings
    for (int i=0; i<listOfStrings.size(); i++) {
      String stringObject = listOfStrings.get( i );
      allStrings += stringObject + " ";
    }

    return allStrings;
  }

}
