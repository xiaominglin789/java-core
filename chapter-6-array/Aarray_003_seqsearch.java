import java.util.Scanner;
import java.util.Arrays;

public class Aarray_003_seqsearch {
    public static void main(String[] args) {
        practice_sequence_search();
    }

    /** 顺序查找 */
    static void practice_sequence_search() {
        /**
        题目:
        有一组数: {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"}
        猜数游戏: 从键盘中任意输入一个名称，判断数列中是否包含此名称。
            要求: 如果找到,则提示找到了，并给出下标值
         */
        String[] names = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
        System.out.println("数组: " + Arrays.toString(names));

        Scanner sc = new Scanner(System.in);
        System.out.print("\n请输入一个名称: ");
        String input = sc.next().trim();
        boolean flag = false;
        int index = -1;
        for (int i=0; i < names.length; i++) {
            if (names[i].equals(input)) {
                index = i;
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("抱歉,没有这个名字: " + input);
        } else {
            System.out.println(input + " 找到了, 下标为: " + index);
        }
    }
}