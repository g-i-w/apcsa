import java.util.Scanner;

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

    while (true) {
      Scanner userInput = new Scanner(System.in);  // Create a Scanner object
      System.out.print("\nEnter X,Y to change resolution:\n> ");
      String[] input = userInput.nextLine().split(",");  // Read user input
      if (input.length==2) view.setResolution( Integer.parseInt(input[0]), Integer.parseInt(input[1]) );
    }
  }
}
