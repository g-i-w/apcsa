public class Arguments {
  public static void main (String[] args) {

    // check to see if there are any command line arguments
    if (args.length > 0) {
      // loop through the command line arguments
      int i = 0;
      while (i < args.length) {
        // print each argument
        System.out.println( args[i] );
        i++;
      }
    } else {
      // if there are no arguments, print a message
      System.out.println("No arguments were passed!");
    }

  }
}
