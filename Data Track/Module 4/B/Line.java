public class Line {

  // data structure
  private Point firstPoint;
  private Point secondPoint;


  // constructor
  Line ( Point p0, Point p1 ) {
    firstPoint = p0;
    secondPoint = p1;
  }

  // constructor
  Line ( double x0, double y0, double x1, double y1 ) {
    firstPoint = new Point( x0, y0 );
    secondPoint = new Point( x1, y1 );
  }

  // first Point
  Point firstPoint () {
    return firstPoint;
  }

  // second Point
  Point secondPoint () {
    return secondPoint;
  }

  // Overrides the toString() method inherited from Object
  public String toString () {
    return firstPoint.toString()+"<-->"+secondPoint.toString();
  }

}
