public class Core_006_Operation {
	public static void main(String[] args) {
		Core_006_Operation.arithmetic();
		System.out.println("--------------------------------");
		Core_006_Operation.practice_1();
		System.out.println("--------------------------------");
		Core_006_Operation.relational();
		System.out.println("--------------------------------");
		Core_006_Operation.logical();
		System.out.println("--------------------------------");
		Core_006_Operation.practice_2();
		System.out.println("--------------------------------");
		Core_006_Operation.assignment();
		System.out.println("--------------------------------");
		Core_006_Operation.ternary();
		System.out.println("--------------------------------");
		Core_006_Operation.practice_3();
	}

	// ���������
	static void arithmetic() {
		// 1.�ӡ������ˡ�����ȡ�ࡢ++��--
		// 1-1 ����
		System.out.println(10 / 4); // ? ��� 2, ��Ϊ int / int ���ȡ��߾����� int,���л��С������ȥ����
		System.out.println(10.0 / 4); // ? ��� 2.5, ��Ϊ double / int ���ȡ���� double
		
		double d = 10 / 4;
		System.out.println(d); // ? ��� 2.0, ��Ϊ int / int ���ȡ��߾��ȵõ�2, 2��ת��double�õ�2.0

		// 1-2 ȡ�ࣨģ��
		// ȡ��ı���: a % b = a - (a / b) * b
		System.out.println(10 % 3); // 1,  10 - (10/3)*3 = 10-9 = 1
		System.out.println(-10 % 3); // -1, (-10) - [(-10)/3]*3 = -10-(-3)*3= -1
		System.out.println(10 % -3); // 1, 10 - [10/(-3)]*(-3) = 10-(-3)*(-3)= 1
		System.out.println(-10 % -3); // -1

		// 1-3 ++��--
		int a3 = 1;
		a3 = a3++;
		// ��`++` �Ĺ���
		// 1.����һ����ʱ����: temp = a3 = 1
		// 2.a3 = a3 + 1 = 2
		// 3.a3 = temp = 1
		System.out.println("a3=" + a3); // 1 ? 

		int a4 = 1;
		a4 = ++a4;
		// ǰ`++` �Ĺ���:
		// 1.a4 = a4 + 1 = 2
		// 2.temp = a4 = 2
		// 3.a4 = temp =2
		System.out.println("a4=" + a4); // 2

		int a5 = 10;
		int a6 = 20;
		int a7 = a5++; // 1.temp=a5=10; 2.a5=a5+1=11; 3.a7=temp=10;
		System.out.println("a7 = " + a7); // 10
		System.out.println("a6 = " + a6); // 20
		a7 = --a6; // 1.a6=a6-1=19; 2.temp=a6=19; 3.a7=temp=19
		System.out.println("a7 = " + a7); // 19
		System.out.println("a6 = " + a6); // 19
	}

	static void practice_1() {
		// 1.���绹��59��ż�, �� �϶��ٸ�����������죿
		// y = 7 * a + d = 59
		int days = 59;
		int week = days/ 7; // = 8;
		int less = days % 7; //  59 - (59 / 7) * 7 = 59 - 8 * 7 = 59 - 56 = 3;
		System.out.println("��"+ week +"��������"+ less +"��");
		System.out.println();

		// 2.����һ���������滪���¶�, �����¶�ת�������¶ȵĹ�ʽ�ǣ�5/9 * (�����¶� - 100), ��ǰ�Ļ����¶���: 234.5, ����������¶ȶ�Ӧ�������¶ȡ�
		// y = 5/9 * (x-100)
		// ע��: java�� 5/9 = ����/���� => ���� = 0
		double x = 234.5;
		double y = (5.0 / 9) * (x - 100); // 5.0/9 * 134.5 = 74.72xxxx
		System.out.println(x + "�����¶� = " + y + "�����¶�");
	}

	// ��ϵ�����
	static void relational() {
		boolean fg1 = true;
		boolean fg2= false;
		System.out.println("fg1 && fg2 => " + (fg1 && fg2)); // false
		System.out.println("fg1 || fg2 => " + (fg1 || fg2)); // true
		System.out.println("!fg1 => " + !fg1);       // false
		System.out.println("!fg => " + !fg2);       // true
	}

