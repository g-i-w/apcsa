import java.lang.Math;

public class ThrowBall {
  public static void main (String[] args) {
    // a(t) = f/m
    // v(t) = (-9.80665)t + v0
    // s(t) = 1/2(-9.80665)t^2 + v0t + s0

    // vector values
    double initVelocity = 10;
    double angleAboveHoriz = 45;
    double angleAboveHorizRad = Math.toRadians(angleAboveHoriz);

    // initial Y values
    double yInitDistance = 0;
    double yInitVelocity = initVelocity * Math.sin(angleAboveHorizRad);

    // initial X values
    double xInitVelocity = initVelocity * Math.cos(angleAboveHorizRad);

    // quadratic formula to find t intercept
    double timeInAir = ( -yInitVelocity - Math.sqrt( Math.pow(yInitVelocity,2.0) - 4 * yInitDistance * 0.5 * -9.80665 ) ) / ( 2 * 0.5 * -9.80665 );

    // distance formula to find x(t)
    double xDistance = xInitVelocity * timeInAir;

    // velocity zero intercept
    // v1 = v0 + at
    // 0 = v0 + at
    // -v0 = at
    // t = -v0 / a
    double timeOfApogee = -yInitVelocity / -9.80665;
    // distance formula to find y(t)
    double yDistanceApogee = (0.5 * -9.80665 * Math.pow(timeOfApogee,2.0)) + (yInitVelocity * timeOfApogee) + yInitDistance;


    System.out.println("Height: "+yInitDistance);
    System.out.println("Y Velocity: "+yInitVelocity);
    System.out.println("X Velocity: "+xInitVelocity);
    System.out.println("Time In Air: "+timeInAir);
    System.out.println("Time of Apogee: "+timeOfApogee);
    System.out.println("Height at Apogee: "+yDistanceApogee);
    System.out.println("Distance: "+xDistance);
  }
}
