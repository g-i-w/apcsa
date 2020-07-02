public class Felidae extends Carnivora {

  public void claws () {
    System.out.println("Has retractile claws.");
  }

  public void traits () {
    claws();
    super.traits();
  }

}
