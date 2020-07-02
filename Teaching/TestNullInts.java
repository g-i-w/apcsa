public class TestNullInts {
  public static void main(String[] args) {
    int[] a = new int[4];
    a[0]++;
    a[2]++;
    for (int i : a) System.out.println( i );

    int b;
    //System.out.println( b );
    //b++;
    //System.out.println( b );
  }
}
