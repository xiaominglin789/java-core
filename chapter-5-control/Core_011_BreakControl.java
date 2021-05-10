import java.util.Scanner;

public class Core_011_BreakControl {
    public static void main(String[] args) {
        Core_011_BreakControl.thinking();
        System.out.println("-----------------------");
        Core_011_BreakControl.practice_1();
        System.out.println("-----------------------");
        Core_011_BreakControl.practice_2();
    }

    static void thinking() {
        /**
         * 思考题:
         *   随机生成 1-100的一个数,直到生成了 96 这个数, 看看一共用了几次?
         * tip：Math.random() => [0.0, 1.0)
         */
        int randomNumber = 0;
        int count = 0;
        int CONST_NUM = 96;
        while(true) {
            randomNumber = (int)(Math.random() * 100) +1;
            count++;
            if (randomNumber == CONST_NUM) { break; }
        }
        System.out.println("一共执行了 " + count + " 次,才生成 " + randomNumber);
    }

    static void practice_1() {
        /**
         * 1-100以内的数求和, 求出当 和 第一次大于 20 的当前数是:? 
         * 思路:
         *   1.循环 1-100  求和 sum
         *   2.当 sum > 20时, 记录夏当前数, 然后 break
         */
        int CONST_TOTAL = 20;
        int MIN = 1;
        int MAX = 100;
        int current = 0;
        int sum = 0;
        for (int i = MIN; i <= 100; i++) {
            sum += i;
            if (sum >= CONST_TOTAL) {
                current = i;
                break;
            }
        }
        System.out.println("1-100以内的数求和, 当 和 第一次大于 20 的当前数是: " + current);
    }

    static void practice_2() {
        /**
         * 题目:
         *   实现登录验证, 有3次机会, 如果用户名为 'root', 密码为 '1234' 提示登录成功、
         *   否则提示还有几次机会。
         * 思路:
         *   1.最多循环3次, 满足条件就提前 break 跳出循环
         *   2.输入错误, 提示还有几次机会. continue 跳过本次循环
         * tip:
         *   字符串的比较: stringA.equals(stringB). equals：比较的是值
         */
        int MIN = 1;
        int MAX_COUNT = 3;
        int less = MAX_COUNT;
        boolean isPass = false;
        Scanner scanner = new Scanner(System.in);
        String inputVal = "";
        String realUsename = "root", realPassword = "1234";
        for (int i=MIN; i <= MAX_COUNT; i++) {
            less--;

            System.out.print("登录验证,请输入用户名: ");
            inputVal = scanner.next();
            if (!realUsename.equals(inputVal)) {
                System.out.println("账号或密码错误, 还可以再试 " + less + " 次。");
                continue;
            }

            System.out.print("请输入密码: ");
            inputVal = scanner.next();
            if (!realPassword.equals(inputVal)) {
                System.out.println("账号或密码错误, 还可以再试 " + less + " 次。");
                continue;
            }

            isPass = true;
            if (isPass) { 
                System.out.println("登录成功");
                break;
            }
        }
        System.out.println("登录验证校验是否通过: " + isPass + " 剩余验证次数: " + less);
    }
}