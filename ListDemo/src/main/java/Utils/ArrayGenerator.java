package Utils;

import java.util.Random;

/**
 * @Description 自动生成数组
 * @Author ZTwo
 * @Date 2021/4/17 22:49
 */
public class ArrayGenerator {

    public static Integer[] generateOrderArray(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    //生成一个长度为n的随机数组，每个数字的范围是[0,n]
    public static Integer[] generateRandomArray(int n) {
        Integer[] arr = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n);
        }
        return arr;
    }
}
