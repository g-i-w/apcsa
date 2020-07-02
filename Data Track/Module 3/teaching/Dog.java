public class Dog extends Animal {
  public void sound () {
    System.out.println( "Bark! bark!" );
  }

  public void eat () {
    System.out.println( "Eats dogfood" );
  }

  public static void main(String[] args) {
    Dog d = new Dog();
    d.sound();
    d.eat();

  }
}
