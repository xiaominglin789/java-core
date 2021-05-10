import java.util.Scanner;

public class Core_010_ProcessControl {
	public static void main(String[] args) {
		Core_010_ProcessControl.ifBranchControl();
		System.out.println("---------------------");
		Core_010_ProcessControl.forBranchControl();
		System.out.println("---------------------");
		Core_010_ProcessControl.whileBranchControl();
		System.out.println("---------------------");
		Core_010_ProcessControl.practice_1();
		System.out.println("---------------------");
		Core_010_ProcessControl.practice_2();
		System.out.println("---------------------");
		Core_010_ProcessControl.practice_3();
		System.out.println("---------------------");
		Core_010_ProcessControl.practice_4();
		System.out.println("---------------------");
		Core_010_ProcessControl.practice_5();
		System.out.println("---------------------");
		Core_010_ProcessControl.practice_6();
		System.out.println("---------------------");
		Core_010_ProcessControl.practice_7();
		System.out.println("---------------------");
		Core_010_ProcessControl.practice_8();
		System.out.println("---------------------");
		Core_010_ProcessControl.practice_9();
	}

	/**
	 * for
	 */
	static void forBranchControl() {
		
	}

	/**
	 * while
	 */
	static void whileBranchControl() {
		
	}

	/**
	 * if
	 */
	static void ifBranchControl() {
		System.out.println("输入马保国同志的能量值:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num > 90) {
			System.out.println("闪电五连鞭!!!");
		} else if (num > 70 && num <= 90) {
			System.out.println("马家刀法");
		} else if (num > 50 && num <= 70) {
			System.out.println("混元形意掌");
		} else {
			System.out.println("能量不足,马老师被偷袭,被打得鼻青脸肿");
		}
	}

	static void practice_1() {
		// 1.题目:
		//    老王有 100_000 元现金,每经过一次路口都需要缴费:
		//   1.现金 > 50_000, 需要交 5%
		//   2.现金 <= 50_000, 每次只要 1000 元;
		// 问老王能经过多少次路口

		// do while
		double total = 100_000;
		int condition = 50_000;
		int crossCount = 0;
		double ratio = 0.05;
		while(total - condition > 0) {
			total = total - (total * ratio);
			crossCount++;
		}
		crossCount += total / 1000;
		total -= (int)(total / 1000) * 1000;
		System.out.println("老王能经过 " + crossCount + " 次路口, 剩余现金: " + total);

		// while...break
		 double money = 100_000;
		int limt = 50_000;
		int count = 0;
		while(true) {
			if (money > limt) { 
				money = money - money * ratio;
			} else if (money >= 1000) {
				money -= 1000;
			} else {
				break;
			}
			count++;
		}
		System.out.println("老王能经过 " + count + " 次路口, 剩余现金: " + money);
	}

	static void practice_2() {
		// 2.找出 100-1000 之间的水仙花数(水仙花数: 153 = 1x1x1 + 5x5x5 + 3x3x3 )

		// 解法一:
		System.out.print("\n解法一: 100-1000 之间的水仙花数有： {");
		for (int i = 100,individual,ten,hundred,sum;  i < 1000; i++) {
			individual = i / 1 % 10; // ��
			ten = i / 10 % 10; // ʮ
			hundred = i / 100 % 10; // ��
			sum = (int)Math.pow(hundred, 3) + (int)Math.pow(ten, 3) + (int)Math.pow(individual, 3);
			if (sum != i) { continue; }
			System.out.print(" " + i + ",");
		}
		System.out.print("}\n");

		// 解法二:
		System.out.print("\n解法二： 100-1000 之间的水仙花数有： {");
		for (int k=1,sum; k<=9; k++) {
			for (int p=0; p<=9; p++) {
				for (int i=0; i<=9; i++) {
					sum = k*100+p*10+i;
					if (k*k*k+p*p*p+i*i*i == sum) {
						System.out.print(" " + sum + ",");				
					}
				}
			}
		}
		System.out.print("}\n");
	}

	static void practice_3() {
		/**
		 * 问:如下代码最终输出的结果
		 * int m=0,n=3;
		 * if (m>0) {
		 *     if (n>2)
		 *         System.out.println("OK1");
		 * 	   else
		 *         System.out.println("OK2");
		 * }

		 * 答: 什么也输出
		 */
		int m=0,n=3;
		if (m>0) {
			if (n>2)
				System.out.println("OK1");
			else
		  	System.out.println("OK2");
		 }
	}

