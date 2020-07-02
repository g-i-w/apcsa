import java.util.List;
import java.util.ArrayList;

public class Rocket extends FreeBody {

  // data structure
  private List<Double> thrustCurve;
  private double timeInterval; // length of time between points
  private double rocketMass;
  private double rocketAngle;
  private static Vector gravity = new Vector( 0.0, -9.8 );
  private static Vector zero = new Vector();

  // constructor
  public Rocket ( List<Double> r, double m ) {
    super( m, zero, zero, gravity ); // calls the constructor in FreeBody
    thrustCurve = r;
    rocketMass = m;
    timeInterval = 0.1;
    rocketAngle = 90.0;
  }

  // constructor
  public Rocket ( List<Double> r, double m, double t, double a ) {
    super( m, zero, zero, gravity ); // calls the constructor in FreeBody
    thrustCurve = r;
    rocketMass = m;
    timeInterval = t;
    rocketAngle = a;
  }

  public void launch() {
    // on the pad
    System.out.println( currentLocation() );
    System.out.println( "Lift off!" );
    // thrust phase
    for (Double thrustMagnitude : thrustCurve) {
      // force from thrust
      Vector forceVector = Vector.createFromPolar( thrustMagnitude, rocketAngle );
      // apply the force vector
      nextInterval( timeInterval, forceVector );
      // set a new angle based on the new velocity
      rocketAngle = currentVelocity().getAngle();
      System.out.println( currentLocation() );
    }
    System.out.println( "Gliding..." );
    // glide phase
    while (currentLocation().getY() > 0) {
      nextInterval( timeInterval );
      System.out.println( currentLocation() );
    }
  }

}
