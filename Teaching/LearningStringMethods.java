public class LearningStringMethods {
  public static void main (String[] args) {
    int total = 0;

    for (int i=0; i<args.length; i++) {

      String argument = args[i];

      for (int c=0; c<argument.length(); c++) {

        String smallString = argument.substring(c,c+1);

        if (smallString.equals("A")) {
          total++;
        }
      }
    }

  }
}
