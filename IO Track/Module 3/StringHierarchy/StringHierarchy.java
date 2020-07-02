import java.util.*;

public class StringHierarchy {

  private int level;
  private String myString;
  private StringHierarchy myTrunk;
  private ArrayList<StringHierarchy> myBranches;


  public StringHierarchy ( String str ) {
    myString = str;
    level = 0;
    myBranches = new ArrayList<StringHierarchy>();
  }

  public StringHierarchy ( String str, StringHierarchy trunk ) {
    this( str );
    myTrunk = trunk;
    level = myTrunk.level + 1;
  }


  public String str () {
    return myString;
  }


  public StringHierarchy exists ( String branchName ) {
    for (StringHierarchy branch : myBranches) {
      if (branch.str().equals(branchName)) {
        return branch;
      }
    }
    // if we can't find the branchName, then return null.
    return null;
  }


  public StringHierarchy select ( String branchName ) {
    StringHierarchy branch = exists( branchName );
    if (branch != null) {
      return branch;
    } else {
      StringHierarchy newBranch = new StringHierarchy(branchName, this);
      myBranches.add( newBranch );
      return newBranch;
    }
  }


  public StringHierarchy attach ( String branchName ) {
    select(branchName);
    return this;
  }


  public StringHierarchy back () {
    return myTrunk;
  }


  public ArrayList<StringHierarchy> list () {
    return myBranches;
  }


  public String toString () {
    String treeString  = "";
    for (int i=0; i<level; i++) {
      treeString += "\t";
    }
    treeString += myString + "\n";
    for (StringHierarchy branch : myBranches) {
      treeString += branch;
    }
    return treeString;
  }

}
