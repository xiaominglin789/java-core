public class Core_004_DataType_ForceTypeConversion {
	public static void main(String[] args) {
		// foce conver dateType
		int n1 = (int)3.7;
		System.out.println(n1); // 3  Cause precision loss

		int n2 = 2000;
		byte b1 = (byte)n2; // 2000 = 128 * 16 -48, byte max 127, 128 = -1. loop 16 count, the date has out 48. so show -48
		System.out.println(b1); // ??? -48   Cause data overflow

		Core_004_DataType_ForceTypeConversion.foreConverDetail();

		Core_004_DataType_ForceTypeConversion.practice();
	}

	static void foreConverDetail() {
		// 1.The strong turn sign 'is only for the most recent operands
		// int n1 = (int)10 * 3.5 + 5 * 1.5; // (int)10 => 10, 10 * 3.5 is double, 5 * 1.5 is double, double + double is double. so double cannot be assigned to int
		// System.out.println(n1);
		int n2 = (int)(10 * 3.5 + 5 * 1.5); // proximity principle, parentheses to enhance priority
		System.out.println(n2); // 42
	
		// 2.`The char 'type can save the constant value of' Int ', but it cannot save the variable value of' Int '. It needs to be forced
		char c1 = 100; // compilation passed
		int m = 100;   // compilation passed
		// char c2 = m;  // compilation failed, `The char 'type can save the constant value of' Int '
		char c3 = (char)(m); // compilation passed, Forced conversion before assignment
		System.out.println(c3); // d
	}

	static void practice() {
		short s = 12; 			// compilation passed
		s = s - 9;           	// compilation failed, short <=/= int

		byte b = 10;			// compilation passed
		b = b + 11;				// compilation failed, byte <=/= int
		b = (byte)(b+11);		// compilation passed

		char c = 'a';			// compilation passed
		int i = 16;				// compilation passed
		float f = .314F;		// compilation passed
		double d = c + i + f;	// compilation passed

		byte b1 = 16;			// compilation passed
		short s1 = 14;			// compilation passed
		short s2 = b1 + s1;		// compilation failed, short <=/= int
	}
}
