import java.util.*;
import java.io.*;

public class BallTrajectories {

  private Physics[][] physArray2D;


  public BallTrajectories ( double startHeight, double endHeight, double startAngle, double endAngle, double velocity ) {

    double[] heightValues = Physics.sequence( 1.0, startHeight, endHeight );
    double[] angleValues = Physics.sequence( 1.0, startAngle, endAngle );

    physArray2D = new Physics[ heightValues.length ][ angleValues.length ];

    for (int a=0; a<heightValues.length; a++) {
      for (int b=0; b<angleValues.length; b++) {
        physArray2D[a][b] = new Physics( velocity, angleValues[b], heightValues[a] );
      }
    }

  }


  public Physics[][] getPhysics () {
    return physArray2D;
  }



  public static void main(String[] args) {

    // instantiate an object of this class (yes, you can do that!)
    BallTrajectories bt = new BallTrajectories( 0.0, 100.0, 0.0, 90.0, 10.0 );

    try {

      PrintWriter dataFile = new PrintWriter( new File( args[0] ) );

      Physics[][] phys2D = bt.getPhysics();
      for (Physics[] phys1D : phys2D) {
        for (Physics physObject : phys1D) {
          dataFile.write( physObject.maxDistX() + "," );
        }
        dataFile.write( "\n" );
      }

      dataFile.close();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }


}
