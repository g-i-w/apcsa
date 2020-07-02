import java.util.List;
import java.util.ArrayList;

public class TestRocket {
  public static void main (String[] args) {

    // define a thrust curve for the rocket
    List<Double> thrustCurve = new ArrayList<Double>();
    thrustCurve.add( 25.0 );
    thrustCurve.add( 50.0 );
    thrustCurve.add( 100.0 );
    thrustCurve.add( 120.0 );
    thrustCurve.add( 80.0 );
    thrustCurve.add( 30.0 );
    thrustCurve.add( 25.0 );
    thrustCurve.add( 20.0 );
    thrustCurve.add( 15.0 );
    thrustCurve.add( 12.0 );
    thrustCurve.add( 10.0 );
    thrustCurve.add( 8.0 );
    thrustCurve.add( 3.0 );

    // create a rocket
    Rocket rocket = new Rocket( thrustCurve, 1.0, 0.1, 80.0 );

    // launch the rocket
    rocket.launch();

    // create models and views to graph the launch
    GraphModel locationModel = new GraphModel();
    GraphView locationView = new GraphViewText( locationModel );
    GraphModel velocityModel = new GraphModel();
    GraphView velocityView = new GraphViewText( velocityModel );

    // plot locationY(locationX)
    for (Vector location : rocket.getLocations())
      locationModel.plotPoint( (Point) location );

    // plot locationY(t)
    for (int i=0; i<rocket.getLocations().size(); i++)
      velocityModel.plotPoint( i, rocket.getLocations().get(i).getY() );

    velocityModel.endPlot();

    // plot velocityY(t)
    for (int i=0; i<rocket.getVelocities().size(); i++)
      velocityModel.plotPoint( i, rocket.getVelocities().get(i).getY() );

    locationView.refresh();

    velocityView.setResolution(100,100);
    velocityView.refresh();


  }
}
