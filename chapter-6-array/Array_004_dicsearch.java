import java.util.Scanner;

public class Array_004_dicsearch {
    public static void main(String[] args) {
        practice_dicsearch();
    }

    /** 二分查找 */
    static void practice_dicsearch() {
        /**
        请对一个有序数组进行二分查找 {1, 8, 10, 89, 1000, 1234}
        输入一个数看看该数组中是否存在该数, 如果有输入下标值, 如果没有旧提示 "没有这个数"
        思路: 
        1.每次去取中间位置的数进行比较, 判断该数 落在左边还是右边
        2.当开始位置与中间位置重合,代表已经二分到最接近的2个位置了。
        3.拿出这两个位置的值直接比较即可。
         */
        int[] arr = {1, 8, 10, 89, 1000, 1234};
        int center = arr.length / 2; // 中间位置
        int start = 0; // 开始位置
        int end = arr.length - 1; // 结束位置

        Scanner sc = new Scanner(System.in);
        System.out.print("\n输入要查找的数: ");
        int val = sc.nextInt();
        boolean isFound = false;
        while (start <= end) {
            if (val < arr[center]) {
                // 落在前面区域
                System.out.println("落在前面区域");    
                end = center;
            } else {
                // 落在后面区域
                System.out.println("落在后面区域");    
                start = center;
            }
            // 折中
            center = (start + end)/2;

            if (start == center) {
                // 到最接近的2个位置了，直接拿值比较
                if (arr[start] == val) {
                    isFound = true;
                } else if (arr[end] == val){
                    isFound = true;
                    center = end;
                }
                break;
            }
        }
        
        if (isFound) {
            System.out.println("值: " + val + "找到了 下标为: " + center);
        } else {
            System.out.println("没有这个数");
        }
    }
}