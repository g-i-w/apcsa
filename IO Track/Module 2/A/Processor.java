public class Processor {

	private Memory memory;
	private ALU alu;
	private byte programCounter;

	public Processor (Memory m) {
		memory = m;
		programCounter = 0;
		alu = new ALU();
	}

	public void executeInstruction ( byte instruction, byte value ) {
		if ( instruction == 0 ) {
			ALU.A( value );
		} else if ( instruction == 1 ) {
			ALU.B( value );
		} else if ( instruction == 2 ) {
			ALU.A( memory.pop(value) );
		} else if ( instruction == 3 ) {
			ALU.B( memory.pop(value) );
		} else if ( instruction == 4 ) {
			memory.push( ALU.ADD() );
		} else if ( instruction == 5 ) {
			memory.push( ALU.SUB() );
		} else if ( instruction == 6 ) {
			memory.push( ALU.MUL() );
		} else if ( instruction == 7 ) {
			memory.push( ALU.DIV() );
		} else if ( instruction == 8 ) {
			if ( alu.CMP()==0 ) programCounter = value;
		} else if ( instruction == 9 ) {
			if ( alu.CMP()==1 ) programCounter = value;
		} else if ( instruction == 10 ) {
			programCounter = value;
		} else if ( instruction == 11 ) {
			programCounter = value;
		}
	}

	public void runProgram () {
		while (true) {

		}
	}

}
