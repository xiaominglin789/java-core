/** 二进制基础 */
public class Core_009_BinaryBasis {
	public static void main(String[] args) {
		Core_009_BinaryBasis.practice();
		System.out.println("-------------------");
		Core_009_BinaryBasis.bitOperation();
	}

	static void practice() {
		// 1. 10/3=3  10/5=2  10%2=0  -10.5%3=?
		// -10.5%3=? （有小数参与的运算,得到的结果是近似值）
		// a % b, 当 a 为小数时: 公式= a - ((int)a / b) * b = -10.5 - ((-10)
		// /3) * 3 = -10.5 - (-3)*3 = -10.5 - (-9) = -10.5 + 9 = -1.5
		System.out.println(-10.5 % 3);

		// 2. 下面的结果是:
		int i = 66;
		System.out.println(++i + i + " ? 134"); // ++i + i= i=i+1; i + i = 134;

		// 3.在java中, 以下赋值语句正确的是:
		//   A.int num1 = (int)"18";  // 错误, Integer.parseInt(String)
		//   ;
		//   B.int num2 = 18.0; // 错误, 18.0 是double类型, 低容量无法主动强塞高容量的数据类型
		//   C.double num3 = 3d; // 正确
		//   D.double num4 = 8;  // 正确
		//   E.int i = 48; char ch = i + 1; // 错误, 低容量被强塞高容量的类型
		//   F.byte b = 19; short s = b+1; // 错误, 
		//     1.byte b = 19; 可以通过, 应该 19 在 byte的值范围内:[-128~127)
		//     2.short s = b+1 => 错误，b+1 => byte + int => int, short 装不下 int
	}

	/**
	 * 位运算
	 */
	static void bitOperation() {
		int a = 2;
		System.out.println("2 按位取反 = " + ~a); // -3

		int c = -2;
		System.out.println("-2 按位取反 = " + ~c);	// 1

		System.out.print("2|3 = ");
		System.out.println(2|3);

		System.out.print("2^3 = ");
		System.out.println(2^3);		
	}
}

