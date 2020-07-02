import java.util.*;

// taxonomy diagram: https://www.biologycorner.com/worksheets/taxonomy_interpret.html

public class DescribeMammals {
  public static void main(String[] args) {

    ArrayList<Carnivora> carnivores = new ArrayList<>();


    Carnivora t1 = new Tiger( "First Tiger" );
    carnivores.add( t1 );
    Felidae t2 = new Tiger( "Second Tiger" );
    carnivores.add( t2 );
    Panthera l1 = new Lion( "Asiatic Lion" );
    carnivores.add( l1 );
    Lion l2 = new Lion( "African Lion" );
    carnivores.add( l2 );
    // Felis cat = new Cat("My pet cat");
    // carnivores.add( cat );
    // Canidae dog = new Dog("My pet dog");
    // carnivores.add( dog );
    // Canis wolf = new Wolf("A wolf");
    // carnivores.add( wolf );


    ArrayList<Mammalia> mammals = new ArrayList<>();
    for (Carnivora c : carnivores) {
      mammals.add( c );
    }


    Mammalia unknownMammal = new Mammalia();
    mammals.add( unknownMammal );
    Mammalia unknownFelidae = new Felidae();
    mammals.add( unknownFelidae );
    Mammalia unknownLion = new Lion("Unknown Lion");
    mammals.add( unknownLion );


    for (Mammalia m : mammals) {
      System.out.println( "------------" );
      m.traits();
    }

  }
}
