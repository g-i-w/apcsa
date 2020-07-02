public class ArithmeticLogicUnit {

  public static byte output (byte opcode, byte a, byte b) {
    if (opcode == 4) {
      return a+b;
    } else if (opcode == 5) {
      return a-b;
    } else if (opcode == 6) {
      return a*b;
    } else if (opcode == 7) {
      return a/b;
    } else if (opcode == 8) {
      if (a==b) return 0;
      else if (a>b) return 1;
      else if (a<b) return 2;
    }
  }

}
