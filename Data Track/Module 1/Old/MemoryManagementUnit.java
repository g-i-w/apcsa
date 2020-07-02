public class MemoryManagementUnit {

  public static byte read (byte[] memory, byte address) {
    return byte[address];
  }

  public static void write (byte[] memory, byte address, byte value) {
    memory[address] = value;
  }

}
