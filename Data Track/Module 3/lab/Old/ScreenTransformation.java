import shapes.*;
import java.util.*;

public class ScreenTransformation {

  // data structure
  private GraphModel model;
  private int xResolution;
  private int yResolution;
  private double scaleFactor;

  // constructor
  ScreenTransformation ( GraphModel m ) {
    model = m;
    xResolution = 0;
    yResolution = 0;
    scaleFactor = 0;
  }

  // set the resolution
  public void setResolution ( int x, int y ) {
    xResolution = x;
    yResolution = y;
    calculateScaleFactor();
  }

  private void calculateScaleFactor () {
    // model deltas
    double deltaX = model.maxX()-model.minX();
    double deltaY = model.maxY()-model.minY();
    // guard against a divide-by-zero
    if (deltaX == 0 || deltaY == 0) {
      scaleFactor = 0;
    } else {
      double xFactor = (double)(xResolution-1) / deltaX;
      double yFactor = (double)(yResolution-1) / deltaY;
      scaleFactor = Math.min( xFactor, yFactor );
    }
  }

  // all Lines added to the model
  public ArrayList<Line> getLines () {
    calculateScaleFactor();
    ArrayList<Line> screenLines = new ArrayList<Line>();
    for (Line modelLine : model.getLines()) {
      screenLines.add( transformLine(modelLine) );
    }
    return screenLines;
  }

  // x axis Line
  public Line getAxisX () {
    calculateScaleFactor();
    return new Line ( 0, translateY(0), xResolution, translateY(0) );
  }

  // y axis Line
  public Line getAxisY () {
    calculateScaleFactor();
    return new Line ( translateX(0), 0, translateX(0), yResolution );
  }

  // String displaying all axes and lines
  public String toString() {
    String output = "";
    output += getAxisX() + "\n";
    output += getAxisY() + "\n";
    for (Line l : getLines()) {
      output += l + "\n";
    }
    return output;
  }

  // shift x axis to the right (and scale)
  private double translateX (double x) {
    return (-model.minX() + x) * scaleFactor;
  }

  // invert y axis (and scale)
  private double translateY (double y) {
    return (model.maxY() - y) * scaleFactor;
  }

  // apply x and y translations to a Point
  private Point translatePoint ( Point modelPoint ) {
    return new Point(
      translateX( modelPoint.getX() ),
      translateY( modelPoint.getY() )
    );
  }

  // apply Point translations to create a Line transformation
  private Line transformLine ( Line modelLine ) {
    Line newLine = new Line(
      translatePoint( modelLine.firstPoint() ),
      translatePoint( modelLine.secondPoint() )
    );
    return newLine;
  }

}
