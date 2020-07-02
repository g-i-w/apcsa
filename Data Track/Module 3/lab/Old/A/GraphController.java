public class GraphController {
  public static void main (String[] args) {

    GraphModel model = new GraphModel();
    GraphView view = new GraphViewText( model );

    model.plotPoint( -2.0,-2.0 );
    model.plotPoint( 2.0,1.0 );
    model.plotPoint( 3.0,5.0 );
    model.plotPoint( 5.0,8.0 );


    // print the graph
    view.refresh();

    // move the second Point of the first Line to the right
    model.getLines()[0].secondPoint().translate( 5,0 );

    // print the graph
    view.refresh();

    // change the resolution
    view.setResolution( 40, 40 );

    // print the graph
    view.refresh();

  }
}
