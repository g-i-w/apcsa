public class TestLine {
  public static void main(String[] args) {
    Point p1 = new Point( 10.0, 20.0 );
    Point p2 = new Point( 12.0, 22.0 );

    Line l1 = new Line( p1, p2 );

    Line l2 = new Line( 10.0, 20.0, 12.0, 22.0 );

    System.out.println( p1+", "+p2+", "+l2.firstPoint()+", "+l2.secondPoint() );
    System.out.println( l1 + "\n" + l2 );
  }
}
