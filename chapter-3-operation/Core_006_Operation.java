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

	// 算术运算符
	static void arithmetic() {
		// 1.加、减、乘、除、取余、++、--
		// 1-1 除法
		System.out.println(10 / 4); // ? 输出 2, 因为 int / int 结果取最高精度是 int,所有会把小数部分去掉了
		System.out.println(10.0 / 4); // ? 输出 2.5, 因为 double / int 结果取精度 double
		
		double d = 10 / 4;
		System.out.println(d); // ? 输出 2.0, 因为 int / int 结果取最高精度得到2, 2再转成double得到2.0

		// 1-2 取余（模）
		// 取余的本质: a % b = a - (a / b) * b
		System.out.println(10 % 3); // 1,  10 - (10/3)*3 = 10-9 = 1
		System.out.println(-10 % 3); // -1, (-10) - [(-10)/3]*3 = -10-(-3)*3= -1
		System.out.println(10 % -3); // 1, 10 - [10/(-3)]*(-3) = 10-(-3)*(-3)= 1
		System.out.println(-10 % -3); // -1

		// 1-3 ++、--
		int a3 = 1;
		a3 = a3++;
		// 后`++` 的规则
		// 1.声明一个临时变量: temp = a3 = 1
		// 2.a3 = a3 + 1 = 2
		// 3.a3 = temp = 1
		System.out.println("a3=" + a3); // 1 ? 

		int a4 = 1;
		a4 = ++a4;
		// 前`++` 的规则:
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
		// 1.假如还有59天放假, 问 合多少个星期零多少天？
		// y = 7 * a + d = 59
		int days = 59;
		int week = days/ 7; // = 8;
		int less = days % 7; //  59 - (59 / 7) * 7 = 59 - 8 * 7 = 59 - 56 = 3;
		System.out.println("合"+ week +"个星期零"+ less +"天");
		System.out.println();

		// 2.定义一个变量保存华氏温度, 华氏温度转成摄氏温度的公式是：5/9 * (华氏温度 - 100), 当前的华氏温度是: 234.5, 请求出华氏温度对应的摄氏温度。
		// y = 5/9 * (x-100)
		// 注意: java中 5/9 = 整型/整型 => 整型 = 0
		double x = 234.5;
		double y = (5.0 / 9) * (x - 100); // 5.0/9 * 134.5 = 74.72xxxx
		System.out.println(x + "华氏温度 = " + y + "摄氏温度");
	}

	// 关系运算符
	static void relational() {
		boolean fg1 = true;
		boolean fg2= false;
		System.out.println("fg1 && fg2 => " + (fg1 && fg2)); // false
		System.out.println("fg1 || fg2 => " + (fg1 || fg2)); // true
		System.out.println("!fg1 => " + !fg1);       // false
		System.out.println("!fg => " + !fg2);       // true
	}

	// 逻辑运算符
	static void logical() {
		// 1.与 ->规则: 2个条件都为:true, 结果为:true. 否则结果为:false
		// &&(短路与) 第一个条件为false, 后面的条件不再判断,最终结果为:false。效率高
		// &(逻辑与) 第一个条件为false, 后面的条件仍然要去判断。效率低
		int a = 4;
		int b = 9;
		if (a < 4 && ++b < 11) {
			System.out.println("a > 4 & ++b < 11 条件满足"); // 不执行
		}
		System.out.println("a=" + a + " b=" + b); // a=4 b=9
		if (a < 4 & ++b < 11) {
			System.out.println("a > 4 & ++b < 11 条件满足"); // 不执行
		}
		System.out.println("a=" + a + " b=" + b); // a=4 b=10
		System.out.println();
		
		// 2.或 ->规则: 只要有一个条件为:true, 结果为:true. 全部为: false,结果才为为:false
		// ||(短路或) 第一个条件为:true, 第二个条件不在判断,最终结果为: true。效率高
		// |(逻辑或) 不管第一个条件是否为:true, 第二个条件都要判断。执行效率低
		int c = 3;
		int d = 7;
		if (c > 1 || ++d < 5) {
			System.out.println("c > 1 || ++d < 5 条件满足");	
		}
		System.out.println("c=" + c + " d=" + d); // c=3 d=7
		if (c > 1 | ++d < 5) {
			System.out.println("c > 1 | ++d < 5 条件满足");	
		}
		System.out.println("c=" + c + " d=" + d); // c=3 d=8
		System.out.println();

		// 3. `!`: 取反
		System.out.println(60 > 20); // true
		System.out.println(!(60 > 20)); // false
		System.out.println();

		// 4. `^`: 逻辑异或
		// 当 a ^ b 不同时, 结果为true. 否则为 false
		boolean res = (10 > 1) ^ (3 > 5); // true ^ false => true
		System.out.println("res = " + res); // true
		System.out.println();
		// 异或运算符的巧用:在不使用第三个变量的情况下, 交换2个变量的值
		int num = 1;
		int count = 2;
		System.out.println("交换前: num=" + num + " count=" + count);
		num = num ^ count; // num = 0001 ^ 0011 = 0010
		count = num ^ count; // count = 0010 ^ 0011 = 0001
		num = num ^ count; // num = 0010 ^ 0001 = 0011
		System.out.println("交换后: num=" + num + " count=" + count);
	}

	// 逻辑运算符 练习
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

	// 赋值运算符
	static void assignment() {
		// 基础赋值运算符
		int sum = 1 + 2;
		System.out.println(sum); // 3
		System.out.println();

		// 复合赋值运算符
		byte b = 12;
		b += 12; // 按道理 b = b + 12 是编译失败的。由于是 复合运算, 所有 b += 12 => b = byte(b + 2)=>byte=24
		System.out.println(b);
		b++; // b = byte(b + 1) = 25
		System.out.println(b);
	}

	// 三元运算符
	static void ternary() {
		// 三元运算: 条件 ? 真-表达式 : 假-表达式
		int a = 60;
		byte b = 70;
		int r = a > b ? a-- : --b; // a > b 转成int比较, r 至少为int类型, a > b ? false=> --b;
		System.out.println("a = " + a); // 60
		System.out.println("b = " + b); // 69 int r=--b => b=(int)(b-1)=69;r=b=69
		System.out.println("r = " + r); // 69

		// 细节：`真-表达式` 、 `假-表达式` 要为 可以赋值给接受变量的类型
	}

	static void practice_3() {
		// 找出三个数的最大值
		int n1 = 55;
		int n2 = 33;
		int n3 = 123;
		// 思路一：2个先比较找出其中较大的和下一个数比较,依次找出较大的。最后的那个就是最大的。
		int max = n1 > n2 ? n1 : n2;
		max = max > n3 ? max : n3;
		System.out.println("最大值为: " + max);
	}
}