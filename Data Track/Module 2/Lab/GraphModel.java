import java.util.*;

public class GraphModel {

  // holds a reference to the last plotted Point
  Point lastPoint;
  // List (interface) of Line objects
  List<Line> allLines;
  // the extrema of all the Points
  double maxX;
  double maxY;
  double minX;
  double minY;

  // constructor
  public GraphModel () {
    // initialize variables
    allLines = new ArrayList<Line>();
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

  // add a new Line object to the allLines List
  public void addLine ( Line line ) {
    allLines.add( line );
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

  public void endPlot () {
    lastPoint = null;
  }

  public List<Line> getLines () {
    return allLines;
  }

  public double maxX () {
    return maxX;
  }
  public double minX () {
    return minX;
  }
  public double maxY () {
    return maxY;
  }
  public double minY () {
    return minY;
  }

  public String toString() {
    String output = "";
    for (Line l : allLines) {
      output += l + "\n";
    }
    return output;
  }

}
