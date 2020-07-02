public class LoadProgram {
  public static void main (String[] args) {

    byte[] memory = new byte[256];

    byte i=0;
    while (System.in.available() > 1 && i < 256) {
      memory[i] = System.in.read();
      i++;
    }

    Processor.run( memory );

  }
}
