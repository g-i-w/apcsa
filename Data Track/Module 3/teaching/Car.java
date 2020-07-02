import java.util.*;

public class Car implements Shelter, Drivable {
  public void openDoor () {
    System.out.println( "Car door is open!");
  }
  public void drive() {
    System.out.println( "Driving!");
  }
  public void steer() {
    System.out.println( "Steering!");
  }

  public static void main(String[] args) {

    Shelter house = new House();
    Shelter car = new Car();

    car.openDoor();

    List<Shelter> list = new ArrayList<>();

  }

  // other methods
}
