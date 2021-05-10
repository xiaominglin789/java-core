/** �����ƻ��� */
public class Core_009_BinaryBasis {
	public static void main(String[] args) {
		Core_009_BinaryBasis.practice();
		System.out.println("-------------------");
		Core_009_BinaryBasis.bitOperation();
	}

	static void practice() {
		// 1. 10/3=3  10/5=2  10%2=0  -10.5%3=?
		// -10.5%3=? ����С�����������,�õ��Ľ���ǽ���ֵ��
		// a % b, �� a ΪС��ʱ: ��ʽ= a - ((int)a / b) * b = -10.5 - ((-10)
		// /3) * 3 = -10.5 - (-3)*3 = -10.5 - (-9) = -10.5 + 9 = -1.5
		System.out.println(-10.5 % 3);

		// 2. ����Ľ����:
		int i = 66;
		System.out.println(++i + i + " ? 134"); // ++i + i= i=i+1; i + i = 134;

		// 3.��java��, ���¸�ֵ�����ȷ����:
		//   A.int num1 = (int)"18";  // ����, Integer.parseInt(String)
		//   ;
		//   B.int num2 = 18.0; // ����, 18.0 ��double����, �������޷�����ǿ������������������
		//   C.double num3 = 3d; // ��ȷ
		//   D.double num4 = 8;  // ��ȷ
		//   E.int i = 48; char ch = i + 1; // ����, ��������ǿ��������������
		//   F.byte b = 19; short s = b+1; // ����, 
		//     1.byte b = 19; ����ͨ��, Ӧ�� 19 �� byte��ֵ��Χ��:[-128~127)
		//     2.short s = b+1 => ����b+1 => byte + int => int, short װ���� int
	}

	/**
	 * λ����
	 */
	static void bitOperation() {
		int a = 2;
		System.out.println("2 ��λȡ�� = " + ~a); // -3

		int c = -2;
		System.out.println("-2 ��λȡ�� = " + ~c);	// 1

		System.out.print("2|3 = ");
		System.out.println(2|3);

		System.out.print("2^3 = ");
		System.out.println(2^3);		
	}
}

