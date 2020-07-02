public class Memory {

	private byte[] memory;
	private byte programSize;
	private byte stackSize;
	private byte stackPointer;
	private byte heapStart;
	private boolean[] heapAllocation;

	// constructor
	public Memory (byte p, byte s) {
		programSize = p;
		stackSize = s;
		stackPointer = programSize;
		memory = new byte[256];
		heapStart = programSize + stackSize;
		heapAllocation = new boolean[256 - heapStart];
	}

	// read memory location
	public byte read (byte address) {
		return memory[address];
	}

	// write a value onto the stack
	public void push ( byte value ) {
		if (stackPointer < stackSize) // heap address space starts at stackSize
			memory[++stackPointer] = value; // pre-increment
		else
			System.out.println( "Error: stack overflow!" );
	}

	// read a value from the stack
	public byte pop () {
		if (stackPointer > programSize) { // program address space ends at programSize
			return memory[stackPointer--]; // post-decrement
		} else {
			System.out.println( "Error: stack is empty!" );
			return 0;
		}
	}

	// mark memory as used (true) if a large enough space exists
	// return -1 if no space large enough exists
	public byte new (byte size) {
		byte start = 0;
		byte end = 0;
		while ( end-start < size ) {
			end++;
			if ( end >= heapAllocation.length ) return -1;
			if ( ! heapAllocation[end] ) start = end;
		}
		for (byte i=start; i<end; i++) {
			heapAllocation[i] = true;
		}
		return start;
	}

	// mark memory as free
	public void delete (byte address, byte size) {
		for (byte i=0; i<size; i++) {
			byte heapAddress = address + i;
			if (heapAddress >= heapStart && heapAddress < memory.length)
				heapAllocation[heapAddress-heapStart] = false;
			else
				System.out.println( "Error: address "+heapAddress+" is outside heap memory space!" );
		}
	}

}
