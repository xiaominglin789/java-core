import java.util.Scanner;

public class Array_001 {
    public static void main(String[] args) {
        // practice_1();
        // practice_2();
        // practice_3();
        // practice_assign();
        // practice_copy();
        // practice_reverse();
        // practice_dynamic();
        practice_reduce();
    }

    static void practice_1() {
        /**
        题目: 一个养鸡场有6只鸡, 体重分别是: 3kg 5kg 1kg 3.4kg 2kg 50kg.
        请问 这6只鸡的总体重
         */
        double[] weights = {3, 5, 1, 3.4, 2, 50};
        double total = 0d;
        double average = 0d;
        for (int i=0; i < weights.length; i++) {
            total += weights[i];
        }
        System.out.println("总体重：" + total + "kg");
        average = total / weights.length;
        System.out.println("平均重量：" + average + "kg");
    }

    /**数组遍历 */
    static void practice_2() {
        /**
        题目: 创建一个char数组,分别放置: 'A' -'Z', 并且打印所有元素. tip:第一个元素: 'A'
         */
        char start = 'A';
        int len = 26;
        
        char[] chs = new char[len];
        for (int i=0; i < len; i++) {
            chs[i] = (char)(start + i);
        }

        System.out.println("数组遍历方式一:");
        for (int i=0; i < chs.length; i++) {
            System.out.print("第 " + i + " 个元素: " + chs[i] + ", ");
        }

        System.out.println("\n数组遍历方式二:");
        for (char child : chs) {
            System.out.print("元素: " + child + " ");
        }
        System.out.println();
    }

    /** 元素查找 */
    static void practice_3() {
        /**
        一个整形数组,找出值最大的元素和它的下标
        int[] nums = {4,-1,9,10,21,17};
        =》 同理也可以找最小值
         */
        int[] nums = {4,-1,9,10,21,17};

        // 先设置第一个为最大值
        int max = nums[0];
        int index = 0; 
        /** 拿出每个元素对比当前的最大值， 大于则设置为最大值,记录下标 */
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        System.out.println("最大的元素是: " + max + " 下标为: " + index);
    }

    /** 数组赋值机制 */
    static void practice_assign() {
        /** 基础数据类型: byte short int long float double char boolean */
        int a = 11;
        int b = a;
        System.out.println("a=" + a + ", b=" + b); // a=11, b=11
        b = 99;
        System.out.println("a=" + a + ", b=" + b); // a=11, b=99

        /** 引用数据类型: 对象/类/接口(...数组) */
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;
        System.out.println("{1,2,3} 是同一块地址 ？ " + (arr1 == arr2));
        arr2[1] = 99;
        System.out.print("操作 arr2[1] = 99 后, 查看数组 arr1 的元素: ");
        for (int child : arr1) {
            System.out.print(child + " ");
        }
        System.out.println("查看数组 arr2 的元素: ");
        for (int child : arr2) {
            System.out.print(child + " ");
        }
        System.out.println();
    }

    /** 数组元素拷贝 */
    static void practice_copy() {
        /** 数组深拷贝(简单例子)-让2个数组的操作隔离, 互补干扰 */
        int[] oldArray = {996, 966, 997};
        int[] newArray = new int[oldArray.length];
        System.out.print("{996, 966, 997} 深拷贝得到: ");
        for (int i=0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
            System.out.print(newArray[i] + " ");
        }

        System.out.println("操作 oldArray[2] = 007");
        oldArray[2] = 007;

        System.out.println("查看数组 oldArray 的元素: ");
        for (int child : oldArray) {
            System.out.print(child + " ");
        }

        System.out.println("操作 newArray[2] = 965");
        newArray[1] = 965;

        System.out.println("查看数组 newArray 的元素: ");
        for (int child : newArray) {
            System.out.print(child + " ");
        }
        System.out.println();
    }

