public class TestGraphModel {
  public static void main (String[] args) {

    GraphModel g1 = new GraphModel();
    GraphModel g2 = new GraphModel();

    for (double x = -10; x <= 10; x++) {
      double y = x*x;
      g1.plotPoint( x, y );
    }

    g2.addLine( new Line(1.0,1.0,15.0,1.0) );
    g2.addLine( new Line(1.5,1.75,17.5,3.2) );

    System.out.println( g1 );
    System.out.println( g2 );

  }


}
