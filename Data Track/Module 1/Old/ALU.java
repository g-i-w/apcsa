public class ALU {

  public static byte add (byte a, byte b) {
    return a+b;
  }

  public static byte sub (byte a, byte b) {
    return a-b;
  }

  public static byte mul (byte a, byte b) {
    return a*b;
  }

  public static byte div (byte a, byte b) {
    return a/b;
  }

  public static byte cmp (byte a, byte b) {
    if (a==b) return 0;
    else if (a>b) return 1;
    else if (a<b) return 2;
  }

}