	// if...else
	static void practice_4() {
		/**
		 * 题目:
		 *   参加歌手比赛,如果初赛成绩大于 8.0 则进入决赛,
		 *   否则提示淘汰。根据性别提示进入男子组 或 女子组
		 *
		 * 提示:double scope, char gender
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入歌手比赛成绩: ");
		double scope = sc.nextDouble();
		if (scope > 8.0) {
			System.out.print("请输入歌手性别:");
			char gender = sc.next().charAt(0);
			if (gender == '男') {
				System.out.println("恭喜晋级 男子决赛组");
			} else if (gender == '女') {
				System.out.println("恭喜晋级 女决赛组");
			} else {
				System.out.println("请正确输入的性别, 要求: '男' / '女' ");
			}
		} else {
			System.out.println("淘汰...");
		}
	}

	// if...else if...else
	static void practice_5() {
		/**
		 * 出票系统: 根据淡旺季的月份和顾客的年龄,打印票价
		 * 4-10月 旺季:
		 * 		成人 18-60 : 60
		 * 		儿童 < 18  : 半价
		 * 		老人 > 60  : 1/3
		 * 淡季
		 * 		成人: 40
		 * 		其他: 20
		 */
		int defaultPrice = 60;
		Scanner sc = new Scanner(System.in);
		System.out.println("请先输入当前月份: ");
		int mouth = sc.nextInt();
		if (mouth > 12 && mouth < 0) {
			System.out.println("非法月份...");
		} else if (mouth >= 4 && mouth <=10) {
			System.out.print("当前为旺季, 输入顾客的年龄: ");
			int age = sc.nextInt();
			if (age > 60) {
				System.out.println("票价: " + defaultPrice/3 + " 元/人");
			} else if (age >= 18 && age <= 60) {
				System.out.println("票价: " + defaultPrice + " 元/人");
			} else if (age >= 0 && age < 18) {
				System.out.println("票价: " + defaultPrice/2 + " 元/人");
			} else {
				System.out.println("你输入了错误的年龄");
			}
		} else {
			System.out.print("当前为淡季, 输入顾客的年龄: ");
			int age = sc.nextInt();
			if (age >= 40) {
				System.out.println("票价: " + (defaultPrice/3 * 2) + " 元/人");
			} else if (age > 0 && age < 40) {
				System.out.println("票价: " + defaultPrice/3 + " 元/人");
			} else {
				System.out.println("你输入了错误的年龄");
			}
		}
	}

	/**
	 * switch
	 */
	static void practice_6() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个字符(a-g): ");
		char varlidator = scanner.next().charAt(0);
		switch(varlidator) {
			case 'a':
				System.out.println("今天是星期一");
				break;
			case 'b':
				System.out.println("今天是星期二");
				break;
			case 'c':
				System.out.println("今天是星期三");
				break;
			case 'd':
				System.out.println("今天是星期四");
				break;
			case 'e':
				System.out.println("今天是星期五");
				break;
			case 'f':
				System.out.println("今天是星期六");
				break;
			case 'g':
				System.out.println("今天是星期日");
				break;
			default:
				System.out.println("你的输入没有匹配到...");
			    break;
		}
		System.out.println("");

		/**
		 * 题目:
		 *   接收输入, 把 小写类型的 char 转成大写。只转换 a,b,c,d,e
		 */
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("请输入 {a,b,c,d,e} 中的一个: ");
		char inputVal = scanner2.next().charAt(0);
		String result;
		switch(inputVal) {
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
				result = String.valueOf((char)(inputVal-32));
				break;
			default:
				result = "other";
				break;
		}
		System.out.println(inputVal + "经过转换后得到: " + result);

		/**
		 * 练习二:
		 *   对于学生成绩 大于 60分的,输出合格。低于 60分的, 输出不合格。(成绩不能大于100)
		 *   要求: 使用 switch 完成
		 */
		Scanner scanner3 = new Scanner(System.in);
		System.out.print("请输入学生成绩[0, 100]: ");
		int inputVal2 = scanner.nextInt();
		if (inputVal2 < 0 || inputVal2 > 100) {
			System.out.println("输入的成绩不合法...");
			return;
		}
		String result2 = "";
		int varlidator2 = (int)(inputVal2/60);
		switch(varlidator2) {
			case 0:
				result2 = "不合格";
				break;
			case 1:
				result2 = "合格";
				break;
		}
		System.out.println(result2);

