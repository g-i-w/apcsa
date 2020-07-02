public class GraphViewText implements GraphView {

  // data struture
  private GraphModel model;
  private ScreenTransformation screen;
  private String[][] viewArray;
  private int xResolution;
  private int yResolution;
  private String whitePixel = ".";
  private String blackPixel = "#";


  // connect this GraphView object to a GraphModel object
  public GraphViewText ( GraphModel aGraphModel ) {
    model = aGraphModel;
    setResolution( 50, 50 ); // default
  }

  // set the resolution (integer) of the view
  public void setResolution ( int xRes, int yRes ) {
    xResolution = xRes;
    yResolution = yRes;
  }

  // display a graph using Line objects
  public void refresh () {
    // create a new screen object
    screen = new ScreenTransformation( model, xResolution, yResolution );

    // size array using row-major order
    viewArray = new String[yResolution][xResolution];

    // initialize array with empty (space) characters
    for (int y=0; y<viewArray.length; y++) {
      for (int x=0; x<viewArray[0].length; x++) {
        viewArray[y][x] = whitePixel;
      }
    }

    // loop through the Line objects
    Line[] lines = screen.getLines();
    for (int i=0; i<lines.length; i++) {
      drawLine( lines[i] );
    }

    // print the viewArray matrix
    for (int a=0; a<viewArray.length; a++) {
      String rowText = "";
      for (int b=0; b<viewArray[a].length; b++) {
        rowText += viewArray[a][b];
      }
      System.out.println(rowText);
    }
  }

  // additional method not specified in interface
  public void drawLine ( Line line ) {
    double x0 = line.firstPoint().getX();
    double y0 = line.firstPoint().getY();
    double x1 = line.secondPoint().getX();
    double y1 = line.secondPoint().getY();
    double deltaX = x1-x0;
    double deltaY = y1-y0;
    int xSign = (int) Math.signum(deltaX);
    int ySign = (int) Math.signum(deltaY);
    // plot the line
    for ( int x = (int) Math.round(x0); x != (int) Math.round(x1); x += xSign ) {
      int y = (int) Math.round( deltaY/deltaX * (x-x0) + y0 );
      if (x<xResolution && y<yResolution) viewArray[y][x] = blackPixel;
    }
  }

}
