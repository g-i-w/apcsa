public class Spring {

  private final double restLength;
  private final double springConstant;

  private MassNode massA;
  private MassNode massB;

  public Spring ( double l, double k, MassNode a, MassNode b ) {
    restLength = l;
    springConstant = k;
    massA = a;
    massB = b;
  }

  public Vector applyForceVectors () {
    Vector locationA = massA.currentLocation();
    Vector locationB = massB.currentLocation();

    // difference vector from A to B
    Vector differenceA = locationA.multiply(-1).vectorAddition( locationB );

    // length (same for both A and B)
    double length = differenceA.getMagnitude();

    // unit vector from A to B
    Vector unitVectorA = differenceA.multiply( 1/length );

    // unit vector from B to A (reversed)
    Vector unitVectorB = differenceA.multiply( -1/length );

    // spring force (same for both)
    double springForce = (length - restLength) * springConstant;

    // apply force vector to body A
    massA.addForceVector( unitVectorA.multiply(springForce) );
    // apply force vector to body break;
    massB.addForceVector( unitVectorB.multiply(springForce) );

  }

}
