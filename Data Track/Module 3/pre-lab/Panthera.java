public class Panthera extends Felidae {

  public void cranialFeatures () {
    System.out.println("Has cat-like cranial features.");
  }

  public void traits () {
    cranialFeatures();
    super.traits();
  }

}
