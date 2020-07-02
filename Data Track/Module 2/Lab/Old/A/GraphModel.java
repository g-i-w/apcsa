public class GraphModel {

  // holds a reference to the last plotted Point
  Point lastPoint;
  // array of Line objects
  Line[] allLines;
  // the index of the next Line object
  int nextLine;
  // the extrema of all the Points
  double maxX;
  double maxY;
  double minX;
  double minY;


  // constructor
  public GraphModel () {
    // initialize variables
    allLines = new Line[10];
    nextLine = 0;
    maxX = 0.0;
    maxY = 0.0;
    minX = 0.0;
    minY = 0.0;
  }

  // compare the extrema to the point, and resize extrema if needed
  private void checkExtrema ( Point point ) {
    if (point.getX() > maxX) maxX = point.getX();
    if (point.getX() < minX) minX = point.getX();
    if (point.getY() > maxY) maxY = point.getY();
    if (point.getY() < minY) minY = point.getY();
  }

  // add a new Line object to the allLines array
  public void addLine ( Line line ) {
    if (nextLine >= allLines.length) {
      Line[] largerArray = new Line[allLines.length + 10];
      for (int i=0; i<allLines.length; i++) {
        largerArray[i] = allLines[i];
      }
      allLines = largerArray;
    }
    allLines[ nextLine++ ] = line;
    checkExtrema( line.firstPoint() );
    checkExtrema( line.secondPoint() );
  }

  // line segment from the currentPoint to a new Point
  public void plotPoint ( Point point ) {
    if (lastPoint != null) addLine( new Line( lastPoint, point ) );
    lastPoint = point;
  }

  // line segment from the currentPoint to a new Point
  public void plotPoint ( double x, double y ) {
    Point point = new Point( x, y );
    plotPoint( point );
  }

  public String toString() {
    String output = "";
    for (int a=0; a<allLines.length; a++) {
      if (allLines[a] != null) output += allLines[a].toString()+"\n";
    }
    return output;
  }

}
