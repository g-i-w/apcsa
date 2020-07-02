public class Tiger extends Panthera {

  private String name;

  public Tiger (String n) {
    name = n;
  }

  public void darkVerticalStripes () {
    System.out.println("Has dark vertical stripes.");
  }

  public void territorial () {
    System.out.println("Is territorial.");
  }

  public void solitary () {
    System.out.println("Is solitary.");
  }

  public void traits () {
    System.out.println( name + " has the following traits:");
    darkVerticalStripes();
    territorial();
    solitary();
    super.traits();
  }

}
