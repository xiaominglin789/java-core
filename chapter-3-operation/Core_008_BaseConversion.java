public class Core_008_BaseConversion {
	public static void main(String[] args) {
		// java ���ֽ���
		// ������
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
		int n4 = 0x001a; // a=10 ��һ�����Ѿ���16 = 16+10=26
		System.out.println("n1=" + n1);
		System.out.println("n2=" + n2);
		System.out.println("n3=" + n3);
		System.out.println("n4=" + n4);
	}

	/** ������ ת ʮ���� */
	static void binaryToDecimal() {
		// ת������: �����λ(�ұ�)��ʼ, ÿ��λ�ϵ�����ȡ����, ���� `2^(λ��-1)`���η���,Ȼ�� ��͡�	
	}

	/** �˽���תʮ���� */
	static void octalToDecimal() {
		// ת������: �����λ(�ұ�)��ʼ, ÿ��λ�ϵ�����ȡ����, ���� `8^(λ��-1)`���η���,Ȼ�� ��͡�
	}

	/** ʮ������תʮ���� */
	static void hexadecimalToDecimal() {
		// ת������: �����λ(�ұ�)��ʼ, ÿ��λ�ϵ�����ȡ����, ���� `16^(λ��-1)`���η���,Ȼ�� ��͡�
	}

	// ��ϰ
	static void practice() {
		// 1. 0b110001100 ת ʮ����
		// 	  256+128+0+0+0+8+4+0+0 = 396
		// 2. 02456 ת ʮ����
		//    0+2x8^3+4x8^2+5x8+6 = 0+1024+256+40+6=1326
		// 3. 0xA45 ת ʮ����
		// 	  10x16^2+4x16+5 = 2629
		System.out.println("0b110001100 ת ʮ���� ��: " + (int)0b110001100);
		System.out.println("02456 ת ʮ���� ��: " + (int)02456);
		System.out.println("0xA45 ת ʮ���� ��: " + (int)0xA45);
	}

	/** ��ϰ2 */
	static void practice_2() {
		// 1.ʮ���� 123 ת ������
		// 	 123=2x61...1=2x30...1=2x15...0=2x7...1=2x3...1=2x1...1=2x0...1
		// 2.ʮ���� 678 ת �˽���
		//   678=8x84...6=8x10...4=8x1...2=8x0...1
		// 3.ʮ���� 8912 ת ʮ������
		//   8912=16x557..0=16x34...13=16x2...2=16xx0...2
		System.out.println("ʮ���� 123 ת ������ ��: 0b1111011 " + 0b1111011);
		System.out.println("ʮ���� 678 ת �˽��� ��: 01246 " + 01246);
		System.out.println("ʮ���� 8912 ת ʮ������ ��: 0x22D0 " + 0x22D0);
	}

	static void practice_3() {
		// 1.������ 0b11100101 ת �˽���
		//   0b011_100_101 = 0345
		// 2.������ 0b1110010110 ת ʮ������
		//   0b0011_1001_0110 = 0x396
		System.out.println("������ 0b11100101 ת �˽��� ��: 0345 ʮ���� ��:" + 0345);
		System.out.println("������ 0b1110010110 ת ʮ������ ��: 0x396 ʮ���� ��:" + 0x396);
	}

	static void practice_4() {
		// 1.�˽��� 01230 ת ������
		//   0b001_010_011_000 => 0b001010011000
		// 2.ʮ������ 0xAB9 ת ������
		//   0xAB9 => 0x10_11_9 => 0b1010_1011_1001 => 0b101010111001
		System.out.println("�˽��� 01230 ת ������ ��: 0b1010011000 ʮ���� ��:" + 0b1010011000);
		System.out.println("ʮ������ 0xAB9 ת ������ ��: 0b101010111001 ʮ���� ��:" + 0b101010111001);
	}
}
