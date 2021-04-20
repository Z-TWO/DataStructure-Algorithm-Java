package arithmetic.sort;

import java.util.Arrays;

/**
 * @Description
 * @Author ZTwo
 * @Date 2021/4/17 23:15
 */
public class SelectSort {
    public static <E extends Comparable<E>> void sort(E[] arr) {
        //获取每次剩余中的最小值
        for (int i = 0; i < arr.length; i++) {
            //记录每次最小值下标
            int index = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[index]) < 0) {
                    index = j;
                }
            }
            swap(arr, i, index);
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
