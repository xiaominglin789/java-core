import java.util.Scanner;

public class Core_007_NamingRulesAndSpecifications {
	// �����淶
 	public static void main(String[] args) {
 		/**
 		 * Java�����淶
		 * �ϸ����ִ�Сд
		 * ������ʹ�ùؼ��ֺͱ�����
		 * ������xxx.yyy.zzz, exp: com.apem163.shop
		 * �ࣺ��д��ĸ��ͷ + �շ�, exp: PlusChar
		 * ���Ա������Сд��ĸ���� + �շ�, exp: appName
		 * �෽����Сд + �շ�, exp: startApplication
		 * �ೣ����ȫ��д �� ��д+�»�������, exp: MENU_CATES
 		 */
 		Core_007_NamingRulesAndSpecifications.scannerPractice();
	}

	// Scanner��ϰ
	static void scannerPractice() {
		// ʵ��Scanner����
		Scanner scanner = new Scanner(System.in);
		// ��������
		String inputValue = scanner.nextLine();
		if (inputValue != null) {
			System.out.println("���������: " + inputValue);
		}
	}
}
