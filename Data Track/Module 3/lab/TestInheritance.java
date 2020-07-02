public class TestInheritance {
  public static void main(String[] args) {
    B b = new B();
    b.callSetName();
  }
}

class A {
  private String name;
  public void setName() {
    System.out.println("A");
  }
  public void callSetName () {
    setName();
  }
}

class B extends A {
  public void setName() {
    System.out.println("B");
  }
}
