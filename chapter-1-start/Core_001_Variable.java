public class Core_001_Variable {
	public static void main(String[] args) {
		// declare
		int num;
		// assignment
		num = 99;
		System.out.println(num);

		// declare && assignment
		int size = 100;
		System.out.println(size);

		// print info
		Core_001_Variable.printPersonInfo();
	}

	private static void printPersonInfo() {
		String name = "apem";
		int age = 27;
		char gender = 'w';
		double score = 71.0;

		System.out.print("打印个人信息:\n" + "姓名\t年龄\t性别\t得分\n" + 
		name + "\t" + age + "\t" + gender + "\t" + score);
	}
}
