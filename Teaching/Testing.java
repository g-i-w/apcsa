public class Testing {
  private int a;


  public Testing (int i) {
    a = i;
  }

  public static int getA () {
    return a;
  }

  public static int getAnother ( Testing t ) {
    return t.a;
  }
}
