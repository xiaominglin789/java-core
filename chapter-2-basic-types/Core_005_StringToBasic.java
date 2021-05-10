public class Core_005_StringToBasic {
	public static void main(String[] args) {
		Core_005_StringToBasic.basicToString();
		System.out.println("------------------------------");
		Core_005_StringToBasic.stringToBasic();
		System.out.println("------------------------------");
		Core_005_StringToBasic.practice();
	}

	static void basicToString() {
		String s1 = (byte)(2) + ""; // "2"
		String s2 = (short)(3) + ""; // "3"
		String s3 = 5 + ""; // "5"
		String s4 = 3L + ""; // "3"
		String s5 = 4.5F + ""; // "4.5"
		String s6 = 6.6D + ""; // "6.6"
		String s7 = (char)97 + ""; // "a"
		String s8 = true + ""; // "true"

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
	}

	static void stringToBasic() {
		// Basic data types all have their own wrapper classes, and wrapper classes all have corresponding parsexx methods
		// exclude char, boolean
		String s = "97";
		byte b = Byte.parseByte(s); // 97
		short t = Short.parseShort(s); // 97
		int i = Integer.parseInt(s); // 97
		long l = Long.parseLong(s); // 97
		float f = Float.parseFloat(s); // 97.0
		double d = Double.parseDouble(s); // 97.0
		
		System.out.println(b); // 97
		System.out.println(t); // 97
		System.out.println(i); // 97
		System.out.println(l); // 97
		System.out.println(f); // 97.0
		System.out.println(d); // 97.0

		// akes the first character in a string
		char c = s.charAt(0);
		System.out.println(c); // '7'

		boolean bool = Boolean.parseBoolean("true"); // true
		System.out.println(bool);

	}

	static void practice() {
		// 1.
		int n1;
		n1 = 13;
		int n2;
		n2 = 17;
		int n3 = n1 + n2; // ? 30
		System.out.println("n3 = " + n3);

		int n4 = 38;
		int n5 = n4 - n3; // ? 8
		System.out.println("n5 = " + n5);

		// 2.use char save \n \t \r \\ 1 2 3 and print
		System.out.println("------------------------------");
		char c1 = '\n'; // ����
		char c2 = '\t'; // �Ʊ��
		char c3 = '\r'; // �س�
		char c4 = '\\'; // \
		char c5 = '1';  // 1
		char c6 = '2';	// 2
		char c7 = '3';	// 3
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);

		// 3. save two book's name, and append; save 2 gender and append; save 2 book's price, append
		System.out.println("------------------------------");
		String book1 = "�߹���";
		String book2 = "�ƹ���";
		System.out.println(book1 + book2); // "�߹����ƹ���"
		
		System.out.println("------------------------------");
		char wan = '��';
		char woman = 'Ů';
		
		System.out.println(wan + woman); // char + char = int = 52906
		System.out.println("------------------------------");
		double p1 = 12.89;
		double p2 = 21.13;
		System.out.println(p1 + p2); // double = 34.019999999999996

		// 4.print at single line
		// ���������g���ɼ����Ա𡢰���
		System.out.println("------------------------------");
		String name = "Ҧ��";
		int age = 27;
		int scope = 79;
		char gender = '��';
		String like = "ƹ����";
		System.out.println("����\t���g\t�ɼ�\t�Ա�\t����\n" + name + "\t" + age + "\t" + scope + "\t" + gender + "\t" + like);
	}
}