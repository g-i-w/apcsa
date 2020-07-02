public class NumberFile {

  public static void main (String[] args) {

    // print the number of command line arguments that were passed
    if (args.length < 1) {
      System.out.println( "No args!" );
      return; // leave the main method and the program ends
    }

    // create a dynmaic array to hold an unknown number of StringContainer objects
    ArrayList<StringContainer> containers = new ArrayList<>();


    for (int i=0; i<args.length; i++) {

      // Create a new StringContainer object and place a reference in aContainer
      StringContainer aContainer = new StringContainer( args[i] );

      // attach the new StringContainer object to the end of the containers array
      containers.add( aContainer );

      // print the integer value of the StringContainer objects
      System.out.println( aContainer.getStr() + " " + aContainer.getInt() );

      // This does exactly the same thing (prints it again)
      System.out.println( containers.get(i).getStr() + " " + containers.get(i).getInt() );

    }

  }

}
