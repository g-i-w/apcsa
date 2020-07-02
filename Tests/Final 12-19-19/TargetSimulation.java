public class TargetSimulation
{
  /** Radius from the center of the target to edge of the 	target. */
  private int targetRadius;

  /** Maximum number of balls to be thrown at the target in each 	simulation. */
  private int maxBalls;

  /** Constructs a TargetSimulation where tar is the target radius and
  * max is the maximum number of balls to throw at the target.
  * Precondition: tar > 0; max > 0
  */
  public TargetSimulation(int tar, int max)
  {
    targetRadius = tar;
    maxBalls = max;
  }

  /** Returns an integer representing the distance from the center of
  * the target to the location where a ball hits or passes the target.
  */
  private int throwAccuracy()
  {
    return (int) (Math.random()*(targetRadius*10)+1);
  }

  /** Simulates balls being thrown at a target.
  * Returns true if a ball hits the target; false otherwise.
  */
  public boolean simulate()
  {
    for (int ball=0; ball<=maxBalls; ball++) {
      if (throwAccuracy() < targetRadius) return true;
    }
    return false;
  }

  /** Runs num simulations and returns the proportion of simulations
  * in which a ball hits the target.
  * Precondition: num > 0
  */
  public double runSimulations(int num)
  {
    int sims = 0;
    for (int n=0; n<num; n++) {
      if (simulate()) sims++;
    }
    return (double)sims / num;
  }

  public static void main(String[] args) {
    TargetSimulation t = new TargetSimulation(10,5);
    System.out.println( t.runSimulations(10) );
  }
}
