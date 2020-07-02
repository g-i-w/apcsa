public class Carnivora extends Mammalia {

  public void meat () {
    System.out.println("Eats meat.");
  }

  public void traits () {
    meat();
    super.traits();
  }

}
