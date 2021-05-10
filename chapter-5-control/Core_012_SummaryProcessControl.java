import java.util.Scanner;

public class Core_012_SummaryProcessControl {
    public static void main(String[] args) {
        Core_012_SummaryProcessControl.practice_1();
        System.out.println("-------------------");
        Core_012_SummaryProcessControl.practice_2();
        System.out.println("-------------------");
        Core_012_SummaryProcessControl.practice_3();
    }

    static void practice_1() {
        /**
         * 判断一个年份是否为闰年
         */        
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入一个年份: ");
        int inputVal = scanner.nextInt();
        if (inputVal % 400 == 0 || (inputVal % 4 == 0 && inputVal % 100 !=0)) {
            System.out.print(" 是润年");
        } else {
            System.out.print(" 是平年");
        }
    }

    static void practice_2() {
        /**
         * 求出 1-1/2+1/3-1/4+1/5-1/6+...+1/99-1/100 的和
         */
        int MAX = 100;
        double sum = 0;
        for (int i=1; i <= MAX; i++) {
            if (i % 2 == 0) {
                sum -= 1/i;
            } else {
                sum += 1/i;
            }
        }
        System.out.println("1-1/2+1/3-1/4+1/5...-1/100 的和 = " + sum);
    }

    static void practice_3() {
        /**
         * 求出 1 + (1+2) + (1+2+3) + ... + (1+2+3+4+...+100) 的结果
         */
        int MAX = 100;
        int sum = 0;
        int temp = 0;
        for (int i=1; i <= MAX; i++) {
            temp = temp + i;
            // System.out.println("第 " + i +" 项是 " + temp);
            sum = sum + temp ;
            // System.out.println("前"+ i +"项的和: " + sum);
        }
        System.out.println("1 + (1+2) + (1+2+3) + ... + (1+2+3+4+...+100) = " + sum);
    }
}