		/**
		 * 题目三:
		 *  输入月份,打印季节: 3,4,5 春季， 6,7，8 夏季， 9,10,11 秋季， 12,1,2 冬季，
		 */
		Scanner scanner4 = new Scanner(System.in);
		System.out.print("�������·�:");
		int mouth = scanner4.nextInt();
		String seasonText = "";
		switch(mouth) {
			case 3:
			case 4:
			case 5:
				seasonText = "春季";
				break;
			case 6:
			case 7:
			case 8:
				seasonText = "夏季";
				break;
			case 9:
			case 10:
			case 11:
				seasonText = "秋季";
				break;
			case 12:
			case 1:
			case 2:
				seasonText = "冬季";
				break;
			default:
				seasonText = "你输入的是非法月份数";
				break;
		}
		System.out.println(mouth + " 是 " + seasonText);
	}	

	/**
	 * for
	 */
	static void practice_7() {
		/**
		 * 练习一:
		 *   打印 1~100 ֮所有是 9 的倍数, 统计 个数 及 总和。
		 */
		int MAX = 100;
		int MIN = 1;
		int BASE = 9;
		int count = 0;
		int sum = 0;
		// 解法一:
		for(int i = 1; i <= 100; i++) {
			if (i % BASE == 0) {
				System.out.print(i + " ");
				count++;
				sum += i;
			}
		}
		System.out.println("\n打印 1~100 ֮所有是 9 的倍数的个数: " + count);
		System.out.println("打印 1~100 ֮所有是 9 的倍数的总和: " + sum);

		// 解法二:
		int size = 0;
		int total = 0;
		for(int i=MIN,sum2=0; sum2 <= MAX; i++) {
			sum2 = i * BASE;
			if (sum2 <= 100) {
				System.out.print(sum2 + " ");
				size++;
				total += sum2;
			}
		}
		System.out.println("\n打印 1~100 ֮所有是 9 的倍数的个数: " + size);
		System.out.println("打印 1~100 ֮所有是 9 的倍数的总和: " + total);

		/**
		 * 完成下面的表达式输出
		 * 3 + 10 = 13
		 * 4 + 9 = 13
		 * 5 + 8 = 13
		 * 6 + 7 = 13
		 * 7 + 6 = 13
		 * 8 + 5 = 13
		 * 9 + 4 = 13
		 * 10 + 3 = 13
		 */
		int endSum = 13;
		int start = 3;
		System.out.println("表达式输出: ");
		for (int i = start; i <= endSum; i++) {
			for (int j = start; j <= endSum ; j++) {
				if (i + j == endSum) {
					System.out.println(i+ " + " + j + " = " + endSum);
				}
			}
		}

		/**
		 * 完成下面的表达式输出
		 * 1 x 48 = 48
		 * 2 x 24 = 48
		 * 3 x 16 = 48
		 * 4 x 12 = 48
		 * 6 x 8 = 48
		 */
		int endQUE = 48;
		int starQUE = 3;
		System.out.println("表达式输出: ");
		for (int i = starQUE; i <= endQUE; i++) {
			for (int j = starQUE; j <= endQUE ; j++) {
				if (i * j == endQUE) {
					System.out.println(i+ " x " + j + " = " + endQUE);
				}
			}
		}
	}

	/**
	 * while 和 do..while
	 */
	static void practice_8() {
		/**
		 * 练习: 
		 *  1.打印 1-100 所有3的倍数的数
		 * 	2.打印 40-200 所有偶数的数 
		 */
		 int MAX = 100;
		 int MIN = 1;
		 int MULTIPLE = 3;
		 int remainder = 0;
		 System.out.print("打印 1-100 所有3的倍数的数: ");
		 while(MAX-- > MIN) {
			 remainder = MAX % MULTIPLE;
			 if (remainder != 0) { continue; }
			 System.out.print(MAX + " ");
		 }
		 System.out.println();

		 MAX = 200;
		 MIN = 40;
		 MULTIPLE = 2;
		 System.out.print("打印 40-200 所有偶数的数: ");
		 while(MAX-- > MIN) {
			 remainder = MAX % MULTIPLE;
			 if (remainder != 0) { continue; }
			 System.out.print(MAX + " ");
		 }
		 System.out.println();

		 /**
		  * do..while
		  * 题目:
		  *   统计 1-200 之间能被`5`整除但是不能被`3`整除的数的个数(do..while)
		  * 思路:
		  *   1.化繁为简: 使用do..while输出 1-200
		  *   2.过滤: 能被5整除但不能被3整除的数
		  *   3.统计 满足条件的个数
		  *   4.先死后活
		  */
		int count = 0;
		int maxLimit = 200;
		int first = 5;
		int second = 3;
		int index =1;
		do {
			if (index % first == 0 && index % second !=0) {
				// System.out.println("i = " + i);
				count++;
			}
			index++;
		} while(index <= maxLimit);
		System.out.println("1-200 之间能被`5`整除但是不能被`3`整除的数的个数: " + count);

		/**
		 * 多重循环
		 * 练习一:
		 *   统计3个班的成绩情况，每个班5名同学，
		 *     1.求出各个班的平均分和所有班的平均分。
		 *     2.统计三个班的及格人数
		 */
		int[] class_1_scores = {71, 91, 57, 48, 66};
		int[] class_2_scores = {51, 91, 57, 88, 82};
		int[] class_3_scores = {83, 68, 57, 78, 96};
		int class_1_sum = 0;
		int class_2_sum = 0;
		int class_3_sum = 0;
		int passCont = 0;
		int passScore = 60;
		boolean isCalcuing = true;
		while(isCalcuing) {
			for(int k = 0; k < class_1_scores.length; k++) {
				class_1_sum += class_1_scores[k];
				if (class_1_scores[k] >= passScore) {
					passCont++;
				}
			}
			System.out.println("class_1 的平均分: " + (double)(class_1_sum/5.0));
			for(int p = 0; p < class_2_scores.length; p++) {
				class_2_sum += class_2_scores[p];
				if (class_2_scores[p] >= passScore) {
					passCont++;
				}
			}
			System.out.println("class_2 的平均分: " + (double)(class_2_sum/5.0));
			for(int i = 0; i < class_3_scores.length; i++) {
				class_3_sum += class_3_scores[i];
				if (class_3_scores[i] >= passScore) {
					passCont++;
				}
			}
			System.out.println("class_3 的平均分: " + (double)(class_3_sum/5.0));
			System.out.println("所有班级的平均分: " + (double)((class_3_sum + class_2_sum + class_1_sum)/15.0));
			System.out.println("三个班的及格人数: " + passCont);
			isCalcuing = false;
		}

		/**
		 * 练习二:
		 *   打印九九乘法表
		 * 九九乘法表:
			1 x 1 = 1  
			1 x 2 = 2  2 x 2 = 4  
			1 x 3 = 3  2 x 3 = 6  3 x 3 = 9  
			1 x 4 = 4  2 x 4 = 8  3 x 4 = 12  4 x 4 = 16  
			1 x 5 = 5  2 x 5 = 10  3 x 5 = 15  4 x 5 = 20  5 x 5 = 25  
			1 x 6 = 6  2 x 6 = 12  3 x 6 = 18  4 x 6 = 24  5 x 6 = 30  6 x 6 = 36  
			1 x 7 = 7  2 x 7 = 14  3 x 7 = 21  4 x 7 = 28  5 x 7 = 35  6 x 7 = 42  7 x 7 = 49  
			1 x 8 = 8  2 x 8 = 16  3 x 8 = 24  4 x 8 = 32  5 x 8 = 40  6 x 8 = 48  7 x 8 = 56  8 x 8 = 64  
			1 x 9 = 9  2 x 9 = 18  3 x 9 = 27  4 x 9 = 36  5 x 9 = 45  6 x 9 = 54  7 x 9 = 63  8 x 9 = 72  9 x 9 = 81
		 * 思路:
		 *   化繁为简:
		 *		1.双重循环 打印出 1 乘到 9 = 积
		 *		2.内层循环控制结束换行: 第二个乘数的值 小于等于 第一个乘数
		 *      3.内层循环结束,要换行
		 *   先死后活:
		 *      最大的循环数,最小的开始数
		 */
		int firstChar = 1;
		int endChar = 9;
		System.out.println("九九乘法表:");
		for (; firstChar <= endChar; firstChar++) {
			int secondChar = 1;
			for (; secondChar <= firstChar; secondChar++) {
				System.out.print(secondChar + " x " + firstChar + " = " + (firstChar * secondChar) + "  ");
			}
			System.out.println();
		}
	}

	static void practice_9() {
		/**
		 * 打印: 空心金字塔， 效果
		     *
		    * *
  		   *   *
          *     *
		 *********

		 * 思路:
		 * 	 1.先打印出 矩形
		 *   2.打印半个金字塔
		 *   3.打印整个金字塔
		 *   4.空心处理
		 *   5.先死后活
		 */
		practice_hollow_pyramid_1();
		practice_hollow_pyramid_2();
		practice_hollow_pyramid_3();
		practice_hollow_pyramid_4();
		practice_hollow_pyramid_5();
	}

	/**
	 * 打印空心金字塔 1-打印5行5列的实心矩阵
	   *****
	   *****
	   *****
	   *****
	   *****
	 */
	static void practice_hollow_pyramid_1() {
		System.out.println("思路1-打印5行5列的实心矩阵: ");
		for (int i = 1; i <= 5; i++) {
			System.out.println("*****");
		}
	}

	/**
	 * 打印空心金字塔 2-打印半个金字塔
	   *            // 第1层 1个*, 星数 = 层数
	   **			// 第2层 2个*
	   ***	        // 第3层 3个*
	   ****			// 第4层 4个*
	   *****		// 第5层 5个*
	   tip: 如何控制打印每层的 * 个数
	 */
	static void practice_hollow_pyramid_2() {
		System.out.println("思路2-打印半个金字塔: ");
		for (int i = 1; i <= 5; i++) {
			// System.out.println("*****");
			for (int j=1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * 打印空心金字塔 3-打印整个金字塔
	        *           // 第1层 1个*, 星数 = 2x层数 - 1 = 2x1 - 1 = 1, 空格数 = 4 = 总层数 - 层数
	       ***			// 第2层 3个*, 星数 = 2x层数 - 1 = 2x2 - 1 = 3, 空格数 = 3 = 总层数 - 层数
	      *****	        // 第3层 5个*, 星数 = 2x层数 - 1 = 2x3 - 1 = 5, 空格数 = 2 = 总层数 - 层数
	     *******		// 第4层 7个*, 星数 = 2x层数 - 1 = 2x4 - 1 = 7, 空格数 = 1 = 总层数 - 层数
	    *********		// 第5层 9个*, 星数 = 2x层数 - 1 = 2x5 - 1 = 9, 空格数 = 0 = 总层数 - 层数
	   tip: 如何控制打印每层的 * 个数 和 空格 个数
	 */
	static void practice_hollow_pyramid_3() {
		System.out.println("思路3-打印整个金字塔: ");
		for (int i = 1; i <= 5; i++) {
			for (int j=1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j=1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * 打印空心金字塔 4-打印空心金字塔
	        *       // 第1层 1个*, 星数 = 2x层数 - 1 = 2x1 - 1 = 1, 空格数 = 4 = 总层数 - 层数
	       * *		// 第2层 3个*, 星数 = 2x层数 - 1 = 2x2 - 1 = 3, 空格数 = 3 = 总层数 - 层数
	      *   *	    // 第3层 5个*, 星数 = 2x层数 - 1 = 2x3 - 1 = 5, 空格数 = 2 = 总层数 - 层数
	     *     *	// 第4层 7个*, 星数 = 2x层数 - 1 = 2x4 - 1 = 7, 空格数 = 1 = 总层数 - 层数
	    *********	// 第5层 9个*, 星数 = 2x层数 - 1 = 2x5 - 1 = 9, 空格数 = 0 = 总层数 - 层数
	   tip: 1.如何控制每行的空心数和实心数
	        2.当前行的第一个位置是 星, 最后一个位置也是 星
			3.最后一行 星 全部输出
	 */
	static void practice_hollow_pyramid_4() {
		System.out.println("思路4-打印空心金字塔: ");
		for (int i = 1; i <= 5; i++) {
			for (int j=1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j=1; j <= 2 * i - 1; j++) {
				if (i == 5 || j == 1 || j == (2*i-1)) {
					System.out.print("*");
				} else {
					// 其他位置 空心
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	/**
	 * 打印空心金字塔 6-先死后活
	 */
	static void practice_hollow_pyramid_5() {
		int rowLevel = 9; // 层数
		System.out.println("思路6-先死后活: 层数变量 = " + rowLevel);
		for (int i = 1; i <= rowLevel; i++) {
			for (int j=1; j <= rowLevel - i; j++) {
				System.out.print(" ");
			}
			for (int j=1; j <= 2 * i - 1; j++) {
				if (i == rowLevel || j == 1 || j == (2*i-1)) {
					System.out.print("*");
				} else {
					// 其他位置 空心
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