	// �߼������
	static void logical() {
		// 1.�� ->����: 2��������Ϊ:true, ���Ϊ:true. ������Ϊ:false
		// &&(��·��) ��һ������Ϊfalse, ��������������ж�,���ս��Ϊ:false��Ч�ʸ�
		// &(�߼���) ��һ������Ϊfalse, �����������ȻҪȥ�жϡ�Ч�ʵ�
		int a = 4;
		int b = 9;
		if (a < 4 && ++b < 11) {
			System.out.println("a > 4 & ++b < 11 ��������"); // ��ִ��
		}
		System.out.println("a=" + a + " b=" + b); // a=4 b=9
		if (a < 4 & ++b < 11) {
			System.out.println("a > 4 & ++b < 11 ��������"); // ��ִ��
		}
		System.out.println("a=" + a + " b=" + b); // a=4 b=10
		System.out.println();
		
		// 2.�� ->����: ֻҪ��һ������Ϊ:true, ���Ϊ:true. ȫ��Ϊ: false,�����ΪΪ:false
		// ||(��·��) ��һ������Ϊ:true, �ڶ������������ж�,���ս��Ϊ: true��Ч�ʸ�
		// |(�߼���) ���ܵ�һ�������Ƿ�Ϊ:true, �ڶ���������Ҫ�жϡ�ִ��Ч�ʵ�
		int c = 3;
		int d = 7;
		if (c > 1 || ++d < 5) {
			System.out.println("c > 1 || ++d < 5 ��������");	
		}
		System.out.println("c=" + c + " d=" + d); // c=3 d=7
		if (c > 1 | ++d < 5) {
			System.out.println("c > 1 | ++d < 5 ��������");	
		}
		System.out.println("c=" + c + " d=" + d); // c=3 d=8
		System.out.println();

		// 3. `!`: ȡ��
		System.out.println(60 > 20); // true
		System.out.println(!(60 > 20)); // false
		System.out.println();

		// 4. `^`: �߼����
		// �� a ^ b ��ͬʱ, ���Ϊtrue. ����Ϊ false
		boolean res = (10 > 1) ^ (3 > 5); // true ^ false => true
		System.out.println("res = " + res); // true
		System.out.println();
		// ��������������:�ڲ�ʹ�õ����������������, ����2��������ֵ
		int num = 1;
		int count = 2;
		System.out.println("����ǰ: num=" + num + " count=" + count);
		num = num ^ count; // num = 0001 ^ 0011 = 0010
		count = num ^ count; // count = 0010 ^ 0011 = 0001
		num = num ^ count; // num = 0010 ^ 0001 = 0011
		System.out.println("������: num=" + num + " count=" + count);
	}

	// �߼������ ��ϰ
	static void practice_2() {
		// 1.
		int x = 5;
		int y = 5;
		if (x++ == 6 & ++y == 6) { // x==6?false,x++=6,++y=6==6=true
			x = 11;
		}
		System.out.println("x=" + x + " y=" + y); // x=6 y=6
		System.out.println();

		// 2.
		int x1 = 5;
		int y1 = 5;
		if (x1++ == 6 && ++y1 == 6) { // x1==6?false,x1++=6
			x1 = 11;
		}
		System.out.println("x1=" + x1 + " y1=" + y1); // x1=6 y1=5
		System.out.println();

		// 3.
		int x2 = 5;
		int y2 = 5;
		if (x2++ == 5 | ++y2 == 5) { // x2=5==5=true,,++y2=6
			x2 = 11;                 // x2=11
		}
		System.out.println("x2=" + x2 + " y2=" + y2); // x2=11 y2=6
		System.out.println();

		// 4.
		int x3 = 5;
		int y3 = 5;
		if (x3++ == 5 || ++y3 == 5) { // x3=5==5=true, x3++=6
			x3 = 11;				  // x3=11
		}
		System.out.println("x3=" + x3 + " y3=" + y3); // x3=11 y3=5
		System.out.println();

		// 5.
		boolean xx = true;
		boolean yy = false;
		short zz = 46;
		if ((zz++ == 46) && (yy = true)) zz++; // 46==46=true,zz++=47, yy=true=>true, zz++=48
		if ((xx = false) || (++zz == 49)) zz++; // x=false=>false,++zz=49==49=true, zz++=50
		System.out.println("zz=" + zz);	// 50

	}

	// ��ֵ�����
	static void assignment() {
		// ������ֵ�����
		int sum = 1 + 2;
		System.out.println(sum); // 3
		System.out.println();

		// ���ϸ�ֵ�����
		byte b = 12;
		b += 12; // ������ b = b + 12 �Ǳ���ʧ�ܵġ������� ��������, ���� b += 12 => b = byte(b + 2)=>byte=24
		System.out.println(b);
		b++; // b = byte(b + 1) = 25
		System.out.println(b);
	}

	// ��Ԫ�����
	static void ternary() {
		// ��Ԫ����: ���� ? ��-���ʽ : ��-���ʽ
		int a = 60;
		byte b = 70;
		int r = a > b ? a-- : --b; // a > b ת��int�Ƚ�, r ����Ϊint����, a > b ? false=> --b;
		System.out.println("a = " + a); // 60
		System.out.println("b = " + b); // 69 int r=--b => b=(int)(b-1)=69;r=b=69
		System.out.println("r = " + r); // 69

		// ϸ�ڣ�`��-���ʽ` �� `��-���ʽ` ҪΪ ���Ը�ֵ�����ܱ���������
	}

	static void practice_3() {
		// �ҳ������������ֵ
		int n1 = 55;
		int n2 = 33;
		int n3 = 123;
		// ˼·һ��2���ȱȽ��ҳ����нϴ�ĺ���һ�����Ƚ�,�����ҳ��ϴ�ġ������Ǹ��������ġ�
		int max = n1 > n2 ? n1 : n2;
		max = max > n3 ? max : n3;
		System.out.println("���ֵΪ: " + max);
	}
}