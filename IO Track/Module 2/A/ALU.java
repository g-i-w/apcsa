public class ALU {

	private byte A;
	private byte B;

	public ALU (byte a, byte b) {
		A = a;
		B = b;
	}

	public byte ADD () {
		return A + B;
	}
	
	public byte SUB () {
		return A - B;
	}
	
	public byte MUL () {
		return A * B;
	}
	
	public byte DIV () {
		return A / B;
	}
	
	public byte CMP () {
		if (A==B)
			return 0;
		else if (A>B)
			return (byte) 1;
		else
			return (byte) 2;
	}
}