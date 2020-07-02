public class Processor {

  public static void run (byte[] memory) {
    byte programCounter = 0;
    byte A;
    byte B;

    while (programCounter+1 < memory.length && memory[programCounter] != 11) {
      byte opcode = memory[programCounter];
      byte value = memory[programCounter+1];
      switch (opcode) {
        case 0:
          A = value;
          break;
        case 1:
          B = value;
          break;
        case 2:
          A = memory[value];
          break;
        case 3:
          B = memory[value];
          break;
        case 4:
        case 5:
        case 6:
        case 7:
          memory[value] = ArithmeticLogicUnit.output(opcode,A,B);
          break;
        case 8:
          if (ArithmeticLogicUnit.output(opcode,A,B) == 0) programCounter = value;
          break;
        case 9:
          if (ArithmeticLogicUnit.output(opcode,A,B) == 1) programCounter = value;
          break;
        case 10:
          if (ArithmeticLogicUnit.output(opcode,A,B) == 2) programCounter = value;
          break;
      }
      programCounter += 2;
    }

  }

}
