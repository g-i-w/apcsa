public class TestSimpleClass {

  public static void main(String[] args) {

    // call getStatic() on the class
    System.out.println( "\nSimpleClass.getStatic() returns " + SimpleClass.getStatic() + "\n" );

    // create a new object from SimpleClass named object1
    SimpleClass object1 = new SimpleClass( 1, 2, 3 );

    // call methods on object1
    System.out.println( object1.getFirst() );
    System.out.println( object1.getSecond() );

    // call getStatic() on the class
    System.out.println( "\nSimpleClass.getStatic() returns " + SimpleClass.getStatic() + "\n" );

    // create a new object from SimpleClass named object2
    SimpleClass object2 = new SimpleClass( 25, 50, 75 );

    // call methods on object2
    System.out.println( object2.getFirst() );
    System.out.println( object2.getSecond() );

    // call getStatic() on the class
    System.out.println( "\nSimpleClass.getStatic() returns " + SimpleClass.getStatic() + "\n" );

  }

}
