public class ThrowBall {
  public static void main (String[] args) {

    double[][] ballData = new double[4][];

    ballData[0] = new double[]{10.0, 10.0, 45.0, 0.1};
    ballData[1] = new double[]{10.0, 15.0, 30.0, 0.1};
    ballData[2] = new double[]{0.0, 10.0, 41.0, 0.222};
    ballData[3] = new double[]{1.5, 20.0, 81.0, 0.333};

    String[] ballLetter = new String[]{"A", "B", "C", "D"};



    // loop through the sub-arrays in ballData
    for (int ball=0; ball<ballData.length; ball++) {

      // calculate trajectory data
      double[][] trajectoryData = Physics.trajectory( ballData[ball][0], ballData[ball][1], ballData[ball][2], ballData[ball][3]);

      // print a graph of the Y distance values
      Physics.graph( trajectoryData[1], ballLetter[ball] );

    }

  }
}
