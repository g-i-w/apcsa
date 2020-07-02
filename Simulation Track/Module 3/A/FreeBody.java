import java.util.List;
import java.util.ArrayList;

public class FreeBody {

  // data structure
  private List<Vector> locationList;
  private List<Vector> velocityList;
  private List<Double> timeList;
  private double mass;
  private Vector gravitationalAcceleration;


  // constructor
  public FreeBody ( double m, Vector initLocation, Vector initVelocity, Vector g ) {
    // initialize the data structure
    locationList = new ArrayList<Vector>();
    velocityList = new ArrayList<Vector>();
    timeList = new ArrayList<Double>();
    locationList.add( initLocation );
    velocityList.add( initVelocity );
    timeList.add( 0.0 ); // here Java "auto-boxes" a primative into an object!
    gravitationalAcceleration = g;
    mass = m;
  }

  // get the current Vectors and values
  public List<Vector> getLocations () {
    return locationList;
  }
  public List<Vector> getVelocities () {
    return velocityList;
  }
  public List<Double> getTimes () {
    return timeList;
  }
  public Vector currentLocation () {
    return locationList.get( locationList.size()-1 );
  }
  public Vector currentVelocity () {
    return velocityList.get( velocityList.size()-1 );
  }
  public double currentTime () {
    return timeList.get( timeList.size()-1 ).doubleValue();
  }

  // calculate Vectors for the next time interval
  public void nextInterval ( double t, Vector forceVector ) {
    // calculate the acceleration
    Vector acceleration = forceVector // continues...
              .multiply( 1.0/mass )
              .vectorAddition( gravitationalAcceleration );

    // calculate a new velocity
    Vector nextVelocity = currentVelocity() // continues...
              .vectorAddition( acceleration.multiply( t ) );

    // add the new velocity to the velocityList
    velocityList.add( nextVelocity );

    // calculate a new location
    Vector nextLocation = currentLocation() // continues...
              .vectorAddition( acceleration.multiply(0.5).multiply(Math.pow(t,2)) )
              .vectorAddition( currentVelocity().multiply(t) );

    // add the new location to the locationList
    locationList.add( nextLocation );

    // add the new time to the timeList;
    timeList.add( currentTime() + t );
  }

  // call the other nextInterval() with a zero-Vector
  public void nextInterval ( double t ) {
    nextInterval( t, new Vector() );
  }

}
