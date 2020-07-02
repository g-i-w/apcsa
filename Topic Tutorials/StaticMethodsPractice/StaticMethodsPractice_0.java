public class StaticMethodPractice {

  static double sumTwo( double a, double b  ) {
    double sum = a + b;
    return sum;
  }

  public static void main (String[] args) {
    int someSum = sumTwo( 10, 20 );
    System.out.println( someSum );
  }

}