    /** 数组反转次数 */
    static void practice_reverse() {
        /**
        题目: 把数组的元素反转
        {11,22,33,44,55,66} => {66,55,44,33,22,11}
        要求: 1.自身元素的反转 2.得到新的数组
         */
        int[] arr = {11,22,33,44,55,66, 77};
        System.out.println("原数组 arr: {11,22,33,44,55,66}");
        // 1.自身元素的反转
        // 找出中间位置, 左右两两的元素互换
        int middle = arr.length / 2;
        for (int i=0; i < middle; i++) {
            arr[i] = arr[i] ^ arr[arr.length-1 - i];
            arr[arr.length-1 - i] = arr[i] ^ arr[arr.length-1 - i];
            arr[i] = arr[i] ^ arr[arr.length-1 - i];
        }

        System.out.print("\n反转后, 原数组 arr:{");
        for (int child : arr) {
            System.out.print(child + ",");
        }
        System.out.print("}\n");

        // 2.得到新的数组
        // 旧数组从尾倒过来遍历,将元素装进新的数组中
        int[] oldArray = {11,22,33,44,55,66, 77};
        int[] newArray = new int[oldArray.length];
        System.out.println("\n原数组 oldArray: {11,22,33,44,55,66}");
        for (int len=oldArray.length-1,i=0; i < oldArray.length; len--, i++) {
            newArray[i] = oldArray[len];
        }
        System.out.print("\n得到新数组:{");
        for (int child : newArray) {
            System.out.print(child + ",");
        }
        System.out.print("}\n");
        oldArray = newArray; // 重新 oldArray 地址 指向 新数组地址
    }

    /** 数组动态扩容 */
    static void practice_dynamic() {
        /**
        题目:
        动态实现的给数组添加元素,实现数组的扩容.
        1.原始数组用静态数组分配 int[] arr = {1,2,3};
        2.添加元素 4 实现 int[] arr = {1,2,3，4};
        3.用户可以通过输入判断 决定是否继续添加，添加成功(数组扩容)。
        4.数组每次扩容为原来的长度+1。
         */
        int[] arr = {11,21,23};
        printArray(arr);
        Scanner scanner = new Scanner(System.in);
        System.out.println("准备添加新元素 4, 是否扩容？ (Yes/n)");
        String yes = scanner.next();
        if ("Y".equals(yes) ||
            "y".equals(yes) ||
            "Yes".equals(yes) ||
            "YES".equals(yes) ||
            "yes".equals(yes))
        {
            int[] tmp = new int[arr.length+1];
            for (int i=0;i < arr.length; i++) {
                tmp[i] = arr[i];
            }
            tmp[arr.length] = 4;
            // 重新指向
            arr = tmp;
        } else {
            System.out.println("取消了扩容");
        }
        printArray(arr);
    }

    /** 数组缩容操作 */
    static void practice_reduce() {
        /**
        有个数组 {1,2,3,4,5}  可以将数组进行缩容操作,提示用户是否继续缩容。
        每次缩减最后那个元素、当只剩下最后一个元素时，提示 不能再缩减。
         */
        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        printArray(arr);
        System.out.println("缩减操作: ");
        while(true) {
            // 按要求-缩容操作
            int[] newArr = new int[arr.length-1];
            for (int i=0;i < arr.length-1; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
            printArray(arr);

            if (arr.length <= 1) {
                System.out.println("不能再缩减。");
                break;
            }

            System.out.print("\n是否继续缩容（Y/n）: ");
            char isCuntine = sc.next().charAt(0);
            if ('Y' != isCuntine) {
                System.out.print("\n退出.\t");
                printArray(arr);
                break;
            }
        }
    }

    /** 查看int数组的元素内容 */
    static String printArray(int[] arr) {
        String result = "{";
        String chr = ",";

        for(int child : arr) {
            result += child + chr;
        }
        result = result.substring(0, result.length() -1) + "}";
        System.out.println("查看数组结构: " + result);
        return result;
    }
}