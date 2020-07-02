public class ScreenTransformation {

  // data structure
  private GraphModel model;
  private int xResolution;
  private int yResolution;
  private double scaleFactor;


  // constructor
  ScreenTransformation ( GraphModel m, int x, int y ) {
    model = m;
    xResolution = x;
    yResolution = y;
    // use the smallest scale factor (so everything fits)
    double xFactor = (double)(xResolution-1) / (model.maxX()-model.minX()+1);
    double yFactor = (double)(yResolution-1) / (model.maxY()-model.minY()+1);
    if (xFactor < yFactor)
      scaleFactor = xFactor;
    else
      scaleFactor = yFactor;
  }


  // all Lines added to the model
  public Line[] getLines () {
    Line[] lines = model.getLines();
    for (int i=0; i<lines.length; i++) {
      lines[i] = transformLine( lines[i] );
    }
    return lines;
  }

  // x axis Line
  public Line getAxisX () {
    return new Line ( 0, translateY(0), xResolution, translateY(0) );
  }

  // y axis Line
  public Line getAxisY () {
    return new Line ( translateX(0), 0, translateX(0), yResolution );
  }


  // shift x axis to the right (and scale)
  double translateX (double x) {
    return (-model.minX() + x) * scaleFactor;
  }

  // invert y axis (and scale)
  double translateY (double y) {
    return (model.maxY() - y) * scaleFactor;
  }

  // apply x and y translations to a Point
  Point translatePoint ( Point modelPoint ) {
    return new Point(
      translateX( modelPoint.getX() ),
      translateY( modelPoint.getY() )
    );
  }

  // apply Point translations to create a Line transformation
  Line transformLine ( Line modelLine ) {
    Line newLine = new Line(
      translatePoint( modelLine.firstPoint() ),
      translatePoint( modelLine.secondPoint() )
    );
    return newLine;
  }

}
