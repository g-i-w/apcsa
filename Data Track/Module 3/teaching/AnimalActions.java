import java.util.ArrayList;

public class AnimalActions {
  private ArrayList<Animal> animals;

  public AnimalActions () {
    animals = new ArrayList<Animal>();
  }

  public void addAnimal( Animal a ) {
    animals.add( a );
  }

  public void printSounds() {
    for (Animal a : animals) a.sound();
  }

  public static void main (String[] args) {
    AnimalActions aa = new AnimalActions();
    aa.addAnimal( new Dog() );
    aa.addAnimal( new Cat() );
    aa.printSounds();
  }
}
