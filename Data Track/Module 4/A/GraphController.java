public class GraphController {
  public static void main (String[] args) {

    GraphModel model = new GraphModel();
    GraphView view = new GraphViewGUI( model );

    // plot a parabola
    for (double x=-100; x<400; x++) {
      double y = 0.01*x*x - 3*x - 50;
      model.plotPoint( x, y );
    }

    view.refresh();

  }
}
