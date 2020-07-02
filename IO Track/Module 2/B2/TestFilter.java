public class TestFilter {

  public static void main(String[] args) {

    // check to make sure at least 3 arguments were passed on the command line
    if (args.length >= 3) {
      int length;
      try {
        // try to create an int fron the args[2] String
        length = Integer.valueOf( args[2] );
      } catch (Exception e) {
        // otherwise print an error message and return from main (end program)
        System.out.println( "Couldn't convert " + args[2] + " to an integer!");
        return;
      }
      // create a new Filter object
      Filter f = new Filter( args[0], args[1], length );
      // call the movingAverage() method on the Filter object
      f.movingAverage();

    } else {
      // otherwise, print an error message
      System.out.println( "Arguments required: name of file to read, name of file to write, length of filter." );

    }

  }

}
