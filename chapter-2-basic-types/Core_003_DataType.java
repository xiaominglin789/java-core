public class Core_003_DataType {
	public static void main(String[] args) {
		System.out.println("数据类型: 基础类型 byte");
		Core_003_DataType.byteExp();
		System.out.println();

		System.out.println("数据类型: 基础类型 short");
		Core_003_DataType.shortExp();
		System.out.println();

		System.out.println("数据类型: 基础类型 int and long");
		Core_003_DataType.intAndLongExp();
		System.out.println();

		System.out.println("数据类型: 基础类型 float");
		Core_003_DataType.floatExp();
		System.out.println();

		System.out.println("数据类型: 基础类型 double");
		System.out.println();

		System.out.println("数据类型: 基础类型 char");
		Core_003_DataType.charExp();
		System.out.println();

		System.out.println("数据类型: 基础类型 boolean");
		Core_003_DataType.booleanExp();

		// auto canvent
		Core_003_DataType.autoCanvent();
		Core_003_DataType.autoCanventDetail();
	}

	static void byteExp() {
		// -128 ~ 127
		byte b1 = 10; // b1 sizeof 1 btye
		System.out.println(b1);
	}

	static void shortExp() {
		short s1 = 10; // s1 sizeof 2 btye
		System.out.println(s1);
	}	

	static void intAndLongExp() {
		int i1 = 10; // i1 sizeof 4 btye
		System.out.println(i1);

		// int-detail
		// var a long type must suffix L
		// max size can't add to min size
		int i2 = 0;
		// i2 = 10L;  // while throw error
		System.out.println(i2);
	}

	static void floatExp() {
		// decimal type defualt is Double
		// var float type must suffix f or F
		// var Double type must suffix d or D
		float f1 = 1.1F;   // var is true
		double f2 = 1.2;    // false ?
		float f3 = 1.421F; // var is true
		System.out.println(f2);
		System.out.println(f3);

		double d1 = 1.32F; // that is also true
		double d2 = 3.12D;
		System.out.println(d1);
		System.out.println(d2);

		// cientific counting
		// 5.12e2 == 5.12 * 10*10
		// 5.12E-3 == 5.12 / (10*10*10)
		double cc1 = 5.12e2;
		System.out.println(cc1); // 512.0
		double cc2 = 5.12E-3;
		System.out.println(cc2); // 0.00512

		// accuracy comparison
		double num1 = 2.1324520999;
		float num2  = 2.1324520999f;
		System.out.println(num1); // 2.1324520999
		System.out.println(num2); // 2.132452  lose of accuracy

		// be careful floating point usage trap
		double n11 = 2.7;
		double n22 = 8.1 / 3;
		System.out.println(n11); // 2.7
		System.out.println(n22); // 2.6999999999999997
		// compare accuracy isEquals
		// this is error compare:
		if (n11 == n22) {
			System.out.println("n11 == n22");
		} else {
			System.out.println("n11 != n22");
		}
		// this is true compare
		// save around some difference has Effectived
		double difference = Math.abs(n11 - n22);
		if (difference < 0.000000001) {
			System.out.println("n11 == n22");
		} else {
			System.out.println("n11 != n22");
		}
	}

	static void charExp() {
		char c1 = 'a';
		char c2 = 97;
		char c3 = '\t';
		// char c4 = 'chinese'; // change file charset GBK in sublime tool
		System.out.println("c1:"+ c1 + " c2:"+ c2 + " c3:"+ c3);

		// char is an integer in nature. When outputting, it is the character corresponding to the Unicode code
		System.out.println(c1 == c2);  // true
		System.out.println(c1 + c2); // 194
		System.out.println("a is " + (int)c1); // a is 97

		char c5 = 'b' + 1; // 98 + 1 = 99
		System.out.println((int)c5); // ? = 99
		System.out.println(c5); // ? = c

		System.out.println((char)127);

	}

	static void booleanExp() {
		// exp:
		boolean isPass = 59 > 60 ? true : false;
		if (isPass) {
			System.out.println("good job, over");
		} else {
			System.out.println("sorry, must hard next.");
		}
	}

	static void autoCanvent() {
		// small ----------------------------------> big
		// char -> int -> long -> float -> double
		// small ----------------------------------> big
		// byte -> short -> int -> long -> float -> double 
		int a = 'c'; // that`s ok
		double d = 80; // that`s ok

		System.out.println(a); // 99
		System.out.println(d); // int->double 80.0
	}

	static void autoCanventDetail() {
		// 1.When multiple types of data are mixed, the system will automatically convert all data into the type with the largest capacity first, and then calculate to get the result of the type with the largest capacity.
		// auto order:
		// small ----------------------------------> big
		// char -> int -> long -> float -> double
		// small ----------------------------------> big
		// byte -> short -> int -> long -> float -> double 
		int n1 = 10;
		// float n2 = n1 + 1.1; // that is error. 1.1 typeof double, float can't auto canvent to double
		double n3 = n1 + 1.1; // ok
		// int n11 = 1.1; // error int can't auto canvent to double
		
		// 2.When a data type with large capacity is assigned to a data type with small capacity, an error will be reported.
		
		// 3.When a specific number is assigned to byte, if in of range that ok, else error.
		//   Judge the type first, then the type
		byte b1 = 10; // true,  byte: -128 ~ 127
		// byte b2 = 128; error, out of range for byte

		int n22 = 1;
		// byte b22 = n22; // error,  minSize can't auto canvent to bigSize
		
		// 3. (byte, short) and char are not automatically converted to each other
		byte c1 = 10;
		// char c2 = c1; // error  byte can't auto canvent to char
		char c3 = 'c';
		// short c4 = c3; // error char can't auto canvent to short
		
		// 4.byte, short and char can be calculated and converted to int first
		byte d1 = 2;
		short d2 = 1;
		// short s1 = d1 + d2; // byte + short change (int)d1 + (int)d2 => int, short can't auto canvent to int
		int s2 = d1 + d2; // true, 3
		System.out.println(s2);

		byte d3 = 3;
		byte d4 = 7;
		// byte s3 = d3 + d4; // error, d3 + d4 => int, s3 is byte, can't auto canvent to int

		short d5 = 3;
		short d6 = 7;
		// short s4 = d5 + d6; // error, d5 + d6 => int, s3 is short, can't auto canvent to int
		 
		// 5.Automatic promotion principle: the type of the expression result is automatically promoted to the largest type in the operands
		byte aa1 = 1;
		short aa2 = 2;
		char aa3 = 'a'; // 97
		float aa4 = 1.2F;

		float ss5 = aa1 + aa2 + aa3 + aa4;
		System.out.println(ss5); // 101.2

		double ss6 = aa1 + aa2 + aa3 + 2F;
		System.out.println(ss6); // 102.0

		int ss8 = aa1 + aa2 + aa3;
		System.out.println(ss8); // 100

		char ss9 = aa1 + aa2 + aa3;
		System.out.println(ss9); // error, aa1 + aa2 + aa3 => int
	}

	// 
	static void thinkingQuestions() {
		// 1long = ?bit => 8*8 = 64
		// long n = 3 ? 0...(61*0)11
	}
}
