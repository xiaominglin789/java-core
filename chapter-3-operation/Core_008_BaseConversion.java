public class Core_008_BaseConversion {
	public static void main(String[] args) {
		// java 四种进制
		// 二进制
		Core_008_BaseConversion.base();
		System.out.println("-------------------");
		Core_008_BaseConversion.binaryToDecimal();
		System.out.println("-------------------");
		Core_008_BaseConversion.octalToDecimal();
		System.out.println("-------------------");
		Core_008_BaseConversion.hexadecimalToDecimal();
		System.out.println("-------------------");
		Core_008_BaseConversion.practice();
		System.out.println("-------------------");
		Core_008_BaseConversion.practice_2();
		System.out.println("-------------------");
		Core_008_BaseConversion.practice_3();
		System.out.println("-------------------");
		Core_008_BaseConversion.practice_4();
	}

	static void base() {
		int n1 = 0b0011; // 2^(2-1) + 2^(1-1) = 3
		int n2 = 0171;  // 1+7*8+8 = 65
		int n3 = 217;    // 217
		int n4 = 0x001a; // a=10 进一代表已经满16 = 16+10=26
		System.out.println("n1=" + n1);
		System.out.println("n2=" + n2);
		System.out.println("n3=" + n3);
		System.out.println("n4=" + n4);
	}

	/** 二进制 转 十进制 */
	static void binaryToDecimal() {
		// 转换规则: 从最低位(右边)开始, 每个位上的数提取出来, 乘以 `2^(位数-1)`（次方）,然后 求和、	
	}

	/** 八进制转十进制 */
	static void octalToDecimal() {
		// 转换规则: 从最低位(右边)开始, 每个位上的数提取出来, 乘以 `8^(位数-1)`（次方）,然后 求和、
	}

	/** 十六进制转十进制 */
	static void hexadecimalToDecimal() {
		// 转换规则: 从最低位(右边)开始, 每个位上的数提取出来, 乘以 `16^(位数-1)`（次方）,然后 求和、
	}

	// 练习
	static void practice() {
		// 1. 0b110001100 转 十进制
		// 	  256+128+0+0+0+8+4+0+0 = 396
		// 2. 02456 转 十进制
		//    0+2x8^3+4x8^2+5x8+6 = 0+1024+256+40+6=1326
		// 3. 0xA45 转 十进制
		// 	  10x16^2+4x16+5 = 2629
		System.out.println("0b110001100 转 十进制 是: " + (int)0b110001100);
		System.out.println("02456 转 十进制 是: " + (int)02456);
		System.out.println("0xA45 转 十进制 是: " + (int)0xA45);
	}

	/** 练习2 */
	static void practice_2() {
		// 1.十进制 123 转 二进制
		// 	 123=2x61...1=2x30...1=2x15...0=2x7...1=2x3...1=2x1...1=2x0...1
		// 2.十进制 678 转 八进制
		//   678=8x84...6=8x10...4=8x1...2=8x0...1
		// 3.十进制 8912 转 十六进制
		//   8912=16x557..0=16x34...13=16x2...2=16xx0...2
		System.out.println("十进制 123 转 二进制 是: 0b1111011 " + 0b1111011);
		System.out.println("十进制 678 转 八进制 是: 01246 " + 01246);
		System.out.println("十进制 8912 转 十六进制 是: 0x22D0 " + 0x22D0);
	}

	static void practice_3() {
		// 1.二进制 0b11100101 转 八进制
		//   0b011_100_101 = 0345
		// 2.二进制 0b1110010110 转 十六进制
		//   0b0011_1001_0110 = 0x396
		System.out.println("二进制 0b11100101 转 八进制 是: 0345 十进制 是:" + 0345);
		System.out.println("二进制 0b1110010110 转 十六进制 是: 0x396 十进制 是:" + 0x396);
	}

	static void practice_4() {
		// 1.八进制 01230 转 二进制
		//   0b001_010_011_000 => 0b001010011000
		// 2.十六进制 0xAB9 转 二进制
		//   0xAB9 => 0x10_11_9 => 0b1010_1011_1001 => 0b101010111001
		System.out.println("八进制 01230 转 二进制 是: 0b1010011000 十进制 是:" + 0b1010011000);
		System.out.println("十六进制 0xAB9 转 二进制 是: 0b101010111001 十进制 是:" + 0b101010111001);
	}
}
