package arithmetic.sort;

import java.util.Random;

/**
 * @Description
 * @Author ZTwo
 * @Date 2021/5/2 17:50
 */
public class QuerySort {

    public static <E extends Comparable<E>> void sort(E[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static <E extends Comparable<E>> void sort(E[] arr, int left, int right) {
        //递归结束条件
        if (left >= right) return;

        int p = partation(arr, left, right);
        //左边排序
        sort(arr, left, p);
        //右边排序
        sort(arr, p + 1, right);
    }

    private static <E extends Comparable<E>> int partation(E[] arr, int left, int right) {
        //小于v的区间[l+1,j]
        //大于v的区间[j+1,i-1]
        int j = left;
        swap(arr, left, new Random().nextInt(right - left + 1) + left);
        for (int i = j + 1; i <= right; i++) {
            if (arr[i].compareTo(arr[left]) < 0) {
                j++;
                swap(arr, i, j);
            }
        }
        swap(arr, left, j);
        return j;
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
