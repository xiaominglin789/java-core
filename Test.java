public class Test {
  public static void main(String[] args){
    Test.practice_1();
  }

  static void practice_1() {
  	int[] cls = {1,2,3,4};
    for(int i=0;i < cls.length; i++) {
      if (i == 2) {
      	return; // 满足条件则退出该方法，"3"、"4"、"程序运行结束" 都不会输出
      }
      System.out.println(cls[i]);
    }
    System.out.println("程序运行结束");
  }
}
