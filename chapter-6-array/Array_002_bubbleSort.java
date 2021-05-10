public class Array_002_bubbleSort {
    public static void main(String[] args) {
        practice_1();
        practice_2();
    }

    /** 粗糙的冒泡 */
    static void practice_1() {
        /**
        对如下数组进行冒泡排序, 得到升序的数组。{24,69,80,57,13}
        思路:1.每次取出2个相邻的数进行比较
            2.每轮对比过后都至少将本轮最大的数交换到对应的位置
                第1 轮: {24,69,57,13,80}
                第2 轮: {24,57,13,69,80}
                第3 轮: {24,13,57,69,80}
                第4 轮: {13,24,57,69,80}
         */
        int[] arr = {24,69,80,57,13};
        int len = arr.length;
        int temp = 0;
        System.out.println("原数组:" + printArray(arr));
        int count = 0;
        for (int j=0; j < len-1; j++) {
            for(int i=0; i < len-1-j; i++) {
                count++;
                if (arr[i] > arr[i+1]) {
                    // 大的数后移
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            System.out.println("第 " + (j+1) + " 轮: " + printArray(arr));
        }
        System.out.println("冒泡处理后:" + printArray(arr) + " 经过了 " + count + " 次.");
    }

    /** 冒泡优化 */
    static void practice_2() {
        /**
        对如下数组进行冒泡排序, 得到升序的数组。{24,69,80,57,13}
        1.减少循环比较趟数： 通过标记, 内部循环比较如果没有元素交换位置了。
            那么下一趟之后都是排好序的元素，不需要再去进行内循环比较了。
        2.较少内存： 不使用临时变量进行2个元素的交换,使用 异或运算 来交换元素
         */
        int[] arr = {24,69,80,57,13};
        int len = arr.length;
        System.out.println("原数组:" + printArray(arr));
        int count = 0;
        for (int j=0; j < len-1; j++) {
            boolean flag = false;
            for(int i=0; i < len-1-j; i++) {
                count++;
                if (arr[i] > arr[i+1]) {
                    flag = true;
                    // 大的数后移
                    arr[i] = arr[i] ^ arr[i+1];
                    arr[i+1] = arr[i] ^ arr[i+1];
                    arr[i] = arr[i] ^ arr[i+1];
                }
            }
            // 内层for循环没有交换任何元素，直接跳出外层循环
            if (!flag) {
                break;
            }
            System.out.println("第 " + (j+1) + " 轮: " + printArray(arr));
        }
        System.out.println("冒泡处理后:" + printArray(arr) + " 经过了 " + count + " 次.");
    }



    /** 查看int数组的元素内容 */
    static String printArray(int[] arr) {
        String result = "{";
        String chr = ",";

        for(int child : arr) {
            result += child + chr;
        }
        result = result.substring(0, result.length() -1) + "}";
        // System.out.println("查看数组结构: " + result);
        return result;
    }
}