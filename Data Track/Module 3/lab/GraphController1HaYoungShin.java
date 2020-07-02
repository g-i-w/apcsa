import shapes.*;
import java.util.*;
import java.awt.Color;

public class GraphController1HaYoungShin {
  public static void main (String[] args) throws Exception {

    // Create a reference to a new GraphModelShapes object
    GraphModelShapes model = new GraphModelShapes(10, 10, -10, -10, new Color(255,255,255));

    // Create references to 2 GraphView objects
    //  (1 GraphViewText object and 1 GraphViewGUI object)
    GraphView graphViewObject1 = new GraphViewText(model, 40, 40);
    graphViewObject1.refresh();
    GraphView graphViewObject2 = new GraphViewGUI(model, 500, 500, new Color(80, 100, 30));
    graphViewObject2.refresh();


    // loop (using a double) from -50 to 150, incrementing by 10 each loop
    for (double x=-50; x<=150; x+=10) {
      double y = 0.03*x*x - 3*x - 50;

      // call plotPoint( x, y ) on the model object
      model.plotPoint(x, y);
      // call refresh() on the GraphViewText object
      // call refresh() on the GraphViewGUI object
      graphViewObject1.refresh();
      graphViewObject2.refresh();

      // delay execution 500 milliseconds (0.5 seconds)
      Thread.sleep(500);
    }
  }
}
