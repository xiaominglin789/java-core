import java.util.Scanner;

public class Core_007_NamingRulesAndSpecifications {
	// 命名规范
 	public static void main(String[] args) {
 		/**
 		 * Java命名规范
		 * 严格区分大小写
		 * 不可以使用关键字和保留字
		 * 包名：xxx.yyy.zzz, exp: com.apem163.shop
		 * 类：大写字母开头 + 驼峰, exp: PlusChar
		 * 类成员变量：小写字母开发 + 驼峰, exp: appName
		 * 类方法：小写 + 驼峰, exp: startApplication
		 * 类常量：全大写 或 大写+下划线连接, exp: MENU_CATES
 		 */
 		Core_007_NamingRulesAndSpecifications.scannerPractice();
	}

	// Scanner练习
	static void scannerPractice() {
		// 实例Scanner对象
		Scanner scanner = new Scanner(System.in);
		// 接收输入
		String inputValue = scanner.nextLine();
		if (inputValue != null) {
			System.out.println("你输入的是: " + inputValue);
		}
	}
}
