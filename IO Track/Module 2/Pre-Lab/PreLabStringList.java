import java.util.*;

public class PreLabStringList {

  // define an ArrayList variable that is able to contain a list of StringContainer objects
  private ___________<__________> allStringContainers;


  // create a constructor method that initializes the allStringContainers variable, using the new keyword
  public __________________ () {
    allStringContainers = _____ ______________ ;
  }


  // create a method to add one StringContainer object to the allStringContainers ArrayList
  ______ addStringContainer ( String s ) {
    StringContainer _______ = new StringContainer( s );
    ___________________.add( _______ );
  }


  // create a method to calculate the average numerical value of the set of StringContainer objects in the ArrayList
  ______ double average () {
    // define and initialize a variable to hold the total sum of StringContainer values
    ___ total = 0;
    // write a for loop that loops through each StringContainer object (using the .size() method)
    for (int i=0; i<allStringContainers._____(); i++) {
      // create a StringContainer variable to hold a reference to a StringContainer object in the ArrayList (using the .get() method)
      StringContainer __________ = allStringContainers.____( i );
      // add the integer value from this StringContainer object to the total
      total += __________.____________();
    }

    // calculate the average numerical value of all the StringContainer objects
    double avg = (double) ________ / _________________.size();
    return avg;
  }


  // create the public String method toString to return a combined string from each StringContainer
  ______ toString () {
    String allStrings = "";
    // complete the for-loop to loop through all StringContainer objects
    for (int i=__; i<______________._____(); i++) {
      String thisString = _______________.____( i );
      // combine each string in a StringContainer together with commas & spaces
      allStrings += thisString.________() + ", ";
    }
    // return the string that contains all the strings from StringContainer objects
    return _________ ;
  }

}
