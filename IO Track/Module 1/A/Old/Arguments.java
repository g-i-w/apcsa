public class Arguments {

  // data structure
  String[] arguments;
  String delimiter;

  // constructor
  public Arguments ( String[] args, String d ) {
    arguments = args;
    delimiter = d;
  }

  public void printArgs () {
    if (arguments.length > 0) {
      // print the first argument
      System.out.print( arguments[0] );
      // loop through the remaining arguments
      int i = 1;
      while (i < arguments.length) {
        // print the delimiter and an argument
        System.out.print( delimiter + arguments[i] );
        i++;
      }
      // print next line char
      System.out.println();
    } else {
      // if arguments.length is 0...
      System.out.println("No arguments were passed!");
    }
  }

}
