public class Lion extends Panthera {

  private String name;

  public Lion (String n) {
    name = n;
  }

  public void deepChest () {
    System.out.println("Is muscular and deep-chested.");
  }

  public void territorial () {
    System.out.println("Is territorial.");
  }

  public void social () {
    System.out.println("Is social.");
  }

  public void traits () {
    System.out.println( name + " has the following traits:");
    deepChest();
    territorial();
    social();
    super.traits();
  }

}
